package com.day16.Thread;

public class Ticket2 implements Runnable {
    //门票数
    private int ticket = 100;

    Object lock = new Object();
    /**
     * 执行卖票
     */
    public void run() {
        //每个窗口卖票的操作
        //窗口永远开启
            while (true) {
                sellTicket();
        }
    }
    private synchronized void sellTicket(){

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
        }
    }

