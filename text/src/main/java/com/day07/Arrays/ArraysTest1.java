package com.day07.Arrays;

import java.util.Arrays;

public class ArraysTest1 {
    public static void main(String[] args) {

        //定义int 数组
        int[]arr = {2,34,35,4,657,8,69,9};
        System.out.println("排序前:"+Arrays.toString(arr));//排序前
        //升序排序
        Arrays.sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));//排序后

    }
}
