package com.eomcs.corelib.ex01.test;

import java.util.HashMap;

// Wrapper 클래스를 key객체로 사용하기 - Integer
public class Exam0154 {
  public static void main(String[] args) {
    HashMap<Integer, Student> map = new HashMap<>();

    // Map은 값을 저장할 때 key를 이용한다.
    // key :
    //      값을 저장할 위치를 계산할 때 사용한다.
    //      key 객체의 hashCode()를 호출하여 그 리턴 값을 사용하여 위치를 계산한다.
    //      따라서 key객체의 해시코드가 다르면 위치도 다르다.
    // => map.put(key, value)

    // key로 사용할 객체 준비
    Integer k1 = new Integer(101);
    Integer k2 = new Integer(102);
    Integer k3 = new Integer(103);

    System.out.println(k1 == k2);
    System.out.println(k1 == k3);
    System.out.println(k2 == k3);

    //위에서 준비한 key객체를 가지고 Student 객체 보관.
    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("유관순", 30, true));
    map.put(k3, new Student("신사임당", 17, true));

    String str = new String("Ohora");
    //map.put(str, new Student("김구", 16, true));
    //Integer 타입으로 사용하기로 선언했기때문에 다른타입을 쓸 수 없음.


    //int값을 key로 사용할 수 있따.
    //key값으로 int를 사용하면 Integer클래스에서
    //컴파일러가 컴파일 할때 자동으로 Integer객체를 생성하기때문이다.
    map.put(104, new Student("안중근",24,true));
    map.put(105, new Student("윤봉길",27,false));

    System.out.println(map.get(k2));

    Integer k6 = new Integer(102);

    System.out.println(map.get(k6));
    System.out.println(k2 == k6);

    System.out.println(k2.hashCode());
    System.out.println(k6.hashCode());

    System.out.println(k2.equals(k6));
  }
}
