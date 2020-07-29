package com.eomcs.basic.ex05.Test00;

public class Test0682 {
  public static void main(String[] args) {
    
    //주의
    // pre-fix 연산자나 pose-fix 연산자를 리터럴에 적용할 수 없음
    // int x = ++100; 안됌
    // x = 100++; 안됌!
    
    //변수와 동시 적용 불가
    int y = 100;
    
    ++y; //ok
    //++y++;
    //(++y)++;
  }
}
