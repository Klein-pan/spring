package com.day07;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        //Accept Data
        int a = sc.nextInt();
        //Accept Data
        System.out.println("请输入第二个数据");
        //Output Data
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("两数相加的结果为:"+sum);
    }

}
