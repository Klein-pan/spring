package com.day07;

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        //Accept Data
        int a = sc.nextInt();
        //Accept Data
        System.out.println("请输入第二个数据");
        //Accept Data
        int b = sc.nextInt();
        System.out.println("请输入第三个数据");
        //Accept Data
        int c = sc.nextInt();
        int temp = (a>b ? a : b);
        int max = (temp>c ? temp:c);
        System.out.println("max:"+max);

    }

}
