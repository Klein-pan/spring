package com.day19.batyIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PicCopy {
    public static void main(String[] args) throws IOException{
        // 使用文件名称创建流对象.
        FileInputStream fis = new FileInputStream("D:\\2_copy.jpg"); // 文件中为abcde
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("test.jpg");
        // 定义变量，作为有效个数
        int len;
        // 定义字节数组，作为装字节数据的容器
        byte[] b = new byte[1024];
        // 循环读取
        while (( len= fis.read(b))!=-1) {
            fos.write(b,0,len);
        }
        // 关闭资源
        fos.close();
        fis.close();
    }
}