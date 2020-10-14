package com.spring.demo03;

import com.spring.demo03.Host;
import com.spring.demo03.Rent;

//客户类，一般客户都会去找代理！
public class Client {
   public static void main(String[] args) {
       //房东要租房
       Host host = new Host();
       //new一个Handler
       ProxyInvocationHandler pih = new ProxyInvocationHandler();

       pih.setRent(host);

       Rent proxy = (Rent) pih.getProxy();
       proxy.rent();
       proxy.getMoney();

   }
}