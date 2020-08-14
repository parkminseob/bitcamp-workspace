package com.eomcs.corelib.ex02.test;
// 오토박싱/오토언박싱 응용
public class Exam0223 {
  static class Member {
    String name;
    String tel;

    @Override
    public String toString() {
      return name + ","+tel;
    }
  }
  public static void main(String[] args) {
    int i = 100;

    Member member = new Member();
    member.name = "홍길동";
    member.tel = "010-2222-1111";

    String str = new String("Hello");

    // 자바가 오토박싱/오토언박싱 기능을 제공함으로써
    // primitive data type 또는 클래스의 인스턴스 구분없이 값을
    // 편하게 저장할 수 있게되었다.

    //다형적 변수 문법에 따라 상위 클래스의 레퍼런스에 저장할 수 있다.
    Object obj;
    obj = member;
    System.out.println(member);
    obj = str;
    System.out.println(str);


    obj = i; // auto-boxing 규칙에 따라 Integer.valueOf(i) 문장으로 변환한다.
    Integer obj2 = (Integer)obj;

    System.out.println(i);
    System.out.println(obj);
  }
}
