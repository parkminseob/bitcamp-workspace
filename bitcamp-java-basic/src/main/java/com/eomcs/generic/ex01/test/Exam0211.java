package com.eomcs.generic.ex01.test;

import java.util.ArrayList;

// 제네릭 - 레퍼런스와 인스턴스 생성 
public class Exam0211 {
  public static void main(String[] args) {

    // 타입명 생략
    ArrayList list1;
    list1 = new ArrayList();
    list1 = new ArrayList<>();
    list1 = new ArrayList<Object>();
    list1 = new ArrayList<String>();
    list1 = new ArrayList<Member>();

    // ArrayList가 다루는 타입에 상관없이 ArrayList 레퍼런스를 선언하고 싶다면,
    // list1 처럼 선언하지 말고 다음과 같이 명확하게 <?> 를 붙여라!
    ArrayList<?> list2;
    list2 = new ArrayList(); //이렇게 사용하지 말고 명확히 제네릭 타입 지정해주기
    list2 = new ArrayList<>();
    list2 = new ArrayList<String>();
    list2 = new ArrayList<Object>();
    list2 = new ArrayList<Member>();
  }
}
