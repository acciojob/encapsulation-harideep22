package com.driver;


public class Main {
  public static void main(String[] args){
    RWOnly r1=new RWOnly();
//    r1.name="Hari";
//    System.out.println(r1.name);  //name has private access in com.driver.RWOnly
      r1.setName("Hari");
      System.out.println(r1.getName());
  }
}