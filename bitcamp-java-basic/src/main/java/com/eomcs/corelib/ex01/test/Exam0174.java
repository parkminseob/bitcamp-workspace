package com.eomcs.corelib.ex01.test;

public class Exam0174 {

  static class Engine implements Cloneable {
    int cc;
    int valve;

    public Engine(int cc, int valve) {
      this.cc = cc;
      this.valve = valve;
    }
    @Override
    public String toString() {
      return "Engine [cc=" + cc + ", valve=" + valve + "]";
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
      return (Engine) super.clone();
    }
  }
  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;

    public Car(String maker, String name, Engine engine) {
      this.maker = maker;
      this.name = name;
      this.engine = engine;
    }
    @Override
    public String toString() {
      return "Car [maker=" + maker + ", name=" + name + ", engine=" +
    engine + "]";
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
      // deep copy
      // 포함하고 있는 하위 객체에 대한 복제를 수행하려면
      // 개발자가 직접 하위 객체를 복제하는 코드를 작성해야한다.
      Car copy = (Car) super.clone();
      copy.engine = this.engine.clone();
      return copy;
    }
  }
  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3000, 16);
    Car car = new Car("비트자동차","비트비트",engine);

    // 자동차 복제
    Car car2 = car.clone();

    System.out.println(car == car2); //인스턴스는 다르다
    System.out.println(car); //clone했으니 데이터는 같다
    System.out.println(car2);
    System.out.println(car.engine == car2.engine);
    // 엔진도 따로 클론했으니 다른 인스턴스다!

    car.engine.cc = 2000;
    System.out.println(car2.engine.cc);
  }
}
