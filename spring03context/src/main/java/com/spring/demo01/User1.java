package com.spring.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user1")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope("singleton")
public class User1 {

    public String name ;

    @Value("秦疆")
    public void setName(String name) {
        this.name = name;
    }
}