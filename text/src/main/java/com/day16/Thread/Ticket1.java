package com.day16.Thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket1 implements Runnable {
    //门票数
    private int ticket = 100;

    Lock lock = new ReentrantLock();
    /**
     * 执行卖票
     */
    public void run() {
        //每个窗口卖票的操作
        //窗口永远开启
            lock.lock();
            while (true) {
                if (ticket > 0) {//有票
                    //出票操作
                    //使用sleep模拟一下出票时间
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //获取当前线程名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticket--);

                }
               lock.unlock();
            }
        }
}
