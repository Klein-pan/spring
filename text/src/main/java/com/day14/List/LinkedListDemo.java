package com.day14.List;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> link = new LinkedList<String>();
        //添加元素
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        System.out.println(link);
        //获取元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        //删除元素
        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        System.out.println(link);
        while (!link.isEmpty()){
            System.out.println(link.pop());
        }
        System.out.println(link);

    }
}
