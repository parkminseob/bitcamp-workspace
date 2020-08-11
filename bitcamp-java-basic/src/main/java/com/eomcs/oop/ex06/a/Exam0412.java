package com.eomcs.oop.ex06.a;
//다형적 변수의 활용
public class Exam0412 {
  // Sedan과 Truck의 모델명과 cc출력하기.

  public static void printSedan(Sedan sedan) {
    System.out.printf("모델명 : %s\n", sedan.model);
    System.out.printf("cc: %d\n", sedan.cc);
    System.out.println("--------------");
  }
  public static void printTruck(Truck truck) {
    System.out.printf("모델명 : %s\n", truck.model);
    System.out.printf("cc: %d\n", truck.cc);
    System.out.println("--------------");
  }
  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "마티즈";
    car1.cc = 8000;

    Truck car2 = new Truck();
    car2.model = "타이탄2";
    car2.cc = 10000;

    printSedan(car1);
    printTruck(car2);

    //출력하는 메소드를 일일이 만들어야하는 번거로움이 있다.
    //해결책?
    //=> 두 개의 클래스가 같은 조상을 가질 땐 다형적 변수를 활용해보자.
  }

}
