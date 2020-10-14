package com.eomcs.design_pattern.observer.test;

import java.util.ArrayList;
import java.util.List;

public class Car {
  //-------------------------------------------------------------------
  // Observer 디자인 패턴 적용:
  // - publisher쪽에 추가해야 하는 필드와 메서드
  // 관찰자(observer/listener/subscriber)의 객체 주소를 보관
  List<CarObserver> observers = new ArrayList<>();

  // 자동차의 상태 변경을 보고 받을 관찰자(Observer)를 등록한다.
  public void addCarObserver(CarObserver observer) {
    observers.add(observer);
  }

  // 자동차의 상태 변경을 보고 받는 관찰자를 제거한다.
  public void removeCarObserver(CarObserver observer) {
    observers.remove(observer);
  }
  //-------------------------------------------------------------------

  private void notifyCarObserverOnStart() {
    for(CarObserver observer : observers) {
      observer.carStarted();
    }
  }

  private void notifyCarobserverOnStop() {
    for(CarObserver observer : observers) {
      observer.carStopped();
    }
  }

  public void start() {
    System.out.println("차 시동건다!~!");
    //-------------------------------------------------------------------
    // Observer 디자인 패턴:
    // - publisher의 상태가 바뀌었을 때 subscriber에게 통지한다.
    // - 즉 subscriber(observer/listener)에 대해 규칙(CarObserver인터페이스)에 따라 메서드를 호출한다.
    // 예) 자동차 시동을 걸면, 등록된 관찰자들에게 알린다.
    notifyCarObserverOnStart();
  }
  //-------------------------------------------------------------------


  public void run() {
    System.out.println("차 달린다!!언니달려!!");
  }

  public void stop() {
    System.out.println("차 멈춘다!!");
    //-------------------------------------------------------------------
    // Observer 디자인 패턴:
    // - publisher의 상태가 바뀌었을 때 subscriber에게 통지한다.
    // - 즉 subscriber(observer/listener)에 대해 규칙(CarObserver인터페이스)에 따라 메서드를 호출한다.
    // 예) 자동차 시동을 끄면, 등록된 관찰자들에게 알린다.
    notifyCarobserverOnStop();
  }
  //-------------------------------------------------------------------

}
