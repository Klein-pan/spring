package com.spring.demo03;


//真实角色: 房东，房东要出租房子
public class Host implements Rent{
   public void rent() {
       System.out.println("房屋出租");
  }
  public void getMoney(){
      System.out.println("房东收到房租");
  }
}