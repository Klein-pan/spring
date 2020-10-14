package com.springtest;

import com.springtest.pojo.Student;
import com.springtest.pojo.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest01 {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());

    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student1");

        student.show();

    }

    @Test
    public void test03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student2");

        student.show();

    }

    @Test
    public void test04() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = (User1) context.getBean("userp");
        System.out.println(user);
    }

    @Test
    public void test05() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = (User1) context.getBean("user");
        User1 user2 = (User1) context.getBean("user");
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user==user2);
    }
}