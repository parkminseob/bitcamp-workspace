package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    class Members {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date currentTime;
    }

    final int LENGTH = 100;
    Scanner keyInput = new java.util.Scanner(System.in);
    System.out.println("[회원]");

    long currentMillis = 0;
    int count = 0;

    Members[] members = new Members[LENGTH]; //배선카 생성

    for (int i = 0; i < 5; i++) {
      Members m = new Members(); //반찬들

      count++;

      System.out.print("번호? ");
      m.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      m.name = keyInput.nextLine();

      System.out.print("이메일?");
      m.email = keyInput.nextLine();

      System.out.print("암호?");
      m.password = keyInput.nextLine();

      System.out.print("사진?");
      m.photo = keyInput.nextLine();

      System.out.print("전화?");
      m.tel = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      m.currentTime = new Date(currentMillis);

      System.out.println(); //빈줄 출력

      //반찬 담기
      members[i] = m;

      System.out.print("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();


      if (response.equalsIgnoreCase("y") == false) {
        break; //반복문을 멈춰라.
      }
    }
    keyInput.close();

    System.out.println("-------------------------------");

    for (int i = 0; i < count; i++) {
      Members m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no,
          m.name,
          m.email,
          m.tel,
          m.currentTime.toString());
    }
  }
}
