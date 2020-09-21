package com.day07;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您猜的数字(范围1-100):");
            int i = sc.nextInt();
            if (i > number){
                System.out.println("您猜的数字大了");
            }else if (i < number){
                System.out.println("您猜的数字小了");
            }else if (i==number){
                System.out.println("您猜对了数字是:"+i);
                break;
            }
        }

    }


}
