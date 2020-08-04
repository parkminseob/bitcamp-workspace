package com.eomcs.basic.ex07;
// call by reference
public class Exam0330 {
  // main()에서 만든 int a 와 int b의 값을 바꾸고 싶다면
  // primitive data type 값을 직접 넘기지 말고 객체에 담아 넘겨야 함.

  static class MyObject {
    int a;
    int b;
  }
  static void swap(MyObject ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
  }
  public static void main(String[] args) {
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;

    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }
}
