package com.eomcs.oop.ex04;

public class Exam0110_a {
  public static void main(String[] args) throws Exception {

    String s1 = new String("Hello");

    char[] chars = new char[] {'H','e','l','l','o'};
    String s2 = new String(chars);

    byte[] bytes = {
        (byte)0x48,
        (byte)0x65,
        (byte)0x6c,
        (byte)0x6c,
        (byte)0x6f
    };
    String s3 = new String(bytes);

    System.out.printf("%s, %s, %s\n", s1, s2, s3);
  }
}
