package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    class Project { //설계도
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
      String members;
    }

    Scanner keyInput = new java.util.Scanner(System.in);
    final int LENGTH = 100;
    int count = 0;
    Project[] project = new Project[LENGTH]; //레퍼런스 변수 생성 (배선카)
    // project를 100개 생성할 수 있다는 뜻

    System.out.println("[프로젝트]");

    for (int i = 0; i < LENGTH; i++) {
      count++;
      Project p = new Project(); //인스턴스 필드 생성 (식판)
      //여기에서의 변수 p는 클래스 값을 담을 수 있음.
      //그러니까 변수 이름이 뭐든 상관이 없는거지.

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
      Project p = project[i];

      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no,
          p.title,
          p.startDate,
          p.endDate,
          p.owner);
    }
  }
}
