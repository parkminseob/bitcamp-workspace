package com.eomcs.corelib.ex01.test;

import java.util.HashMap;

// HashMap의 key와 hashCode()
public class Exam0152 {
  static class MyKey {
    String contents;

    public MyKey (String contents) {
      this.contents = contents;
    }

    @Override
    public String toString() {
      return "MyKey [contents=" + contents + "]";
    }
  }
  public static void main(String[] args) {
    HashMap<MyKey, Student> map = new HashMap<>();

    MyKey k1 = new MyKey("ok");
    MyKey k2 = new MyKey("no");
    MyKey k3 = new MyKey("haha");
    MyKey k4 = new MyKey("huhu");
    MyKey k5 = new MyKey("zzzz");

    map.put(k1, new Student("홍길동", 20, true));
    map.put(k2, new Student("임일일", 30, false));
    map.put(k3, new Student("임일이", 40, true));
    map.put(k4, new Student("홍죠매", 21, true));
    map.put(k5, new Student("홍기리", 25, false));

    // HashMap
    // 값을 저장할 때 key객체의 해시코드를 이용하여 저장할 위치(인덱스)를 계산한다.
    // 따라서 해시코드가 같다면 같은 key로 간주한다.

    //값을 저장할 때 사용한 key객체로 값을 찾아 꺼낸다.
    System.out.println(map.get(k3));

    // key6을 생성한 뒤 값을 꺼내보자!
    MyKey k6 = new MyKey("haha");

    System.out.println(map.get(k6)); // null!

    // 왜?
    // 두 키 객체 K3과 K6의 내용물이 같다 하더라도
    // HashCode()의 리턴 값이 서로 다르고, equals() 비교 결과도 false라면
    // HashMap 클래스에서는 서로 다른 key라고 간주한다.

    System.out.println(k3 == k6);
    System.out.printf("k3(%s), k6(%s)\n", k3, k6);
    System.out.println(k3.hashCode());

  }
}
