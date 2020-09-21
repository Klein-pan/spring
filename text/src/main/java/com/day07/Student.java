package com.day07;

public class Student {
    private String name;
    private int age;
    private int sid;//学生id

    public static int numberOfStudent = 0;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        //通过numberOfStudent给学生分配学号
        this.sid = ++numberOfStudent;
    }
    //打印属性值
    public void show(){
        System.out.println("Student : name="+name+", age="+age+", sid="+sid);
    }
    public static void showNum(){
        System.out.println("num:"+ numberOfStudent);
    }

}

