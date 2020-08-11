package com.eomcs.oop.ex06.a;

public class Exam0411 {
  public static void printSedan(Sedan sedan) {
    //Sedan과 Truck의 모델명과 cc출력하기
    System.out.printf("모델명 : %s\n", sedan.model);
    System.out.printf("cc: %d\n", sedan.cc);
    System.out.println("--------------");
  }

  public static void main(String[] args) {
    Sedan car1 = new Sedan();
    car1.model = "티코";
    car1.cc = 800;

    Truck car2 = new Truck();
    car2.model = "타이탄2";
    car2.cc = 10000;

    printSedan(car1);

    //printSedan(car2); //Truck개체를 Sedan에 담을 수 없다.
  }
}
