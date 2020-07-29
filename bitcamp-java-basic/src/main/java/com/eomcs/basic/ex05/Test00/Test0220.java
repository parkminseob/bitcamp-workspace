package com.eomcs.basic.ex05.Test00;

public class Test0220 {
  public static void main(String[] args) {
    double d1 = 987.6543;
    double d2 = 1.111111;
    System.out.println((d1 + d2) == 988.765411);
    // 결과가 false인 이유
    // IEEE 754에 따라 부동소수점 값에 왜곡이 생겼기 때문이다.
    
    System.out.println(d1 + d2); 
    //쓰레기 값이 붙음
    
    double x = 234.765411;
    double y = 754.0;
    System.out.println((x + y) == 988.765411);
    
    System.out.println(x + y);
    //=> 어떤 부동소수점은 쓰레기값이 붙지 않음.
    
    System.out.println((d1 + d2) == (x + y));
    //실무 프로그래밍에서 해결하는 법은?
    
    double EPSILON = 0.0000001;
    System.out.println(Math.abs(d1 + d2) - (x + y) < EPSILON);
    
    System.out.println(Math.abs(-100));
    System.out.println(Math.abs(100));
  }
}
