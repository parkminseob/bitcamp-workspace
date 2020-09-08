package com.eomcs.oop.ex11.c.test;
//inner class : 바깥 클래스의 인스턴스를 보관할 this 변수와 생성자

class E{
  class X{
    // 인스턴스 메서드는 this 라는 내장 변수에 인스턴스 주소를 보관한다.
    // 그렇다면 inner class는 어디에 보관할까?
    // - 자바 컴파일러는 바깥 클래스의 인스턴스 주소를 저장하기 위해 
    //   다음과 같은 필드를 추가한다.
    // - 컴파일 완료된 inner class의 .class 파일을 열어 보면,
    //   바깥 클래스의 객체 주소를 저장할 인스턴스 필드가 추가된 것을 확인할 수 있다.  
    //    
    //    final synthetic com.eomcs.oop.ex11.c.E this$0;
    //
    // - 위와 같이 바깥 클래스의 인스턴스 주소를 저장하기 위해 컴파일러가 추가한 변수를 사용하려면
    //   다음과 같이 코드를 작성해야 한다.
    //   [문법] 바깥클래스명.this
    //   예) E.this 
    // 
    // 인스턴스 메서드에 있는 this 변수는 인스턴스 메서드를 호출할 때 객체 주소를 저장한다.
    // 그렇다면 inner class에서 바깥 클래스의 인스턴스 주소는 언제 저장할까?
    // - 바깥 클래스의 인스턴스를 가지고 inner class의 인스턴스를 생성할 때 저장한다.
    // - 즉 inner class의 생성자를 호출할 때 바깥 클래스의 인스턴스 주소를 파라미터로 전달한다.
    // - 이를 위해 컴파일러는 inner class를 컴파일 할 때 생성자를 변형한다.
    // 
    // - 다음과 같이 개발자가 기본 생성자를 작성했다고 가정하자.
    //    public X() {}
    //
    // - 컴파일러는 다음과 같이 바꾼다.
    //    public X(E outer) {}
    //

  }
}
public class Exam0510 {
  public static void main(String[] args) {
    E outer = new E();

    E.X obj = outer.new X();

    // inner class 의 인스턴스를 생성할 때 바깥 클래스의 객체 주소를 어떻게 전달할까?
    // - 컴파일러는 위의 기본 생성자 호출 코드를 
    //   바깥 클래스의 객체 주소를 받는 생성자 호출 코드로 변경한다.
    // - .class 파일에서 outer.new X() 코드에 해당하는 부분
    //     invokespecial com.eomcs.oop.ex11.c.E$X(com.eomcs.oop.ex11.c.E) [25]
    // - 위의 코드를 자바 소스 코드로 표현해보면,   
    //     E.x obj = new X(outer);
  }
}
