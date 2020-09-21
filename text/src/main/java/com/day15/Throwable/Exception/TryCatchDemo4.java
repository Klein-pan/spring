package com.day15.Throwable.Exception;


import java.io.IOException;

public class TryCatchDemo4 {
    public static void main(String[] args)throws IOException {
        try {
            read("a.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("不管程序怎样，这里都将会被执行。");
        }
        System.out.println("over");
    }


    public static void read (String path)throws IOException{

        if (!path.equals("b.txt")){
            throw new IOException("IO流异常");
        }
    }
}
