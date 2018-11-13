package com.zxz.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

    //读取cookie数组，之后迭代出各个cookie
    public String showCookies(HttpServletRequest request,String name) throws Exception{
        Cookie[] cookies = request.getCookies();//根据请求数据，找到cookie数组
        if (null==cookies) {//如果没有cookie数组
            System.out.println("没有cookie");
        } else {
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name))
                return new String(cookie.getValue().getBytes("utf-8"));
            }
        }
        return "";
    }

    //是否存在cookie
    public boolean existCookie(HttpServletRequest request,String name) throws Exception{
        Cookie[] cookies = request.getCookies();//根据请求数据，找到cookie数组
        if (null!=cookies) {
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(name)){
                    return true;
                }
            }
        }
        return false;
    }

    //创建cookie，并将新cookie添加到“响应对象”response中。
    public void addCookie(HttpServletResponse response,String name,String value,int time){
        Cookie cookie = new Cookie(name,value);//创建新cookie
        cookie.setMaxAge(time);//5*60 设置存在时间为5分钟
        cookie.setPath("/");//设置作用域
        response.addCookie(cookie);//将cookie添加到response的cookie数组中返回给客户端
    }

    //修改cookie，可以根据某个cookie的name修改它（不只是name要与被修改cookie一致，path、domain必须也要与被修改cookie一致）
    public void editCookie(HttpServletRequest request,HttpServletResponse response,
                           String name,String value,int time){
        Cookie[] cookies = request.getCookies();
        if (null==cookies) {
            System.out.println("没有cookies");
        } else {
            for(Cookie cookie : cookies){
                //迭代时如果发现与指定cookieName相同的cookie，就修改相关数据
                if(cookie.getName().equals(name)){
                    cookie.setValue(value);//修改value
                    cookie.setPath("/");
                    cookie.setMaxAge(time);// 修改存活时间
                    response.addCookie(cookie);//将修改过的cookie存入response，替换掉旧的同名cookie
                    break;
                }
            }
        }
    }

    //删除cookie
    public void delCookie(HttpServletRequest request,HttpServletResponse response,String name){
        Cookie[] cookies = request.getCookies();
        if (null==cookies) {
            System.out.println("没有cookie");
        } else {
            for(Cookie cookie : cookies){
                //如果找到同名cookie，就将value设置为null，将存活时间设置为0，再替换掉原cookie，这样就相当于删除了。
                if(cookie.getName().equals(name)){
                    cookie.setValue(null);
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    break;
                }
            }
        }
    }
}
