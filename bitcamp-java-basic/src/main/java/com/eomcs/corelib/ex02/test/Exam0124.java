package com.eomcs.corelib.ex02.test;
// StringBuffer - 문자열 비교
public class Exam0124 {
  public static void main(String[] args) {

    StringBuffer b1 = new StringBuffer("Hello");
    StringBuffer b2 = new StringBuffer("Hello");

    System.out.println(b1 == b2); //f

    // StringBuffer는 Object에서 상속받은 equlas()메서드를 오버라이딩하지 않았다.
    System.out.println(b1.equals(b2)); //f

  }
}
