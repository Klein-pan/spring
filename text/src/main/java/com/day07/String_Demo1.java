package com.day07;

public class String_Demo1 {
    public static void main(String[] args) {
        //Create String Object
        String s0 ="hello";
        String s1 ="hello";
        String s2 ="Hello";
        //比较字符串内容是否相同 区分大小写
        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s2));
        System.out.println("----------");
        //比较字符串内容是否相同 不区分大小写
        System.out.println(s0.equalsIgnoreCase(s1));
        System.out.println(s0.equalsIgnoreCase(s2));

    }
}
