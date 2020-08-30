package com.eomcs.oop.ex01.test;

public class Exam0113 {

  // 여러 메서드에서 클래스를 사용해야 한다면
  // 메서드 밖에서 선언해야한다.
  // => static메서드에서도 사용할 수 있게 클래스로 static으로 선언해본다.
  
   static class Score{
     String name;
     int kor;
     int eng;
     int math;
     int sum;
     float aver;
   }
   
   public static void main(String[] args) {
    
     Score s = new Score();
     
     s.name = "홍길동";
     s.kor = 100;
     s.eng = 90;
     s.math = 80;
     
     // 성적 데이터를 클래스로 묶어 놓으면 값을 다루기가 편하다.
     // 다음과 같이 성적데이터를 한번에 넘길 수 있다.
     printScore(s);
  }
   
   static void printScore(Score s) {
     s.sum = s.kor + s.eng + s.math;
     s.aver = s.sum / 3;
     System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
         s.name, s.kor, s.eng, s.math, s.sum, s.aver);
   }
}
