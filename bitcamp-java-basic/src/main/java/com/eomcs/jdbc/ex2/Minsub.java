package com.eomcs.jdbc.ex2;

public class Minsub {

  String keyboard = null;
  int wallet = 10000;

  public Minsub() {
    System.out.println("민섭님 생성");
  }

  public void buyKeyboard() {
    System.out.println("무접점 키보드 구입했다.");
    keyboard = "무접점 키보드";
    wallet -= 100000;
  }

  public void useKeybaord() {
    System.out.println("키보드 개좋다");
  }

  public static void main(String[] args) {
    Minsub minsub = new Minsub();
    while(minsub.wallet > -1000000) {
      minsub.buyKeyboard();
      minsub.useKeybaord();
      System.out.println(minsub.wallet);
    }
    System.out.println("파산ㅜㅜ");
  }
}
