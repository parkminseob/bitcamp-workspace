package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0470 {
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

    //String이 아닌 값은 넣을 수 없다.

    //list.add(3.14f); 컴파일 오류

    for (int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));

  }
}
