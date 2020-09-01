package com.eomcs.generic.ex01.test;

import java.util.ArrayList;

// 제네릭 객체의 메서드 사용 
public class Exam0230 {
  public static void main(String[] args) {

    ArrayList<Object> list;
    list = new ArrayList<>();

    // ArrayList가 Object 타입의 데이터를 다루기로 지정되었으면, 
    // ArrayList의 메서드 파라미터나 리턴 타입은 Object로 설정된다.

    // => add(Object)
    list.add(new Object());
    list.add(new String());
    list.add(new Integer(100));
    list.add(new Member("홍길동", 20));

    // => Object get(int)
    Object obj = list.get(0);
    String str = (String) list.get(1);
    Integer i = (Integer) list.get(2);
    Member m = (Member) list.get(3);

    System.out.println("exit");
  }
}
