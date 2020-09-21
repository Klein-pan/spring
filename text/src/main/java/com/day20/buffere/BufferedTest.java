package com.day20.buffere;

import java.io.*;
import java.util.HashMap;

public class BufferedTest {
    public static void main(String[] args) {
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<String, String>();
        BufferedReader br  =null;
        BufferedWriter bw = null;

        try {
            //创建流对象
            br = new BufferedReader(new FileReader("a.txt"));
            bw = new BufferedWriter(new FileWriter("b.txt"));
            // 定义字符串,保存读取的一行文字
            String line  = null;
            // 循环读取,读取到最后返回null
            while ((line = br.readLine())!=null){
                String[] split = line.split("\\.");
                System.out.println(split[0]);
                lineMap.put(split[0],split[1]);
            }
            for (int i = 1; i <= lineMap.size(); i++) {
                String key = String.valueOf(i);
                System.out.println("key:"+key);
                String value = lineMap.get(key);
                //写出拼接符号
                bw.write(key+"."+value);
                //写出换行
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (bw!=null){
                    bw.close();
                }
                if (br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
