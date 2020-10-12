package com.eomcs.design_pattern.observer.test;


public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    // Car객체의 상태가 바뀔 때 실행될 코드를 별도의 클래스로 정의한 다음,
    // Car 객체에 등록한다.
    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    car.addCarObserver(new BrackeOilCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.addCarObserver(new SunRoofCloseCarObserver());

    car.start();

    car.run();

    car.stop();

  }

}


