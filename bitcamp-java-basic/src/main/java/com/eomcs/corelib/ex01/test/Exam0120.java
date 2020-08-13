//toString() 메서드
package com.eomcs.corelib.ex01.test;

public class Exam0120 {
  static class My {

  }
  public static void main(String[] args) {
    My obj = new My();

    // toString()
    //  클래스 정보를 간단히 출력한다.
    //  패키지명.클래스명@16진수해시값

    System.out.println(obj.toString());

    // println()에 넘겨주는 값이 String타입이 아니라면
    // println()은 그 객체에 대해 toString()을 호출한 후 그 리턴 값을 출력한다.
    // 따라서 위는 아래코드와 같다.
    System.out.println(obj);

    // 해시값?
    // 인스턴스마다 부여된 고유의 식별자 (주소아님!!!)
    // hashCode()를 오버라이드 하지 않고 원래 메서드를 그대로 쓰면
    // 무조건 인스턴스마다 새 해시값이 부여된다.

    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);

    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }
}
