package com.day07.Arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        //定义int 数组
        int[]arr = {2,34,35,4,657,8,69,9};
        //打印数组，输出地址值
        System.out.println(arr);
        //数组内容转化为字符串
        String s = Arrays.toString(arr);
        //打印字符串，输出内容
        System.out.println(s);
    }
}
