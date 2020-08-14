package com.eomcs.corelib.ex02.test;
// wrapper 객체 생성
public class Exam0230 {
  public static void main(String[] args) {

    Integer obj1 = Integer.valueOf(100);
    Integer obj2 = 100;
    System.out.println(obj1 == obj2); //t
    // 오토박싱이나 valueOf()로 생성한 wrapper객체는
    // 상수풀에 오직 한개만 생성되기때문에
    // 값을 비교할때 그냥 인스턴스 주소끼리 비교해도 된다.

    Integer obj3 = new Integer(100);
    Integer obj4 = new Integer(100);
    System.out.println(obj3 == obj4); //f

    System.out.println(obj3.equals(obj4));//t
  }
}
