package com.eomcs.io.ex04.test;

import java.io.FileOutputStream;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test.data");

    int money = 1_3456_7890;

    out.write(money);

    out.close();

    System.out.println("완료");
  }
}
