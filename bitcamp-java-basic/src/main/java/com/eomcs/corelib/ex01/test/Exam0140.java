package com.eomcs.corelib.ex01.test;
//hashCode()에 대하여.
public class Exam0140 {
  static class My {
    String name;
    int age;
  }
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;

    // Object에서 상속받은 hashCode()는 인스턴스마다 고유의 4바이트 정수값을 리턴한다.
    // 이 값은 toString()의 출력 용으로 사용된다.
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));


    System.out.println(obj1);
    System.out.println(obj2);

    // hashcode가 필요한 이유
    // 목적? 데이터가 같은지 빠르게 비교하기 위함이다.
  }
}
