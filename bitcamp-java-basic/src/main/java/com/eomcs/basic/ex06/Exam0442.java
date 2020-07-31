package com.eomcs.basic.ex06;

public class Exam0442 {
  public static void main(String[] args) {

    String[] names = {"홍길동", "안중근", "유관순", "임꺽정", "윤봉길"};

    for (int i = 0; i < names.length; i += 2) {
      System.out.println(names[i]);
    }

  }
}
