package com.eomcs.io.ex05.test;
//DataFileOutputStream을 이용하여 객체 출력 - 인스턴스의 값을 출력

public class Exam0210 {
  public static void main(String[] args) throws Exception {
    DataFileOutputStream out = new DataFileOutputStream("temp/test4.data");

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;

    // 1)이름출력
    out.writeUTF(member.name);

    // 2) 나이
    out.writeInt(member.age);

    // 3) 성별
    out.writeBoolean(member.gender);

    out.close();

    System.out.println("데이터 출력 완");
  }
}
