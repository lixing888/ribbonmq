package com.auth;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
@Configuration
public class AuthAspect {

    @Before("@annotation(com.auth.Auth)")
    public void Before(){
        //从session中拿到当前登录人
        //去数据库白名单对比结果，验证是否需要放行
        System.out.println("拦截了");
    }
}
