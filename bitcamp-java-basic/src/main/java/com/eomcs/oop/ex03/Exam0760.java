package com.eomcs.oop.ex03;
// 인스턴스 초기화 블록 초기화와 생성자
public class Exam0760 {
  public static void main(String[] args) {
    Object obj1 = new Object() {

      {
        System.out.println("인스턴스 블록...");
      }
    };
  }

}