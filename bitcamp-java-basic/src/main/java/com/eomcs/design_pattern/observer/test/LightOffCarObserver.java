package com.eomcs.design_pattern.observer.test;

public class LightOffCarObserver extends AbstractCarObserver {
  @Override
  public void carStopped() {
    System.out.println("전조등 끄기");
  }
}
