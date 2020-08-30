package com.eomcs.oop.ex01.test;

public class Exam0112 {
  public static void main(String[] args) {
    // 클래스 사용
    // [클래스?]
    // 다양한 타입의 메모리를 묶어서
    // 새로운 형태의 메모리를 설계하는 문법이다.
    // 개발자가 새롭게 정의한 데이터 타입 = 사용자 정의 데이터 타입
    
    // 클래스 이름은 대문자로 시작하고, 명사형으로 짓는다.
    
    class Score{
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }
    
    // 작성한 설계도에 따라 메모리를 준비해보자.
    Score s; // 변수 선언하듯이 하면 될까?
    
    // 이 선언은 설계도에 따라 메모리를 준비시키는 명령이 아니다.
    // Score 설계도에 따라 만든 메모리의 주소를 저장할 변수를 만드는 명령이다.
    // 메모리 주소를 저장하는 변수 = 레퍼런스
    // 메모리를 준비시키려면 어떻게 해야할까?
    
    s = new Score();
    // 개발자가 정의한 설계도에 따라 메모리를 준비하는 명령이다.
    // 이렇게 설계도에 따라 준비된 메모리를 인스턴스(instance)라고 한다.
    // 확보된 메모리를 사용하려면 주소를 보관할 필요가 있다.
    // 위에서 준비한 레퍼런스 (s)에 주소를 보관한다.
    
    // 클래스 설계도에 따라 만든 메모리에 값을 넣어보자
    // 레퍼런스에 저장된 주소를 이용하여 메모리에 접근한다.
    // s에 저장된 주소로 찾아가서 그 메모리의 각 항목 값을 설정한다.
    // = s객체의 필드값을 설정한다.
    
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 90;
    s.math = 80;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;
    
    // 메모리 값 꺼내기 
    // s에 저장된 주소로 찾아가서 name항목의 값 꺼내기
    // = s 객체의 name 값
    
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
    
  }
}
