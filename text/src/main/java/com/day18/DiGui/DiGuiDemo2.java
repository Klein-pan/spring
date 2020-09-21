package com.day18.DiGui;

import java.io.File;

public class DiGuiDemo2 {
    public static void main(String[] args) {
        //创建File目录
        File file = new File("D:\\ElasticSearch");
        // 调用打印目录方法
        printDri(file);
    }

    private static void printDri(File dri) {
        // 获取子文件和目录
        File[] files = dri.listFiles();
        // 循环打印
      	/*
      	  判断:
      	  当是文件时,打印绝对路径.
      	  当是目录时,继续调用打印目录的方法,形成递归调用.
      	*/
        for (File file : files) {
            if (file.isFile()){
                // 是文件,输出文件绝对路径
                System.out.println("文件"+file.getAbsolutePath());
            }else if (file.isDirectory()){
                // 是目录,输出目录绝对路径
                System.out.println("目录"+file.getAbsolutePath());
                // 继续遍历,调用printDir,形成递归
                printDri(file);
            }
        }
    }
}
