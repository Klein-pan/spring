package com.day07;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //Create Student Array
        ArrayList<String>list = new ArrayList<String>();
        //Create Student Object
        String s0 = "曹操";
        String s1 = "刘备";
        String s2 = "孙权";
        //print Student ArrayList Aggregate
        System.out.println(list);
        //Student Object Assignment Student Array
        list.add(s0);
        list.add(s1);
        list.add(s2);
        //print Student ArrayList Aggregate
        System.out.println(list);
    }
}
