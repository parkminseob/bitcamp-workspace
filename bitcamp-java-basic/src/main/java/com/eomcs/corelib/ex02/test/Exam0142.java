package com.eomcs.corelib.ex02.test;
// String - 다형적 변수와 형변환
public class Exam0142 {
  public static void main(String[] args) {

    Object obj = new String("Hello");

    // obj가 String 객체를 가리키더라도
    // obj의 타입이 Object이기 때문에 Object에 선언한 멤버만 사용할 수 있다.
    // obj가 가리키는 원래 클래스의 메서드를 호출하고 싶다면
    // 다음과 같이 원래 타입으로 형변환하라.
    String str = ((String) obj).toLowerCase(); //모든 대문자를 소문자로변환해서 출력
    System.out.println(str);

    String x1 = (String) obj;
    str = x1.toLowerCase();
    System.out.println(str);
  }
}
