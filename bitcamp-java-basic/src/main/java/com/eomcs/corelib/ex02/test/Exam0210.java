package com.eomcs.corelib.ex02.test;
// Wrapper 클래스
public class Exam0210 {
  public static void main(String[] args) {
    // 자바는 primitive data type의 값을 다룰 때 기본 연산자 외에
    // 좀 더 다양한 방법으로 다루기 위해
    // primitive data type에 대응하는 클래스를 제공한다.
    // 예)
    Byte b = new Byte((byte)100);
    Short s = new Short((short)20000);
    Integer i = new Integer(3000000);
    Long l = new Long(6000000000000L);
    Float f = new Float(3.14f);
    Double d = new Double(3.14159);
    Boolean bool = new Boolean(true);
    Character c = new Character((char)0x41);

    // primitive data type에 대응하여 만든 클래스를
    // primitive data를 포장하는 객체라고 해서
    // wrapper 클래스라고 부른다.

    // 래퍼 클래스의 주요 용도 :
    // primitive data type의 값을 객체로 주고 받을 때 사용한다.

    // 래퍼 클래스의 인스턴스를 생성할때는 생성자 대신 클래스 메서드를 사용하자.
    Byte b2 = Byte.valueOf((byte)100);
    Short s2 = Short.valueOf((short)20000);
    Integer i2 = Integer.valueOf(3000000);
    Long l2 = Long.valueOf(600000000000L);
    Float f2 = Float.valueOf(3.14f);
    Double d2 = Double.valueOf(3.14159);
    Boolean bool2 = Boolean.valueOf(true);
    Character c2 = Character.valueOf((char)0x41);
  }
  void m1(Object value) {
    System.out.printf("value = %s\n", value);
  } //모든 객체를 받을 수 있다.
  //만약 래퍼 클래스가 없다면 정수를 받는 메서드와 부동 소수점을 받는 메서드
  //논리값 메서드 모두 따로 정의해야한다.
  void m2(long value) {
    System.out.printf("value = %s\n", value);
  }
  void m3(double value) {
    System.out.printf("value = %s\n", value);
  }
  void m4(boolean value) {
    System.out.printf("value = %s\n", value);
  }
}
