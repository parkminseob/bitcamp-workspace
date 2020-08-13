package com.eomcs.corelib.ex01.test;
// Object 클래스 - getClass() : 해당 클래스의 정보를 리턴한다.
public class Exam0160 {
  static class My {

  }
  public static void main(String[] args) {
    My obj1 = new My();
    // 레퍼런스를 통해 인스턴스의 클래스 정보를 알아낼 수 있다.
    Class<?> classInfo = obj1.getClass();

    System.out.println(classInfo.getName());
    System.out.println(classInfo.getSimpleName());
  }
}
