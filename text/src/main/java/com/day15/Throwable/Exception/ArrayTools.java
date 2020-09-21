package com.day15.Throwable.Exception;

public class ArrayTools {

    //对给定的数组通过给定的角标获取数据
    public static int getElement(int[] arr, int index){
        /** 根据 索引找到数组中对应的元素 */
        if (index<0||arr.length-1<index){
            /*判断条件如果满足，当执行完throw抛出异常对象后，方法已经无法继续运算。
            这时就会结束当前方法的执行，并将异常告知给调用者。这时就需要通过异常来解决。 */
            throw  new ArrayIndexOutOfBoundsException("哥们，角标越界了");
        }
       int element =  arr[index];
       return element;
    }

}
