package com.eomcs.design_pattern.observer.test;

public class SafeBeltCarObserver implements CarObserver {
  @Override
  public void carStarted() {
    System.out.println("안전 벨트 착용 여부 검사");
  }

  @Override
  public void carStopped() {
  }
}
