package com.eomcs.basic.ex05.Test00;

public class Test0460 {
  public static void main (String[] args) {
    
    //16진수 숫자를 직접 사용하면 코드를 직관적으로 이해하기 힘들다.
    //해결책
    //각각의 값을 의미있는 이름을 가진 변수에 저장후 사용하기.
    //조회용으로 사용할 것이기 때문에 상수로 선언.
    
    final int CSS           = 0x01;
    final int HTML          = 0x02;
    final int PHP           = 0x04;
    final int PYTHON        = 0x08;
    final int JAVASCRIPT    = 0x10;
    final int JAVA          = 0x20;
    final int CPP           = 0x40;
    final int C             = 0x80;
    
    //Java, C, CPP, JVS를 할 줄 아는 개발자의 정보
    int lang = C | JAVA | CPP | JAVASCRIPT;
    
    System.out.println(Integer.toBinaryString(lang));
    
  }

}
