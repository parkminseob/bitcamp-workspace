package com.eomcs.io.ex02;

import java.io.FileOutputStream;

//Byte Stream - 바이트 배열 출력하기

public class Exam0210 {
  public static void main(String[] args) throws Exception {

    // 현재 디렉토리는 프로젝트 폴더이다.
    //
    FileOutputStream out = new FileOutputStream("temp/test1.data");
    byte[] bytes = new byte[] {0x7a, 0x6b, 0x5c, 0x4d, 0x3e, 0x2f, 0x30};
    out.write(bytes);

    out.close();

    System.out.println("출력완료 데이터!");
  }
}
