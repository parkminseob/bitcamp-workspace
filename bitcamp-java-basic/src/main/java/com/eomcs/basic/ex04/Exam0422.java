package com.eomcs.basic.ex04;

public class Exam0422 {
  public static void main(String[] args) {
   
    double d;
    
    d = 9.99999999988888; 
    System.out.println(d);
    
    d = 9999999.88888888; // 소수점을 떼면 숫자의 개수가 15개이다.
    System.out.println(d);
    
    d = 99999999998888.8; // 소수점을 떼면 숫자의 개수가 15개이다.
    System.out.println(d);
    
    // 소수점을 뗐을 때 앞에 0만 있을 경우 그 0은 자릿수에서 제외한다.
    d = 0.00000999999999988888; // 소수점을 떼면 숫자가 21개 이지만, 앞의 0을 제외하면 실제 7개이다.
    System.out.println(d); // OK
    
    d = 9.999999999999997;
    System.out.println(d);
    
    d = 999999999999999.7; // 맨 뒤의 값이 반올림 되거나 잘린다.
    System.out.println(d);
  }
}
