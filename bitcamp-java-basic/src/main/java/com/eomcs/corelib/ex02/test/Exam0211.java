package com.eomcs.corelib.ex02.test;
// Wrapper 클래스 - 생성자 vs valueOf()
public class Exam0211 {
  public static void main(String[] args) {

    // new로 Integer객체를 만들면 무조건 새 인스턴스를 생성한다.
    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);
    System.out.println(i1 == i2); //f

    // -128 ~ 127 범위의 수를 가지고 valueOf()를 호출하면
    // String 리터럴의 경우처럼 상수 풀에 Integer 객체를 생성한다.
    // 같은 값의 Integer 객체가 여러 개 생성되지 않도록 한다.
    // Integer상수풀에 따로 관리한다.

    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    System.out.println(i3 == i4); //t
    System.out.println(i1 == i3); //f

    Integer x = Integer.valueOf(-128);
    Integer y = Integer.valueOf(-128);
    System.out.println(x == y); //t

    // -128~ 127은 자주 사용하는 수이기 때문에 가능하다.
    // 그 범위외의 수는 무조건 새 인스턴스 생성

    // 상수풀에 생성된 객체는 JVM이 종료되기 전까지 유지된다.
    // 가비지가 되지 않는다.

    // -128~ 127까지의 수는 힙에 생성되어 메모리 관리가 좀더 효율적임.

    Integer i5 = Integer.valueOf(128);
    Integer i6 = Integer.valueOf(128);
    System.out.println(i5 == i6);

    // wrapper 객체 값을 비교할때 == 말고
    // equals() 메서드를 활용하기.
  }
}
