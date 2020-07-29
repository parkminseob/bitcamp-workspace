package com.eomcs.basic.ex05.Test00;

public class Test0610 {
  public static void main(String[] args) {
    //증감연산 : 후위 연산자
    int i = 2;
    
    //i = i + 1; 이 식은 아래와 같다.
    i++; // i = 3
    i++; // i = 4
    
    System.out.println(i); //4
    System.out.println(i++); //4
    System.out.println(i); //5
  }
}
