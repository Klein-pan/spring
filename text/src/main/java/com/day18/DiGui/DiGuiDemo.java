package com.day18.DiGui;

public class DiGuiDemo {
    public static void main(String[] args) {
        //计算1-5之间的和
        int num = 5;
        //调用求和方法
        int  sum = getsum(5);
        //输出结果
        System.out.println(sum);
    }

    private static int getsum(int i) {
        if (i==1){
            return 1;
        }
      return i+getsum(i-1);
    }
}
