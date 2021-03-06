package com.eomcs.corelib.ex01.test;
//equals 오버라이딩
public class Exam0134 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    System.out.println(sb1 == sb2);
    System.out.println(sb1.equals(sb2));
    // StringBuffer는 Object로부터 상속받은 equlas()를 오버라이딩 하지 않았다.
    // Object의 equals()는 데이터가 같은지를 비교하는 게 아니라
    // 인스턴스가 같은지를 비교한다.
  }
}
