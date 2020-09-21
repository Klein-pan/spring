package com.day21.TCP;

import java.io.*;
import java.net.Socket;

public class FileUPload_Client {
	public static void main(String[] args) throws Exception {
		// 1.创建流对象
		// 1.1 创建输入流,读取本地文件
		BufferedInputStream bis  = new BufferedInputStream(new FileInputStream("test.jpg"));
		System.out.println("客户端 发送数据");
		// 1.创建 Socket ( ip , port ) , 确定连接到哪里.
		Socket client = new Socket("localhost", 6666);
		// 2.通过Scoket,获取输出流对象
		OutputStream os = client.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		// 3.写出数据.
		byte [] b = new byte[1024];
		int len;
		while ((len=bis.read(b))!=-1){
			bos.write(b,0,len);
			bos.flush();
		}
		System.out.println("文件发送完毕");
		//3释放资源
		bos.close();
		client.close();
		bis.close();
		System.out.println("文件上传完毕");
	}
}