package com.day16.Thread;

public class Demo1 {
    public static void main(String[] args) {
        //创建线程对象
        Ticket1 t = new Ticket1();
        //创建三个窗口对象
        Thread t1 = new Thread(t,"窗口1");
        Thread t2 = new Thread(t,"窗口2");
        Thread t3 = new Thread(t,"窗口3");
        //同时买票
        t1.start();
        t2.start();
        t3.start();
    }
}
