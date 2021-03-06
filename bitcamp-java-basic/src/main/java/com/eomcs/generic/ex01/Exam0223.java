// 제네릭(Generic) 문법 정리 - 제네릭 파라미터 
package com.eomcs.generic.ex01;

import java.util.ArrayList;

public class Exam0223 {

  static class A {}
  static class B1 extends A {}
  static class B2 extends A {}
  static class C extends B1 {}
  /*
   *   Object
   *     |
   *     A
   *    / \
   *   B1 B2
   *   |
   *   C
   */

  public static void main(String[] args) {
    // m1(ArrayList<A>)
    // => A 타입에 대해서만 ArrayList 객체를 파라미터로 넘길 수 있다.
    // => A의 하위 타입은 불가능
    //
    m1(new ArrayList()); // 컴파일 오류는 아니지만, 타입을 지정하지 않는 것은 바람직하지 않다.
    // 왜? 
    // => 타입을 지정하지 않으면 ArrayList에 A가 아닌 다른 타입의 객체가 들어갈 수 있다.
    // => 그러면 실행 중에 get()을 호출할 때 형변환 문제가 발생할 것이다.
    //
    //m1(new ArrayList<Object>()); // 컴파일 오류!
    //m1(new ArrayList<A>()); // 컴파일 오류!
    m1(new ArrayList<B1>());
    //m1(new ArrayList<B2>()); // 컴파일 오류!
    //m1(new ArrayList<C>()); // 컴파일 오류!
  }

  static void m1(ArrayList<B1> list) {
    // 컴파일러는 파라미터로 넘어온 ArrayList가 어떤 타입이든 간에
    // 문법적으로 A타입의 값만 다룬다.

    //list.add(new Object()); //컴파일 오류!
    //list.add(new A()); // 컴파일 오류!
    list.add(new B1());
    //list.add(new B2()); // 컴파일 오류!
    list.add(new C());
    
    // list에 B1타입이 아닌 다른 타입을 저장할 때는 아무런 문제가 발생하지 않지만
    // ArrayList에서 값을 꺼낼 때 메서드에서 지정한 <B1>타입이 아니면 ClassCastException 발생!
    
    for(int i = 0; i < list.size(); i++) {
      B1 temp = list.get(i);
      System.out.println(temp);
    }
  }
}








