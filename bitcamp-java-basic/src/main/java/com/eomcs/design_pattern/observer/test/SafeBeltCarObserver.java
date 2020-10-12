package com.eomcs.design_pattern.observer.test;

public class SafeBeltCarObserver extends AbstractCarObserver {
  @Override
  public void CarStarted() {
    System.out.println("안전벨트 착용 유무 검사");
  }
}
