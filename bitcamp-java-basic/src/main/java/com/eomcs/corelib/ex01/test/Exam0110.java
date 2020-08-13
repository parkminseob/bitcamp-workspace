package com.eomcs.corelib.ex01.test;

// 클래스를 정의할 때 수퍼클래스를 지정하지 않으면 자동으로 Object를 상속 받는다.
public class Exam0110 {
  static class My/*extends Object*/{

  }
  public static void main(String[] args) {
    //instanceof 연산자
    //레퍼런스가 가리키는 인스턴스가 지정한 클래스의 인스턴스 이거나
    //또는 조상클래스인지 검사한다.
    Object obj = new My();
    //이미 Object의 레퍼런스에 My인스턴스 주소를 저장할 수 있다는건
    //My클래스가 Object클래스의 서브클래스임을 증명하는거이다.

    System.out.println(obj instanceof My); //true
    System.out.println(obj instanceof String); //false
    System.out.println(obj instanceof Object); //true
    //Object를 조상으로 갖는다면 당연히 Object의 메서드를 사용할 수 있을것이다.
    System.out.println(obj.toString());
    System.out.println(obj.hashCode());
    System.out.println(obj.equals("Hello"));




  }
}
