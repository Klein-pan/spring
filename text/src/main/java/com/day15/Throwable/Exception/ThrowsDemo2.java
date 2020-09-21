package com.day15.Throwable.Exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo2 {
    public static void main(String[] args)throws FileNotFoundException,IOException {
        read("a.txt");
    }


    public static void read (String path)throws FileNotFoundException,IOException{
        if (!path.equals("a.txt")){
            throw  new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")){
            throw new IOException("IO流异常");
        }
    }
}
