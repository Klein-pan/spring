package com.day18.DiGui;

public class DiGuiDemo1 {
    public static void main(String[] args) {
        int n = 3;
        int value = getvalue(3);
        System.out.println(value);
    }

    private static int getvalue(int i) {
        if (i==1){
            return 1;
        }
        return i*getvalue(i-1);
    }
}
