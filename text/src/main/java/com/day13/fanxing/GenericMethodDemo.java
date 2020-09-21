package com.day13.fanxing;

public class GenericMethodDemo {
    public static void main(String[] args) {
        // 创建对象
        MyGenericMethod mm = new MyGenericMethod();
        // 演示看方法提示
        mm.show("aaa");//class java.lang.String
        mm.show(123);//class java.lang.Integer
        mm.show(12.45);//class java.lang.Double

    }
}