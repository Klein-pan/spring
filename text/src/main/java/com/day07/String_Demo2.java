package com.day07;

public class String_Demo2 {
    public static void main(String[] args) {
    String s = "helloworld";

        System.out.println(s.length());
        System.out.println("---------");

        String s2 = s.concat("**hello itheima");
        System.out.println(s2);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("--------");

        System.out.println(s.indexOf("1"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("ak"));
        System.out.println("-----------");


        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("-----------");
    }
}
