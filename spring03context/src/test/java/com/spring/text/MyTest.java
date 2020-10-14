package com.spring.text;

import com.spring.config.MyConfig;
import com.spring.demo01.Dog;
import com.spring.demo01.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        User1 user = (User1) applicationContext.getBean("user1");
        User1 user1 = (User1) applicationContext.getBean("user1");
        System.out.println(user.hashCode()==user1.hashCode());
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}