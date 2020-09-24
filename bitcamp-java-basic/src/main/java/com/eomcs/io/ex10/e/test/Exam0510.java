package com.eomcs.io.ex10.e.test;
//Java I/O API 사용하기 - serialize와 transient 변경자

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import com.eomcs.io.ex09.step3.BufferedOutputStream;

public class Exam0510 {
  public static void main(String[] args) throws Exception {
    ObjectOutputStream out = new ObjectOutputStream(
        new BufferedOutputStream(new FileOutputStream("temp/test12.data")));

    Score s = new Score();
    s.name = "최민섭";
    s.kor = 99;
    s.eng = 98;
    s.math = 97;
    s.compute();

    // serialize할때 transient가 붙은 필드의 값은 제외된다.
    out.writeObject(s);

    out.close();
    System.out.println("완료");
  }
}
