package com.eomcs.design_pattern.observer.test;

import java.util.ArrayList;
import java.util.List;

public class Car {
  List<CarObserver> observers = new ArrayList<>();

  public void addCarObserver(CarObserver observer) {
    observers.add(observer);
  }

  public void removeCarObserver(CarObserver observer) {
    observers.remove(observer);
  }

  private void notifyCarObserverOnStart() {
    for(CarObserver observer : observers) {
      observer.CarStarted();
    }
  }

  private void notifyCarObserverOnStop() {
    for(CarObserver observer : observers) {
      observer.CarStopped();
    }
  }

  public void start() {
    System.out.println("차 출발!!!");
    notifyCarObserverOnStart();
  }

  public void run() {
    System.out.println("차 달린다~부릉부릉");
  }

  public void stop() {
    System.out.println("차 시동 끈다!!!"); {
      notifyCarObserverOnStop();
    }
  }
}
