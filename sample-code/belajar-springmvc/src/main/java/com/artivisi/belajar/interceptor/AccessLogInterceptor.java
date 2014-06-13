package com.artivisi.belajar.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AccessLogInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        if(currentUser == null){
            System.out.println("Anonymous mengakses url "+url);
        } else {
            Object p = currentUser.getPrincipal();
            if(User.class.isAssignableFrom(p.getClass())){
                System.out.println(((User)currentUser.getPrincipal()).getUsername() + " mengakses url "+url);
            } else {
                System.out.println("User "+ p + " mengakses url "+url);
            }
        }
        return true;
    }
}
