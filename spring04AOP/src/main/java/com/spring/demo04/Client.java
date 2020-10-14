package com.spring.demo04;

import com.spring.demo02.UserService;
import com.spring.demo02.UserServiceImpl;


//客户类，一般客户都会去找代理！
public class Client {
   public static void main(String[] args) {
       UserServiceImpl userService = new UserServiceImpl();
       //获取启动器
       ProxyInvocationHandler pih = new ProxyInvocationHandler();
       //设置被代理类
       pih.setTarget(userService);
       //获取动态代理类
       UserService proxy = (UserService) pih.getProxy();
       proxy.delete();
   }
}