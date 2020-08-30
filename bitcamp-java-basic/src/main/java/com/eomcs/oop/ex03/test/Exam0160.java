package com.eomcs.oop.ex03.test;

// 클래스 변수 활용 전 
public class Exam0160 {
  
  static class Member{
    String id;
    String password;
    int type;
  }
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = 0;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.type = 2;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "1111";
    m3.type = 1;
    
    // 회원 타입을 지정할 때 숫자로 지정한다.
    // 하지만 숫자는 의미를 기억하기 힘들다
    // 이를 해결하기 위해 상수를 사용한다.
  }
}
