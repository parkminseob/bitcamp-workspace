package com.eomcs.oop.ex09.e.test.project4;

import com.eomcs.oop.ex09.e.test.Computer;

public class NewComputer3 implements Computer{

  @Override
  public void compute() {
    System.out.println("새 콤퓨타..");
  }

  // 새로 추가한 기능인 touch()를 구현하지 않아도 컴파일 오류가 발생하지 않는다.
  // 왜? 이미 구현했기 때문이다.
  // 이것이 default 메서드의 문제점이다.
  // 따라서 default 문법은 
  // 기존 인터페이스에 새 기능을 추가할 때만 가능한 사용하라.
  // 즉 기존에 그 인터페이스에 따라 이미 구현한 클래스들에 영향을 끼치지 않기 위한 용도로만 사용하라.
  // 새 인터페이스를 만들 때는 가능한 default 문법을 사용하지 말라!

}
