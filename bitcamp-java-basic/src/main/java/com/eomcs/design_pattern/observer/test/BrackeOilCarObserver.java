package com.eomcs.design_pattern.observer.test;

public class BrackeOilCarObserver implements CarObserver {
  @Override
  public void carStarted() {
    System.out.println("브레이크 오일 유무 검사");
  }

  @Override
  public void carStopped() {

  }
}
