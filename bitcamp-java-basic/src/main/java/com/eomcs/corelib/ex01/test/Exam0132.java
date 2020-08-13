package com.eomcs.corelib.ex01.test;
// equals() 오버라이딩
public class Exam0132 {
  static class Member /*extends Object*/{
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  public static void main(String[] args) {
    Member m1 = new Member("홍길동",20);
    Member m2 = new Member("홍길동",20);

    // equals()
    // 이 메서드는 Object에 정의된 메서드로
    // 자바의 모든 클래스는 이 메서드를 사용할 수 있다.
    // 두개의 인스턴스가 같은 인스턴스인지 비교한다.

    System.out.println(m1.equals(m2)); //false
    System.out.println("--------------");

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2); //false

    System.out.println(s1.equals(s2)); //true

    //true인 이유?
    //String 클래스에서 Object의 toString()을 오버라이딩 했기 때문에
    //인스턴스가 달라도 문자열이 같으면 true를 리턴하도록 되어있다.
    //그래서 String에서 equals()를 호출하면 Member와 달리 true를 리턴한다.
    //Member 객체에 대해서도 데이터가 같다면 true를 리턴하도록 하려면?
    //toString을 오버라이딩해라!
  }
}
