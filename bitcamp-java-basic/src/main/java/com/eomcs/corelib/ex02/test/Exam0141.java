package com.eomcs.corelib.ex02.test;
// String - toString() 다형적 변수와 형변환
public class Exam0141 {
  public static void main(String[] args) {

    Object obj = new String("Hello"); //인스턴스 주소가 100번지라고 가정하자

    String x1 = (String)obj; // x1 <= 100

    obj.hashCode();

    // obj에 대해 toString()을 호출할 때,
    // => 일단 obj레퍼런스의 클래스에 선언된 멤버(필드,메서드)만 사용할 수 있다.
    // => 단 멤버는 실제 obj가 가리키는 클래스부터 찾아 올라간다.
    // => 위 예에서 obj가 가리키는 것은 String 이기 때문에
    // => 이런 경우 toString()을 호출할 때 String 클래스에서부터 찾는다.
    // => String 클래스가 toString()을 오버라이딩 했기 때문에
    // 결국 이 오버라이딩 메서드를 호출할 것이다.
    String x2 = obj.toString();

    System.out.println(x1 == x2); //t
  }
}
