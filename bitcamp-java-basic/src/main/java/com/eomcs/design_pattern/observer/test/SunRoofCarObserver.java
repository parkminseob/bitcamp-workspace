package com.eomcs.design_pattern.observer.test;

public class SunRoofCarObserver extends AbstractCarObserver {
  @Override
  public void CarStopped() {
    System.out.println("썬루프 닫는다!");
  }
}
