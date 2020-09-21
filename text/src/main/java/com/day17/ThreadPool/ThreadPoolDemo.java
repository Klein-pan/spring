package com.day17.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);//包含两个对象
        //创建Runnable实例对象
        MyRunnable r = new MyRunnable();
        service.submit(r);
        service.submit(r);
        service.submit(r);

    }
}
