package com.day07;

public class String_Demo3 {
    public static void main(String[] args) {
        String s = "abcde";

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        System.out.println("-----------");

        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("------------");

        String str = "itcast itheima";
        String replace = str.replace("it", "IT");
        System.out.println(replace);
        System.out.println("-------------");


        String s0 = "aa|bb|cc";
        String[] split = s0.split("|");
        for (int i = 0; i <split.length ; i++) {
            System.out.print(split[i]);
        }
    }
}
