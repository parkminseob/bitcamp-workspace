package com.eomcs.io.ex06.test;
//버퍼 사용 후 - 데이터 읽는데 걸린 시간 측정

import java.io.FileInputStream;

public class Exam0120 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls11.pdf");

    byte[] buf = new byte[8192];
    int len = 0;

    long startTime = System.currentTimeMillis();

    int callCount = 0;
    while ((len = in.read(buf)) != -1) {
      callCount++;
    }
    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);
    in.close();
  }
}
