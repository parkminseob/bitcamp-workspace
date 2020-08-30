package com.eomcs.oop.ex03.test;

// 클래스 변수 활용 후

// 상수를 사용하면 의미있는 이름으로 변수를 만들고 저장하는것이 가능하다
// 조회용으로 사용할 때는 final로 선언한다.
// 보통 조회용으로 사용하는 변수는 공개해도 되기 때문에 public으로 선언한다!
// 모든 인스턴스가 같은 값을 가질 경우 클래스 변수로 만드는게 좋다.
// Member와 관련된 상수라면
// Member 클래스에 선언하는것이 유지 보수에 더 낫다.

public class Exam0161 {
  
  static class Member{
    String id;
    String password;
    int type;

    public static final int GUEST = 0;
    public static final int MEMBER = 1;
    public static final int MANAGER = 2;
    
  }
  public static void main(String[] args) {
    
    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = Member.GUEST;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.type = Member.MANAGER;

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "1111";
    m3.type = Member.MEMBER;
  }
}
