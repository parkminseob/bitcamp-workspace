package com.eomcs.basic.ex05.Test00;

public class Test0510 {
  public static void main(String[] args) {
    
    // 조건연산자 ?
    // 조건 ? 표현식1 : 표현식2
    // 참이면 1
    // 거짓이면 2를 실행
    
    int gender = 1;
    
    String message = (gender == 1) ? "여" : "남";
    System.out.printf("%d은 %s자이다.", gender, message);
    
    
  }
}
