package com.day13.collection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoColllection {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();
        // 使用方法
        // 添加功能  boolean  add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);//[小李广, 扫地僧, 石破天]

        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));//判断  扫地僧 是否在集合中true

        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除石破天："+coll.remove("石破天"));//删除石破天：true
        System.out.println("操作之后集合中元素:"+coll);//操作之后集合中元素:[小李广, 扫地僧]

        // size() 集合中有几个元素
        System.out.println("集合中有"+coll.size()+"个元素");//集合中有2个元素

        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();
        // 遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);//小李广  扫地僧

        }

        // void  clear() 清空集合
        coll.clear();
        System.out.println("集合中内容为："+coll);//集合中内容为：[]
        // boolean  isEmpty()  判断是否为空
        System.out.println(coll.isEmpty());//true
    }
}

