package com.eomcs.io.ex08;
//포함 관계로 기능 확장하기 - BufferedInputStream, BufferedOutputStream

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam0220 {
  public static void main(String[] args) throws Exception {

    FileInputStream in = new FileInputStream("temp/jls11.pdf");
    BufferedInputStream in2 = new BufferedInputStream(in);

    FileOutputStream out = new FileOutputStream("temp/jls11_3.pdf");
    BufferedOutputStream out2 = new BufferedOutputStream(out);

    int b;

    long startTime = System.currentTimeMillis();

    while((b = in.read()) != -1) {
      out2.write(b);
    }

    out2.flush();

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);

    in.close();
    out.close();

  }
}
