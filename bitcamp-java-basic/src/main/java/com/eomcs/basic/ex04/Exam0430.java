package com.eomcs.basic.ex04;

public class Exam0430 {
  public static void main(String[] args) {
    char c;
    
    c = 0;
    c = 65535;
    // c = -1;
    // c = 65536; 4바이트를 2바이트 메모리에 넣을 수 없다
    
    c = 65;
    c = 0x42;
    c = 0b1000011;
    System.out.println(c);
    
    short s = 65;
    System.out.println(s);

    c = '헐'; // '' 연산자는 문자의 유니코드 값을 리턴한다.
    System.out.println(c);

    int i = '헐';
    System.out.println(i);
    
    for (int x = 65; x < 80; x++) {
      System.out.println((char)x);
    }
    
    boolean b1, b2;
    b1 = true;
    b2 = false;
    
    System.out.println(b1);
    System.out.println(b2);
    
    // 논리 값은 정수로 다룰 수 없다!!!!!!!
    // i = b1;
    // i = b2;
    // b1 = 1;
    // 컴퓨터에서 true false를 1과 0으로 저장하지만 정수로 바꿀수없음!!
    // int 변수에 char변수를 넣을 수 있다.
    
    byte b;
    b = 12;
    b = 38;
  }
}
