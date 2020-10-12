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

  public void start() {
    System.out.println("시동 건다!!!!!");
    for(CarObserver observer : observers) {
      observer.carStarted();
    }
  }

  public void run() {
    System.out.println("달려라 자동차~~~~~!!!!!!!");
  }

  public void stop() {
    System.out.println("시동 끈다~~~~");
    for(CarObserver observer : observers) {
      observer.carStopped();
    }
  }
}
