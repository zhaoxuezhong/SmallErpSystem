package com.zxz.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zxz.pojo.User;
import com.zxz.utils.Constants;
import com.zxz.utils.CookieUtil;
import com.zxz.utils.RedisAPI;

public class SysInterceptor implements HandlerInterceptor {
	@Resource
	private RedisAPI redisAPI;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		User user = ((User) session.getAttribute(Constants.SESSION_USER));
		if (null == user) {
			CookieUtil cookieUtil=new CookieUtil();
			if(cookieUtil.existCookie(request, Constants.COOKIE_KEY)){
				String userString=cookieUtil.showCookies(request, Constants.COOKIE_KEY);
				User loginUser =(User) JSONObject.toJavaObject((JSON)JSON.parse(userString), User.class);
				if(loginUser!=null){
					session.setAttribute(Constants.SESSION_USER, loginUser);
					return true;
				}
			}
			response.sendRedirect(request.getContextPath() + "/401.html");
			return false;
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}
}
