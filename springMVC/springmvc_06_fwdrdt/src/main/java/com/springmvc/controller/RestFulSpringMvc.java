package com.springmvc.controller;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestFulSpringMvc {
    @RequestMapping("/rsm/t1")
    public String test1(){
        System.out.println("123");
        //转发
        return "test";
    }

    @RequestMapping("/rsm/t2")
    public String test2(){
        //转发二
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test3(){
        //重定向
        return "redirect:/index.jsp";
    }
    //@RequestParam("username") : username提交的域的名称 .
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name){
        System.out.println(name);
        return "test";
    }

    @RequestMapping("/user")
    public String user(User user){
        System.out.println(user);
        return "test";
    }

}