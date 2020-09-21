package com.day20.Serializable;

import sun.awt.image.ImageWatched;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializeListDemo {
   public static void main(String [] args)   {
        ArrayList<Employee> list = new ArrayList<Employee>();
        try {		
             // 创建反序列化流
             FileInputStream fileIn = new FileInputStream("list.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn);
             // 读取一个对象
             list = (ArrayList<Employee>) in.readObject();
             // 释放资源
             in.close();
             fileIn.close();
        }catch(IOException i) {
             // 捕获其他异常
             i.printStackTrace();
             return;
        }catch(ClassNotFoundException c)  {
        	// 捕获类找不到异常
             System.out.println("Employee class not found");
             c.printStackTrace();
             return;
        }
        System.out.println(list.get(1).address);
        for (Employee e : list) {
             // 无异常,直接打印输出
             System.out.println("Name: " + e.name);	// zhangsan
             System.out.println("Address: " + e.address); // beiqinglu
             System.out.println("age: " + e.age); // 0
        }

    }
}