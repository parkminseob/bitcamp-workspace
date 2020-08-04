// call by value vs call by reference
package com.eomcs.basic.ex07;
// call by value
public class Exam0310_a {
  static void swap(int a, int b) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b);
  }
  public static void main(String[] args) {
    int a = 100;
    int b = 200;
    // swap()을 호출할 때 a 변수의 값과 b 변수의 값을 넘긴다.
    // 값을 넘기기 때문에 call by value라 부름.
    // swap()에서 a와 b라는 이름의 변수가 있지만
    // main()에 있는 변수와는 다르다.

    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n", a, b);

    // call by value
    // => 아규먼트가 원시데이터타입인 경우
    // 메서드를 호출할 때 값을 넘김.
    // 자바에서는 메모리주소를 넘기는 방법이 없기 때문!
    // String은 값이 아니고 주소임!
  }

 }

