package com.day07.Arrays;

import java.util.Arrays;

public class ArraysTest2 {
    public static void main(String[] args) {

        //定义随机字符串
        String line = "ysHasdwfsfainfwasda";
        //转化为字符数组
        char[] chars = line.toCharArray();
        //升序排序
        Arrays.sort(chars);
        //反向遍历
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
