package com.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest2 {
    public static void main(String[] args) {
        //Create ArrayList
        List<Integer> list = new ArrayList<Integer>();
        //Create Random
        Random r = new Random();
        for (int i = 0; i <6 ; i++) {
            int number = r.nextInt(34);
            list.add(number);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
