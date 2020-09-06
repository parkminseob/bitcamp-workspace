package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Project;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class ProjectHandler {

  ArrayList<Project> projectList = new ArrayList<>();
  MemberHandler memberHandler;

  public ProjectHandler(MemberHandler memberHandler) {
    this.memberHandler = memberHandler;
  }

  public void add() {
    System.out.println("[프로젝트 등록]");

    Project project = new Project();
    project.setNo(Prompt.inputInt("번호? "));
    project.setTitle(Prompt.inputString("프로젝트명? "));
    project.setContent(Prompt.inputString("내용? "));
    project.setStartDate(Prompt.inputDate("시작일? "));
    project.setEndDate(Prompt.inputDate("종료일? "));

    while (true) {
      String name = Prompt.inputString("만든이?(취소: 빈 문자열) ");

      if (name.length() == 0) {
        System.out.println("프로젝트 등록을 취소합니다.");
        return;
      } else if (memberHandler.findByName(name) != null) {
        project.setOwner(name);
        break;
      }

      System.out.println("등록된 회원이 아닙니다.");
    }

    StringBuilder members = new StringBuilder();
    while (true) {
      String name = Prompt.inputString("팀원?(완료: 빈 문자열) ");

      if (name.length() == 0) {
        break;
      } else if (memberHandler.findByName(name) != null) {
        if (members.length() > 0) {
          members.append(",");
        }
        members.append(name);
      } else {
        System.out.println("등록된 회원이 아닙니다.");
      }
    }
    project.setMembers(members.toString());

    projectList.add(project);
  }

  public void list() {
    System.out.println("[프로젝트 목록]");
    for (int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      System.out.printf("%d, %s, %s, %s, %s, [%s]\n",
          project.getNo(),
          project.getTitle(),
          project.getStartDate(),
          project.getEndDate(),
          project.getOwner(),
          project.getMembers());
    }
  }

  public void detail() {
    System.out.println("[프로젝트 상세조회]");
    int index = Prompt.inputInt("번호? ");
    Project project = findByNo(index);

    if(project == null) {
      System.out.println("해당 번호의 프로젝트가 없습니다.");
      return;
    }
    System.out.printf("프로젝트명 : %s\n", project.getTitle());
    System.out.printf("내용 : %s\n", project.getContent());
    System.out.printf("기간 : %s ~ %s\n", project.getStartDate(), project.getEndDate());
    System.out.printf("만든이 : %s\n", project.getOwner());
    System.out.printf("팀원: %s\n", project.getMembers());
  }

  public void delete() {
    System.out.println("[프로젝트 삭제]");
    int no = Prompt.inputInt("번호? ");
    int index = indexOf(no);

    if(index == -1) {
      System.out.println("등록된 프로젝트가 없습니다.");
      return;
    }

    String response = Prompt.inputString("정말 삭제하시겠습니까?(y/N)");
    if(response.equalsIgnoreCase("y")) {
      projectList.remove(index);
      System.out.println("프로젝트를 삭제했습니다.");
    } else {
      System.out.println("프로젝트 삭제를 취소했습니다.");
      return;
    }
  }

  public void update() {
    System.out.println("[프로젝트 업데이트]");
    int no = Prompt.inputInt("번호? ");
    Project project = findByNo(no);

    if(project == null) {
      System.out.println("등록된 프로젝트가 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("프로젝트명? ", project.getTitle()));
    String content = Prompt.inputString(String.format("내용? ", project.getContent()));
    Date startDate = Prompt.inputDate(String.format("시작일? ", project.getStartDate()));
    Date endDate = Prompt.inputDate(String.format("종료일? ", project.getEndDate()));
    String owner = Prompt.inputString(String.format("만든이? ", project.getOwner()));
    String member = Prompt.inputString(String.format("팀원? ", project.getMembers()));

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N)");
    if(!response.equalsIgnoreCase("y")) {
      System.out.println("변경 취소.");
      return;
    }

    project.setTitle(title);
    project.setContent(content);
    project.setStartDate(startDate);
    project.setEndDate(endDate);
    project.setOwner(owner);
    project.setMembers(member);

    System.out.println("프로젝트 정보 변경 완료");
  }

  private int indexOf(int no) {
    for(int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if(project.getNo() == no) {
        return i;
      }
    }
    return -1;
  }

  private Project findByNo(int index) {
    for(int i = 0; i < projectList.size(); i++) {
      Project project = projectList.get(i);
      if(project.getNo() == index) {
        return project;
      }
    }
    return null;
  }
}
