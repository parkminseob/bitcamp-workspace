package com.eomcs.oop.ex10.c.test;
//템플릿 메서드를 구현한 클래스 사용
//템플릿 메서드
//=> 기본적인 실행 흐름은 정의하고
// 구체적인 행위는 서브클래스에게 위임하는 설계 기법 
//import com.eomcs.oop.ex05.e.B;

public class Exam01 {

  public static void main(String[] args) {

    Restaurant r = new Restaurant();
    Farm f = new Farm();

    work(r);

    System.out.println("--------");

    work(f);
  }

  static void work(Building obj) {
    obj.build();
  }
}
