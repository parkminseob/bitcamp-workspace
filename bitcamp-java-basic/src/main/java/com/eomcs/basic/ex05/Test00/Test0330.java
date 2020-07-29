package com.eomcs.basic.ex05.Test00;

public class Test0330 {
  public static void main(String[] args) {
    
    //&&와 &비교 
    
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true);
    
    // 왼쪽에 이미 false라서 결과는 확정, b를 실행하지 않음.
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    
    a = false;
    b = false;
    r = a & (b = true);
    // 값이 이미 확정되었더라도 끝까지 실행한다.
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
  }
}
