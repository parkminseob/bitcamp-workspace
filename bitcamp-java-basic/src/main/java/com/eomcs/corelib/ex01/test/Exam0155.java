package com.eomcs.corelib.ex01.test;

import java.util.HashMap;
import com.eomcs.corelib.ex01.Student;

// String을 key로 사용하기
public class Exam0155 {
  public static void main(String[] args) {
    HashMap<String, Student> map = new HashMap<>();

    String k1 = new String("ok");
    String k2 = new String("no");
    String k3 = new String("haha");
    String k4 = new String("ohora");
    String k5 = new String("hul");

    // String을 key로 사용해보자!
    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, true));
    map.put(k3, new Student("유관순", 17, true));
    map.put(k4, new Student("안중근", 24, true));
    map.put(k5, new Student("윤봉길", 22, false));

    // k3 key로 저장한 값을 다시 k3 key로 꺼내보자!
    System.out.println(map.get(k3));

    String k6 = new String("haha");
    System.out.println(k3 == k6);

    // String은 같은 문자열일 경우 같은 해시코드를 리턴하도록 메서드가 오버라이딩 되어있다.
    System.out.println(k3.hashCode());
    System.out.println(k6.hashCode());

    // 해쉬코드도 리턴하고 equals()의 값이 true가 되도록 오버라이딩 되어있다.
    System.out.println(k3.equals(k6));

    System.out.println(map.get(k6));


    // haha와 Haha는 당연히 다른 객체다.
    // 해쉬도 다르고 equals()도 false다.
    String k7 = new String("Haha");
    System.out.println(map.get(k7));

  }
}
