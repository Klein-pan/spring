package com.day15.Throwable.Exception;

import javax.security.auth.login.LoginException;

public class Demo {
    // 模拟数据库中已存在账号
    private static String[] names = {"bill","hill","jill"};

    public static void main(String[] args) {
        //调用方法
        try {
            checkUsername("bill");
            System.out.println("注册成功");

        }catch (RegisterException e){
            e.printStackTrace();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkUsername(String username) throws LoginException, RegisterException {
        for (String name : names) {
            if (name.equals(username)){
                throw new RegisterException("亲"+username+"已经注册过了");
            }
        }
        return true;
    }
}
