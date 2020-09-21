package com.day15.Thread;

public class MyThread extends Thread {
    //定义指定线程名称的构造方法
    public MyThread(String name){
        //调用父类的String参数的构造方法，指定线程的名称
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"正在执行！"+i);
        }
    }
}
