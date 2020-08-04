package com.eomcs.basic.ex07;
// JVM 아규먼트
public class Exam0610 {
  public static void main(String[] args) {
    //JVM아규먼트?
    // - jvm에게 전달하는 값
    // $java -cp ./bin/main -D이름=값 -D이름=값 -D이름=값 com.eomcs.basic.ex07.Exam0610

    //JVM아규먼트 값 꺼내기
    //System.getProperty("이름");

    String v1 = System.getProperty("a");
    String v2 = System.getProperty("b");
    String v3 = System.getProperty("c");

    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
 }
}
