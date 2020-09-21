package com.day15.Throwable.Exception;
// 业务逻辑异常
public class RegisterException extends Exception {
    /*** 空参构造 */
    public RegisterException(){

    }
    public RegisterException(String message){
        super(message);
    }
}
