package com.eomcs.pms;

import java.sql.Date;

public class ProjectHandler {

  static class Project{
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String members;
  }
  static final int PLENGTH = 100;
  static Project[] list = new Project[PLENGTH];
  static int psize = 0;


  static void addProject() {
    System.out.println("[프로젝트 등록]");

    Project p = new Project();
    p.no = Prompt.inputInt("번호? ");
    p.title = Prompt.inputString("프로젝트명? ");
    p.content = Prompt.inputString("내용? ");
    p.startDate = Prompt.inputDate("시작일? ");
    p.endDate = Prompt.inputDate("종료일? ");
    p.owner = Prompt.inputString("만든이? ");
    p.members = Prompt.inputString("팀원? ");

    list[psize++] = p;
  }

  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      Project p = list[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          p.no, p.title, p.startDate, p.endDate, p.owner);
    }
  }
}
