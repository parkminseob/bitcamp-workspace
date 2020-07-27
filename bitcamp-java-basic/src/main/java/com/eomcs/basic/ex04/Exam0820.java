package com.eomcs.basic.ex04;

public class Exam0820 {
  public static void main(String[] args) {
    
    int a = 100;
    
    {
      //int a = 200;
      a = 200;
      
      int b = 300;
    }
    System.out.println(a);
    
    
    //System.out.println(b);
    {
      int b = 400;
    }
    
    
  }

}
