package com.eomcs.io.ex06.test;

public class Exam0310 {
  public static void main(String[] args) throws Exception {
    BufferedFileInputStream in = new BufferedFileInputStream("temp/jls11.pdf");

    int b;

    long startTime = System.currentTimeMillis(); // 밀리초

    int callCount = 0;
    while((b = in.read()) != -1)
      callCount++; // 파일을 끝까지 읽는다.

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);
    System.out.println(callCount);

    in.close();
  }
}
