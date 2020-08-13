package com.eomcs.corelib.ex01.test;
// toString() 오버라이딩
public class Exam0121 {
  static class My {
    String name;
    int age;
    //개발을 하다 보면 인스턴스의 현재 값을 간단히 확인하고 싶을 때가 있다.
    // 그럴 때 toString()을 오버라이딩 하자.
    @Override
    public String toString() {
      return "My3 [name=" + name + ", age=" + age + "]";
  }
  }
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;

    System.out.println(obj1.toString());
    //오버라이딩 된 toString 메소드값 호출됨
    System.out.println(obj1);
  }
}
