package com.eomcs.basic.ex05.Test00;

public class Test0340 {
  public static void main(String[] args) {
    
    // ||와 | 비교
    boolean a = true;
    boolean b = false;
    boolean r = a || (b = true);
    
    // 왼쪽 값으로 이미 결과를 알 수 있어서 오른쪽은 실행하지 않음.
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    
    a = true;
    b = false;
    r = a | (b = true);
    // 결과를 알 수 있더라도 끝까지 문장을 실행한다.
    
    System.out.printf("a=%b, b=%b, r=%b", a, b, r);
    
  }
}
