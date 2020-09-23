package com.eomcs.io.ex09.step3;

import java.io.FileInputStream;

//부품 연결 예 : FileInputStream --> BufferedInputStream --> DataInputStream

public class Exam0420 {
  public static void main(String[] args) throws Exception {
    FileInputStream fileInt = new FileInputStream("temp/test7.data");

    BufferedInputStream bufIn = new BufferedInputStream(fileInt);

    DataInputStream in = new DataInputStream(bufIn);

    Member member = new Member();

    long start = System.currentTimeMillis();

    for(int i = 0; i < 100000; i++) {
      member.name = in.readUTF();
      member.age = in.readInt();
      member.gender = in.readBoolean();
    }
    long end = System.currentTimeMillis();

    System.out.println(end - start);

    in.close();
  }
}
