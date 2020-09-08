package com.eomcs.oop.ex11.b.test;
//static nested class : import static 사용 후

import static com.eomcs.oop.ex11.b.sub.M2.m2;
import static com.eomcs.oop.ex11.b.sub.M2.v2;
import static com.eomcs.oop.ex11.b.test.E.m1;
import static com.eomcs.oop.ex11.b.test.E.v1;
// 중첩 클래스를 import할 때는 static을 적지 않는다.
import com.eomcs.oop.ex11.b.sub.M2.Y;
import com.eomcs.oop.ex11.b.test.E.X;


class E {
  static int v1;
  static void m1() {}
  static class X{
    void test() {
      System.out.println("test()");
    }
  }
}
public class Exam0420 {
  public static void main(String[] args) {

    v1 = 100;
    m1();
    X obj = new X();

    // 다른 패키지의 클래스 스태틱 멤버
    v2 = 200;
    m2();
    Y obj2 = new Y();
  }
}
