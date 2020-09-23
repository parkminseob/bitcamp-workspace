package com.eomcs.io.ex10.a;

import java.io.FileOutputStream;
import com.eomcs.io.ex09.step3.DataOutputStream;

//Java I/O API 사용하기 - DataOutputStream

public class Exam0110 {
  public static void main(String[] args) throws Exception {
    FileOutputStream fileOut = new FileOutputStream("temp/test8.data");
    DataOutputStream out = new DataOutputStream(fileOut);

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;

    // 장신구/보조장치/플러그인(decorator)를 사용하여 String,int,boolean 값을 출력한다.
    long startTime = System.currentTimeMillis();

    for(int i = 0; i < 100000; i++) {
      out.writeUTF(member.name);
      out.writeInt(member.age);
      out.writeBoolean(member.gender);
    }
    long endTime = System.currentTimeMillis();

    out.close();

    System.out.println("데이터 출력 완료");
    System.out.println(endTime - startTime);
  }
}
