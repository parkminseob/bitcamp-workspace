package com.eomcs.basic.ex07;
// 인스턴스와 heap 메모리 영역
public class Exam0430 {

  static class MyObject {
    int a;
    int n;
  }
  static MyObject getMyObject() {
    MyObject ref = new MyObject();

    ref.a = 100;
    ref.n = 200;

    return ref;
  }
  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();
    System.out.println(ref.a);
    System.out.println(ref.n);

  }

}
