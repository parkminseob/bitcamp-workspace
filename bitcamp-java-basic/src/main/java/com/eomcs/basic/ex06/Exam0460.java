package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0460 {
  public static void main (String[] args) {
    ArrayList list = new ArrayList();

    //컬렉션
    //배열은 같은 타입의 값만 보관할 수 있지만
    //컬렉션은 다른 타입의 값도 보관할 수 있다.
    list.add("홍길동");
    list.add(false);
    list.add(9.990);
    list.add('a');

    for (int i = 0; i < list.size(); i++)
      System.out.println(list.get(i));

  }
}
