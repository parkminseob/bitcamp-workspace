package com.eomcs.oop.ex03;
// 클래스변수와 인스턴스변수 응용
public class Exam0150_a {
  static class Student {
    // 클래스 필드 = 스태틱 필드
    // 모든 인스턴스가 공유하는 값을 저장할 때는 스태틱 변수 사용
    static int count;

    // 인스턴스 필드 : 개별적으로 관리할 값
    String name;
    int age;
  }
   public static void main(String[] args) {
     //클래스 필드는 인스턴스 생성할 필요 없이 클래스 이름으로 바로 사용
     Student.count = 0;

     Student s1 = new Student();
     s1.name = "홍길동";
     s1.age = 10;

     Student.count++;

     Student s2 = new Student();
     s2.name = "임꺽정";
     s2.age = 20;

     Student.count++;

     System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
     System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
   }

}
