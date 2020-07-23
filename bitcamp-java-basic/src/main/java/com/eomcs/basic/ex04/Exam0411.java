// 정수 변수 - 변수의 메모리 크
package com.eomcs.basic.ex04;

public class Exam0411 {
  public static void main(String[] args) {
    
    //바이트 크기의 정수 값을 담을 메모리 준비
    byte b;
    
    // 값을 메모리에 저장하려면 1과 0, 2진수 형태로 바꿔야 한다.
    // 정수를 2진수로 바꿀 때 '2의 보수' 방식을 사용한다.  
    b = -128;
    b = 127;
    
    short s;
    
    s = -32768;
    s = 32767;
    
    int i;
    
    i = -2147483648;
    i = 2147483647;
    
    long l;
    
    l = -9223372036854775808L;
    l = 9223372036854775807L;

  }
}
