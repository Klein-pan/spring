package com.day07;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        //Create Aggregte Object
        ArrayList<String>list = new ArrayList<String>();
        //add element
        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println("get:"+list.get(0));
        System.out.println("get:"+list.get(1));
        System.out.println("get:"+list.get(2));

        System.out.println("size:"+list.size());
        System.out.println("remove:"+list.remove(0));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
