package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class ProjectHandler {
//프로젝트 데이터
 static class Project {
   int no;
   String title;
   String content;
   Date startDate;
   Date endDate;
   String owner;
   String members;
 }
 static final int LENGTH = 100;
 static Project[] list = new Project[LENGTH];
 static int psize = 0;
 
 
 public static void add() {
   System.out.println("[프로젝트 등록]");
   
   Project project = new Project();
   project.no = Prompt.inputInt("번호? ");
   project.title = Prompt.inputString("프로젝트명? ");
   project.content = Prompt.inputString("내용? ");
   project.startDate = Prompt.inputDate("시작일? ");
   project.endDate = Prompt.inputDate("종료일? ");
   project.owner = Prompt.inputString("만든이? ");
   project.members = Prompt.inputString("팀원? ");

   list[psize++] = project;
 }
 
 public static void list() {
   System.out.println("[프로젝트 목록]");
   
   for (int i = 0; i < psize; i++) {
     Project project = list[i];
     System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
         project.no, project.title, project.startDate,
         project.endDate, project.owner);
   }
 }
 
}
