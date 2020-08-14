package com.eomcs.corelib.ex02.test;
// String - hashCode()
public class Exam0130 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1.hashCode() == s2.hashCode()); //t
    //String 클래스에서 hashCode()는 문자열이 같으면 같은 hashCode()를
    //리턴하도록 오버라이딩 되어있다.
  }
}
