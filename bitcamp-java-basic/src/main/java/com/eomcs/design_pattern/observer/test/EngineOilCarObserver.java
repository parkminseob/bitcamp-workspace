package com.eomcs.design_pattern.observer.test;

public class EngineOilCarObserver extends AbstractCarObserver {
  @Override
  public void CarStarted() {
    System.out.println("엔진오일 유무 검사");
  }
}
