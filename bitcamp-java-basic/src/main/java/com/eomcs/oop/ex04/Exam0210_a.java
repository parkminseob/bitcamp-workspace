package com.eomcs.oop.ex04;

public class Exam0210_a {
  public static void main(String[] args) throws Exception{
    String s1 = new String("Hello");

    // s1인스턴스의 값을 조회하는 메서드 사용
    // 이 메서드를 호출하려면 반드시 String 인스턴스의 주소를 줘야한다.
    char c = s1.charAt(1);
    System.out.println(c);

    System.out.println(s1.compareTo("Helli"));
    System.out.println(s1.compareTo("Hello"));
    System.out.println(s1.compareTo("Hellu"));

    System.out.println(s1.contains("ll"));
    System.out.println(s1.contains("ee"));

    //두 문자열 연결해서 새 문자열 만들기
    String s2 = s1.concat(", world!");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1.equals("aaa"));
    System.out.println(s1.equals("Hello"));

    String s3 = new String("ABC가각");

    // 인스턴스에 들어 있는 문자 코드를 바이트 배열로 만들어 리턴한다.
    byte[] bytes = s3.getBytes();
    // 인스턴스에 들어있는 문자를 바이트 배열에 저장할때
    // 인코딩 문자 집합을 지정하지 않으면 JVM기본 문자집합으로 인코딩한다.
    // 이클립스 JVM은 기본적으로 UTF-8 문자표를 사용하여 바이트배열에 코드를 저장함.

    for (int i = 0; i < bytes.length; i++) {
      System.out.printf("%x,", bytes[i]);
    }
    System.out.println();

    bytes = s3.getBytes("EUC-KR");
    for (int i = 0; i < bytes.length; i++) {
      System.out.printf("%x,", bytes[i]);
    }
    System.out.println();

    // String 클래스에도 특정 인스턴스가 아닌 문자열을 다룰 수 있는 클래스 메서드를 제공한다.
    String s4 =  String.format("%s님 반가워요!", "홍길동");
    System.out.println(s4);

    // 구분자와 문자열들을 파라미터로 받아 새 문자열 생성
    String s5 = String.join(":", "홍!","임!","유!");
    System.out.println(s5);

    // primitive 값을 문자열로 만든다.
    String s6 = String.valueOf(true);
    String s7 = String.valueOf(3.14f);
    String s8 = String.valueOf(100);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);
  }
}
