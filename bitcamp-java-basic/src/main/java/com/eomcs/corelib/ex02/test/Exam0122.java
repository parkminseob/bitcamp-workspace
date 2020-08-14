package com.eomcs.corelib.ex02.test;
// String.equlas() vs Object.equals()
public class Exam0122 {
  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    System.out.println(m1 == m2); //f

    // Object에서 상속받은 equals()를 오버라이딩 하지 않았다.
    // 따라서 단순히 인스턴스가 같은지를 비교한다.
    System.out.println(m1.equals(m2)); //f
  }
}
