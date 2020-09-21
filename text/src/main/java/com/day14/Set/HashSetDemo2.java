package com.day14.Set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>();
        //存储

        Student stu = new Student("于谦",43);
        set.add(stu);
        set.add(new Student("郭德纲",42));
        set.add(new Student("岳云鹏",18));
        Student stu2 = new Student("于谦",43);
        set.add(stu2);
        System.out.println(stu.hashCode());
        System.out.println(stu2.hashCode());
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
