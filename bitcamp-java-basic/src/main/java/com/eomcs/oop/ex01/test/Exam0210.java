package com.eomcs.oop.ex01.test;

public class Exam0210 {
  public static void main(String[] args) {
    // 레퍼런스 배열 사용
    // 여러개의 인스턴스 주소 저장하기
    
    class Score{
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }
    
    // 배열 문법을 이용하면 한번에 여러 개의 레퍼런스를 선언할 수 있다.
    // 주의 ! 레퍼런스 배열이다. 인스턴스 배열이 아니다!
    
    Score[] arr = new Score[3];
    
    // 배열을 생성하면 모든 항목이 null로 초기화된다.
    // 아직 레퍼런스 배열 항목에 인스턴스 주소가 없는 상태.
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    
    System.out.println("---------------------");
    
    arr[0] = new Score();
    arr[1] = new Score();
    arr[2] = new Score();
    
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}
