package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    class Task {

      int no;
      String context;
      Date enDate;
      String worker;
      String state;

    }
    String project;
    Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[작업]");

    final int LENGTH = 100;
    Task task[] = new Task[LENGTH];

    int count = 0;

    System.out.println("프로젝트1 ");


    for (int i = 0; i < LENGTH; i++) {

      Task t = new Task();
      count++;


      System.out.print("번호? ");
      String str = keyInput.nextLine();
      t.no = Integer.parseInt(str); //문자를 입력 받은 다음에 숫자로 리턴한다.

      System.out.print("내용? ");
      t.context = keyInput.nextLine();

      System.out.print("완료일? ");
      t.enDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");

      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print(">");
      t.state = keyInput.nextLine();

      System.out.print("담당자? ");
      t.worker = keyInput.nextLine();

      task[i] = t;  //내 코드와 다른 추가된 부분

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }
      System.out.println();
    }

    keyInput.close();


    System.out.println("---------------------");

    for (int i = 0; i < count; i++) {

      Task t = task[i];

      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
        default :
          stateTitle = "완료";
      }

      System.out.printf("%d, %s, %s, %s, %s\n",
          t.no,
          t.context,
          t.enDate,
          stateTitle,
          t.worker);
    }


  }
}
