package com.day21.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException {
        // 1.创建流对象
        // 1.1 创建输出流,创建本地文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis()+".jpg"));
        System.out.println("服务端启动 , 等待连接 .... ");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket ss = new ServerSocket(6666);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket server = ss.accept();
        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        // 4.一次性读取数据
        // 4.1 创建字节数组
        byte[] b = new byte[1024];
        // 4.2 据读取到字节数组中.
        int len = 0;
        while ((len = bis.read(b))!=-1){
            bos.write(b,0,len);
            bos.flush();
        }
        bos.close();
        bis.close();
        ss.close();
        System.out.println("文件上传已保存");
    }
}
