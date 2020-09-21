package com.day07.Math;

public class MathTest {
    public static void main(String[] args) {
        double d0 = Math.abs(-5);//d0=5
        double d1 = Math.abs(5);//d1=5

       double c0= Math.ceil(3.3);//4.0
       double c1= Math.ceil(-3.3);//-3.0
       double c2= Math.ceil(5.1);//6.0

       double f0= Math.floor(3.3);//3.0
       double f1= Math.floor(-3.3);//-4.0
       double f2= Math.floor(5.1);//5.0

        long r0 = Math.round(5.5);//5.0
        long r1 = Math.round(5.6);//6.0
    }
}
