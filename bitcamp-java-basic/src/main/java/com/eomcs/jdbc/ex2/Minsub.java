package com.eomcs.jdbc.ex2;

public class Minsub {

  String keyboard = null;

  public Minsub() {
    System.out.println("민섭님 생성");
  }

  public void buyKeyboard() {
    System.out.println("무접점 키보드 구입했다.");
    keyboard = "무접점 키보드";
  }

  public void useKeybaord() {
    System.out.println("키보드 개좋다");
  }
}
