package com.eomcs.generic.ex01.test;

import java.util.ArrayList;

// 제네릭 문법 정리 - 레퍼런스와 인스턴스 생성 
public class Exam0210 {
  public static void main(String[] args) {
    // 문법 : 클래스명<타입명>
    ArrayList<Member> list = new ArrayList<Member>();

    // 레퍼런스 선언에 제네릭 정보가 있다면 new 연산자에서 생략 가능
    ArrayList<Member> list2 = new ArrayList<>();

    ArrayList<Member> list3;
    list3 = new ArrayList<>();
  }
}
