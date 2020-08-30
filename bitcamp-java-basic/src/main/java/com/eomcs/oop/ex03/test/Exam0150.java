package com.eomcs.oop.ex03.test;

public class Exam0150 {
  
  static class Student{
    
    // 스태틱 필드 = 클래스 필드 
    // 모든 인스턴스가 공유하는 값을 저장할 때는 클래스 변수를 사용
    static int count;
    
    String name;
    int age;
  }
  public static void main(String[] args) {
    
    // 클래스필드는 인스턴스를 생성할 필요 없이 클래스 이름으로 바로 사용
    Student.count = 0;
    
    //인스턴스 필드는 new명령을 수행해야지만 생성됨
    Student s1 = new Student();
    s1.name = "홍길동"; // 인스턴스 필드는 인스턴스 주소가 있어야만 접근 가능
    s1.age = 10;
    
    // 클래스 이름으로 인스턴스 필드에 접근할 수 없다.
    // A.name = "Hong"; 안됌!
    
    Student.count++;
    
    Student s2 = new Student();
    s2.name = "임꺽정";
    s2.age = 20;
    
    Student.count++;
    

    Student s3 = new Student();
    s3.name = "유관순";
    s3.age = 30;
    
    Student.count++; // 이처럼 클래스 필드는 클래스 이름으로 사용하라!

    System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
    System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
    System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);

    // 클래스 필드에 접근할 때는 다음과 같이 레퍼런스를 통해서도 접근할 수 있다.
    System.out.println(s1.count);
    System.out.println(s2.count);
    System.out.println(s3.count);
    
    // 인스턴스에 count라는 변수가 없으면 클래스에서 찾는다
    // 하지만 이렇게 사용하지 말라!!!!
    // 다른 개발자가 count를 인스턴스 변수라고 착각한다.
  }
}
