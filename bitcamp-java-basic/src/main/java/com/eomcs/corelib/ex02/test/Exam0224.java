package com.eomcs.corelib.ex02.test;
//오토박싱/오토언박싱 응용

public class Exam0224 {

  static class Member {
    String name;
    String tel;

    @Override
    public String toString() {
      return name + "," + tel;
    }

  }
}
