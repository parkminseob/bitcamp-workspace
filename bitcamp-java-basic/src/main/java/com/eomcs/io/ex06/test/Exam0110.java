package com.eomcs.io.ex06.test;
//버퍼 사용 후 - 데이터 읽는데 걸린 시간 측정

import java.io.FileInputStream;

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    int b;

    long startTime = System.currentTimeMillis();

    int callCount = 0;
    while ((b = in.read()) != -1) {
      callCount++;
    }
    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
  }
}
