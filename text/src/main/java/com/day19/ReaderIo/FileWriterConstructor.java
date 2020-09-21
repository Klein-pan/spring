package com.day19.ReaderIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConstructor {
    public static void main(String[] args) throws IOException {
   	 	// 使用File对象创建流对象
        File file = new File("a.txt");
        FileWriter fw = new FileWriter(file);
        // 字符串转换为字节数组
        char[] chars = "黑马程序员".toCharArray();
        // 写出字符数组
        fw.write(chars);//黑马程序员
        // 写出从索引2开始，2个字节。索引2是'程'，两个字节，也就是'程序'。
        fw.write(chars,2,2);

        // 使用文件名称创建流对象
       // FileWriter fw = new FileWriter("b.txt");
        fw.close();
    }
}