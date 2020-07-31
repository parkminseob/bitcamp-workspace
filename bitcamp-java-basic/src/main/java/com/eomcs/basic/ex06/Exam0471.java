package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0471 {
  public static void main(String[] args) {
    //제네릭 적용(맛보기)
    ArrayList<String> list = new ArrayList<>();
    list.add("토끼");
    list.add("여우");
    list.add("개구리");
    list.add("코끼리");
    list.add("다람쥐");
    list.add("돼지");
    list.add("기린");

    //제네릭을 사용하면 for(:)문장에서
    //항목의 타입을 정확하게 지정하여 값을 받을 수 있다.

    for (String name : list)
      System.out.println(name + " ");

  }
}
