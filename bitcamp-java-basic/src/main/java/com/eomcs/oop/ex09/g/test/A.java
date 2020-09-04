package com.eomcs.oop.ex09.g.test;

public interface A {
  // 인터페이스도 static 메서드를 가질 수 있다.
  // => 특정 인스턴스에 종속되지 않고 작업하는 경우에 static 메서드로 정의한다.
  static String m1() {
    //인스턴스없이 수행하는 작업을 여기에 작성한다.
    return "HI!";
  }

  // 인터페이스는 디폴트 메서드를 가질 수 있다.
  // => 기존 프로젝트에 영향을 끼치지 않으면서 기존 규칙에
  // 새 메서드를 추가할 때 유용한다.
  default void m2() {
    // 어차피 새 메서드는 새 프로젝트의 구현체가 오버라이딩 할 것이니
    // 여기에서는 자세하게 정의하지 않는다.
    // 다만 이 인터페이스를 구현한 예전 프로젝트가 영향 받지 않도록
    // 새로 추가한 메서드를 정의할 뿐이다.
  }

  // 인터페이스에 static 메서드나 default 메서드가 여러 개 있더라도
  // 그 메서드들은 이미 구현된 메서드이기 때문에 추상 메서드와 상관없다.
  // 따라서 이 인터페이스는 추상 메서드가 한 개다.
  // 즉 람다(lambda)로 구현할 수 있다.
  void m3();
}
