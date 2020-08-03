package com.eomcs.pms;

import java.sql.Date; //Date는 java.sql에 속해있는 클래스라고 선언을 해준다
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project { //식판 설계도?
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;
    }

    final int LENGTH = 100;
    Project project[] = new Project[LENGTH]; //식판

    Scanner keyInput = new java.util.Scanner(System.in);

    int count = 0;

    System.out.println("[프로젝트]");

    for ( int i = 0; i < LENGTH; i++) {
      count++;

      Project p = new Project(); //반찬,밥 등 내용물을 담는곳

      System.out.print("번호: ");
      p.no = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("프로젝트명: ");
      p.title = keyInput.nextLine();

      System.out.print("내용: ");
      p.content = keyInput.nextLine();

      System.out.print("시작일: ");
      p.startDate = java.sql.Date.valueOf(keyInput.nextLine());

      System.out.print("종료일: ");
      p.endDate = java.sql.Date.valueOf(keyInput.nextLine());


      System.out.print("만든이: " );
      p.owner = keyInput.nextLine();

      System.out.print("팀원: ");
      p.members = keyInput.nextLine();

      project[i] = p;

      System.out.println();
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (!response.equalsIgnoreCase("y"))
        break;
      System.out.println();

    }
    keyInput.close();

    System.out.println("-----------------------");

    for (int i = 0; i < count; i++) {

      Project p = project[i]; //project라는 식판을 이용해서 결과값 담기

      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no,
          p.title,
          p.startDate,
          p.endDate,
          p.owner);
    }
  }
}
