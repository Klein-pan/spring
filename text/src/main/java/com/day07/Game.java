package com.day07;

import java.util.ArrayList;

public class Game {
    public static int number;
    public static ArrayList<String>list;

    static {
        //给类变量赋值
        number = 2;
        list = new ArrayList<String>();
        //添加元素到集合中
        list.add("张三");
        list.add("李四");
    }
}
