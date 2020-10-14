package com.spring.demo01;

import javax.annotation.Resource;

public class User {
    private String name = "panxiaowei";
    @Resource
    private Cat cat;
    @Resource
    private Dog dog;
   private String str;

   public Cat getCat() {
       return cat;
  }
   public Dog getDog() {
       return dog;
  }
   public String getStr() {
       return str;
  }
}