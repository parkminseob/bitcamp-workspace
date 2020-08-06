package com.eomcs.oop.ex03;

public class Exam0160 {
  static class Member {
    String id;
    String password;
    int type;

  }
  public static void main(String[] args) {
    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = 0;

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.type = 2;

    Member m3 = new Member();
    m3.id = "vvv";
    m3.password = "1111";
    m3.type = 1;
  }
}
