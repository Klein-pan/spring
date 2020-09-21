package com.day07;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
      //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串数据:");
        String s = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch>='A'&&ch<='Z'){
                bigCount++;
            }else if (ch>='a'&&ch<='z'){
                smallCount++;
            }else if (ch>='0'&&ch<='9'){
                numberCount++;
            }else {
                System.out.println("该字符"+ch+"非法");
            }
        }
        //输出结果
        System.out.println("大写字母:"+bigCount+"个");
        System.out.println("小写字母:"+smallCount+"个");
        System.out.println("数字字符:"+numberCount+"个");
    }
}
