package com.eomcs.oop.ex01.test;

// 가비지 
public class Exam0310 {
 public static void main(String[] args) {
  class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  // Score레퍼런스 선언 
  Score s1;
  
  // 인스턴스를 만들어 그 주소를 레퍼런스에 저장한다
  s1 = new Score();
  
  // 새 인스턴스를 만들어 s1에 주소를 저장한다.
  s1 = new Score();
  
  // 처음에 생성되었던 인스턴스는 주소를 잃어버려 사용할 수 없다
  // 이런 메모리를 가비지라고 한다.
  
  // 가비지는 가비지 컬렉터에 의해 메모리에서 해제된다
  // 가비지컬렉터?
  // 힙 메모리에 존재하는 가비지를 찾아 제거(해제)하는 일을 한다.
  
  Score s2 = new Score();
  
  s2 = s1;
  // s1의 주소는 s2에도 저장되었다
  // 즉 s1이 가리키는 객체는 s2도 가리키게 되었다
  // JVM은 객체의 참조 상태를 관리하기 위해 레퍼런스 카운트를 이용한다
  // s1이 가리키는 객체처럼 주소를 알고 있는 변수가 줄어들면 레퍼런스 카운트를 감소시킨다.
  // 레퍼런스 카운트가 0인 상태가 가비지이다.
  
  
}
}
