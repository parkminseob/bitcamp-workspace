package com.eomcs.generic.ex01.test;
// 제네릭 사용
public class Exam0113 {

  // Box클래스에서 다룰 객체 타입을 파라미터로 받기
  static class Box<T>{
    // T 변수는 Box 클래스가 다루는 객체의 타입을 가리킨다.
    // 그래서 T 변수를 "타입 파라미터"라고 부른다.
    // 타입 파리미터도 변수이기 때문에 이름을 다음과 같이 지어도 된다.
    //   dataType, obj, element 등
    // 그러나 보통 코드를 간략히하기 위해 한 개의 알파벳으로 표현한다.
    // 자바에서 제안하는 변수 이름은 다음과 같다.
    //   T - type
    //   E - element
    //   K - key
    //   V - value
    //   N - number
    // 여러 개의 타입 파라미터를 선언해야 할 경우 보통 두 번째 파라미터부터 다음 알파벳을 사용한다.
    //   S, U, V 등
    //   예) class Box<T,S,U,V> {...}
    //
    T value;

    public void set(T value) {
      this.value = value;
    }

    public T get() {
      return value;
    }
  }
  public static void main(String[] args) {
    // 제네릭을 사용하여 정의된 클래스를 사용할 경우에는 
    // 클래스의 레퍼런스를 정의할 때 어떤 타입의 값을 다룰 것인지 제한을 걸어야 한다.
    // 즉 지정해야 한다.
    Box<Member> box1;

    // 인스턴스를 생성할 때도 어떤 타입의 값을 다룰 것인지 지정해야 한다.
    box1 = new Box<Member>();

    // 객체를 생성할 때 타입 지정을 생략할 수 있다.
    box1 = new Box<>();

    // <>를 생략할 수 있으나 생략하지 말자.
    //box1 = new Box();

    // 메서드를 사용할 때 그 타입 전용 클래스 인 것 처럼 쓰면 된다.
    box1.set(new Member("홍길동",20));

    Member m = box1.get();
    System.out.println(m);

    // 제네릭을 사용했기 때문에
    // 지정한 타입 클래스가 아닐 경우 메서드를 호출할 수 없다!
    //box1.set(new String("홍길동", 20));
    // 결론:
    // => 제네릭 문법을 사용하면 Object 타입을 사용하는 것 보다 편리하다.
    // => 각 타입 별로 클래스를 따로 정의한듯한 효과가 있다.
  }
}
