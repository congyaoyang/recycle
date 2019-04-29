package com.qianfeng.ExceptionProxy;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SystemExceptionProxy {

    @ExceptionHandler(AuthorizationException.class)
    public String authException(){
        return "redirect:login.html";
    }


    @ExceptionHandler(AuthenticationException.class)
    public String authtificationException(){
        return "redirect:login.html";
    }
}
