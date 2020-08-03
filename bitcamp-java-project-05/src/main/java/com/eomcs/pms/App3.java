package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[작업]");

    final int LENGTH = 100;
    int count = 0;


    int[] no = new int[LENGTH];
    String[] context = new String[LENGTH];
    Date[] enDate = new Date[LENGTH];
    String[] worker = new String[LENGTH];
    String[] state = new String[LENGTH];



    System.out.println("프로젝트1 ");


    for (int i = 0; i < LENGTH; i++) {
      count++;


      System.out.print("번호? ");
      String str = keyInput.nextLine();
      no[i] = Integer.parseInt(str); //문자를 입력 받은 다음에 숫자로 리턴한다.

      System.out.print("내용? ");
      context[i] = keyInput.nextLine();

      System.out.print("완료일? ");
      enDate[i] = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.println("상태? ");

      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print(">");
      state[i] = keyInput.nextLine();

      System.out.print("담당자? ");
      worker[i] = keyInput.nextLine();

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
      String stateTitle;
      switch (state[i]) {
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
          no[i], context[i], enDate[i], stateTitle, worker[i]);
    }

  /*  switch (state) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
*/


  }
}
