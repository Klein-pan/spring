package com.day07;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <3 ; i++) {
            int a = r.nextInt(10);
            System.out.println(a);
        }

    }


}
