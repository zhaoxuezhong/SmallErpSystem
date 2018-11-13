package com.zxz.controller;

import java.sql.Timestamp;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zxz.pojo.User;
import com.zxz.service.user.UserService;
import com.zxz.utils.CaptchaUtil;
import com.zxz.utils.Constants;
import com.zxz.utils.CookieUtil;
import com.zxz.utils.SendEmail;

import net.sf.json.JSONObject;

/**
 * @author zhaoxuezhong
 *	LoginController
 */
@Controller
public class LoginController extends BaseController{
	@Resource
	private UserService userServiceImpl;
	
	@RequestMapping("404.html")
	public String p404(){
		return "404";
	}
	
	@RequestMapping("401.html")
	public String p401(){
		return "401";
	}
	
	@RequestMapping("500.html")
	public String p500(){
		return "500";
	}
	
	@RequestMapping("login.html")
	public String toLogin(){
		return "login";
	}
	
	@RequestMapping("/")
	public String root(){
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home(){
		return "frame";
	}
	
	@RequestMapping("/home/index.html")
	public String index(){
		return "index";
	}
	
	@RequestMapping("doLogin")
	public String doLogin(String userStr,String code,Boolean autoLogin,Model model,
			HttpSession session,HttpServletResponse response,HttpServletRequest request){
		String statusString="error";
		try {
			String codeString=(String) session.getAttribute(Constants.RANDOM_LOGIN);
			if(code==null||"".equals(code)||!code.equalsIgnoreCase(codeString)){
				model.addAttribute("status", "not");
				return "";
    		}
			User user=(User) JSONObject.toBean(JSONObject.fromObject(userStr),User.class);
			if(user==null||user.getCode()==null){
				model.addAttribute(Constants.LOGIN_ERROR, "未能检测到输入值！");
			}else{
				User reUser=userServiceImpl.login(user);
				if(reUser==null){
					model.addAttribute(Constants.LOGIN_ERROR, "通行证输入错误！");
				}else if(user.getPassword()==null||"".equals(user.getPassword())
						||!reUser.getPassword().equals(user.getPassword())){
					model.addAttribute(Constants.LOGIN_ERROR, "密码输入错误！");
				}else{
					CookieUtil cookieUtil=new CookieUtil();
					if(autoLogin){
						if(!cookieUtil.existCookie(request, Constants.COOKIE_KEY)){
							reUser.setPassword(null);
							String valueString=JSON.toJSONString(reUser);
							cookieUtil.addCookie(response, 
									Constants.COOKIE_KEY,valueString, 60*60*24*30);
						}
					}else{
						if(cookieUtil.existCookie(request, Constants.COOKIE_KEY)){
							cookieUtil.delCookie(request, response, Constants.COOKIE_KEY);
						}
					}
					session.setAttribute(Constants.SESSION_USER, reUser);
					User updateUser=new User();
					updateUser.setId(reUser.getId());
					updateUser.setLastLoginTime(new Timestamp(System.currentTimeMillis()));
					userServiceImpl.updateUser(updateUser);
					statusString="success";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute(Constants.LOGIN_ERROR, e.getMessage());
			statusString="exception";
		}
		model.addAttribute("status", statusString);
		return "";
	}
	
	@RequestMapping("logOut.html")
	public String logOut(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		User updateUser =new User();
		updateUser.setId(getCurrentUser().getId());
		updateUser.setLastLogOutTime(new Timestamp(System.currentTimeMillis()));
		userServiceImpl.updateUser(updateUser);
		this.setCurrentUser(null);
		session.removeAttribute(Constants.SESSION_USER);
		CookieUtil cookieUtil=new CookieUtil();
		cookieUtil.delCookie(request, response, Constants.COOKIE_KEY);
		return "redirect:login.html";
	}
	
	@RequestMapping("recoveryPassword")
	public String recoveryPassword(String mail,HttpSession session,Model model){
		try {
			User user=new User();
			user.setCode(mail);
			User reUser=userServiceImpl.login(user);
			if(reUser==null){
				model.addAttribute("status", "notFound");
				return "";
			}
			session.setAttribute("tempid", reUser.getId());
			//生成验证码
	        Random random = new Random();
	        StringBuffer buffer = new StringBuffer();
	        for (int i = 0; i < 6; i++) {
	            buffer.append(random.nextInt(10));
	        }
			if(!sendEmail(mail, session,buffer.toString())){
				model.addAttribute("status", "error");
				return "";
			}
			session.setAttribute(Constants.PASSWORD_CODE, buffer.toString());
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("status", "error");
			return "";
		}
		model.addAttribute("status", "success");
		return "";
	}
	
	private boolean sendEmail(String mailto ,HttpSession session,String code) throws Exception {
		String MailSubject = "你好，" + mailto ;
        String MailBody = "<h3>正在执行找回密码操作</h3>" +
                "<p style=\"font-size:20px;font-weight:bold;\">验证码： " + code + "</p>";
        SendEmail send = new SendEmail();
        return send.sendingMimeMail(mailto, null, null, MailSubject, MailBody);
    }
	
	@RequestMapping("verifyCode")
    public String verifyCode(String code,HttpSession session,Model model){
        try {
			String sessionCode=(String)session.getAttribute(Constants.PASSWORD_CODE);
			if(sessionCode.equals(code)){
				String vString=System.currentTimeMillis()+"";
				model.addAttribute("status", "success");
				model.addAttribute("v", vString);
				session.setAttribute(Constants.PASSWORD_V, vString);
			}else{
				model.addAttribute("status", "not");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("status", "error");
		}
        return "";
    }
	
	@RequestMapping("updatePassword")
    public String updatePassword(String password,String repassword,String v,HttpSession session,Model model){
		try {
			String codeString=(String) session.getAttribute(Constants.PASSWORD_V);
			if("".equals(v)||codeString==null||"".equals(codeString)||!v.equals(codeString)){
	        	model.addAttribute("status", "401");
	        	return "";
	        }
			if(password==null||repassword==null||"".equals(password)||"".equals(repassword)){
				model.addAttribute("msg", "密码不能为空");
				model.addAttribute("status", "not");
				return "";
			}
			if(!password.equals(repassword)){
				model.addAttribute("msg", "两次密码不一致");
				model.addAttribute("status", "not");
				return "";
			}
			User user=new User();
			user.setPassword(password);
			user.setId((Integer) session.getAttribute("tempid"));
			if(userServiceImpl.updateUser(user)){
				model.addAttribute("msg", "密码修改成功！");
				model.addAttribute("status", "success");
			}else{
				model.addAttribute("status", "500");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("status", "500");
		}
    	return "";
    }
	
	//生成验证码
    @RequestMapping(value = "random", method = RequestMethod.GET)
    @ResponseBody
    public String random(HttpServletRequest request, HttpServletResponse response,String flag) {
        try {
        	String key;
        	switch (flag==null?"":flag) {
			case "login":
				key=Constants.RANDOM_LOGIN;
				break;
			case "register":
				key=Constants.RANDOM_REGISTER;
				break;
			default:
				key=Constants.RANDOM_REGISTER;
				break;
			}
            CaptchaUtil.outputCaptcha(request, response,key);
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:404.html";
        }
    }
    
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(String userStr,String code,HttpSession session,Model model) {
    	try {
    		if(code==null||"".equals(code)||!code.equalsIgnoreCase((String) session.getAttribute(Constants.RANDOM_REGISTER))){
    			model.addAttribute("status", "not");
    			return "";
    		}
    		User user=(User) JSONObject.toBean(JSONObject.fromObject(userStr),User.class);
    		Integer id=userServiceImpl.addUser(user);
			if(id!=null&&id>0){
				model.addAttribute("status", "success");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("status", "error");
		}
    	return "";
    }
	
}
