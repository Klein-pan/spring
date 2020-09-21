package com.day20.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeListDemo {
   	public static void main(String [] args)   {
		ArrayList<Employee> list  = new ArrayList<Employee>();
    	Employee e = new Employee();
    	e.name = "zhangsan";
    	e.address = "beiqinglu";
    	e.age = 20;
		Employee e1 = new Employee();
		e.name = "lisi";
		e.address = "shanghai";
		e.age = 20;
		Employee e2 = new Employee();
		e.name = "wangwu";
		e.address = "guangdong";
		e.age = 20;
		list.add(e);
		list.add(e1);
		list.add(e2);
    	try {
      		// 创建序列化流对象
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
        	// 写出对象
        	out.writeObject(list);
        	// 释放资源
        	out.close();
        	System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch(IOException i)   {
            i.printStackTrace();
        }
   	}
}