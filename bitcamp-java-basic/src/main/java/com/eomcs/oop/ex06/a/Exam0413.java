package com.eomcs.oop.ex06.a;
//다형적 변수 활용
public class Exam0413 {
  // 다형적 변수를 사용하게 되면 동일한 코드를 갖고 있는 메서드를
  // 한개의 메서드로 통합할 수 있다.
  // => 즉 Sedan객체와 Truck객체를 모두 가리킬 수 있는
  //    상위 클래스의 레퍼런스를 선언하면된다.

  public static void printCar(Car car) {
    System.out.printf("모델명: %s\n", car.model);
    System.out.printf("cc: %d\n", car.cc);
    System.out.println("----------------");
  }
  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 800;

    Truck car2 = new Truck();
    car2.model = "타이탄II";
    car2.cc = 10000;

    printCar(car1);
    printCar(car2);
  }
}
