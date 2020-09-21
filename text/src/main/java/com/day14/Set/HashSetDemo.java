package com.day14.Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建set集合
        HashSet<String> set = new HashSet<String>();

        //添加元素
        set.add(new String("a"));
        set.add("b");
        set.add("c");
        set.add("a");
        //遍历
        for (String s : set) {
            System.out.println(s);
        }
    }
}
