package com.day15.Throwable.Exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args)throws IOException {
        try {
            read("a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("over");
    }


    public static void read (String path)throws IOException{

        if (!path.equals("b.txt")){
            throw new IOException("IO流异常");
        }
    }
}
