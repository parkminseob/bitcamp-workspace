package com.eomcs.oop.ex11.c.test;
//inner class : import 사용

import com.eomcs.oop.ex11.c.sub.M;
import com.eomcs.oop.ex11.c.sub.M.Y;
import com.eomcs.oop.ex11.c.test.D.X;;

class D{
  class X{
    void test() {
      System.out.println("test()");
    }
  }
}
public class Exam0410 {
  public static void main(String[] args) {
    D outer = new D();
    X obj = outer.new X();
    obj.test();

    M outer2 = new M();
    Y obj2 = outer2.new Y();
    obj2.test();
  }
}
