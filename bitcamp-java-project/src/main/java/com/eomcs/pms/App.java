package com.eomcs.pms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.domain.Project;
import com.eomcs.pms.domain.Task;
import com.eomcs.pms.handler.BoardAddCommand;
import com.eomcs.pms.handler.BoardDeleteCommand;
import com.eomcs.pms.handler.BoardDetailCommand;
import com.eomcs.pms.handler.BoardListCommand;
import com.eomcs.pms.handler.BoardUpdateCommand;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.HelloCommand;
import com.eomcs.pms.handler.MemberAddCommand;
import com.eomcs.pms.handler.MemberDeleteCommand;
import com.eomcs.pms.handler.MemberDetailCommand;
import com.eomcs.pms.handler.MemberListCommand;
import com.eomcs.pms.handler.MemberUpdateCommand;
import com.eomcs.pms.handler.ProjectAddCommand;
import com.eomcs.pms.handler.ProjectDeleteCommand;
import com.eomcs.pms.handler.ProjectDetailCommand;
import com.eomcs.pms.handler.ProjectListCommand;
import com.eomcs.pms.handler.ProjectUpdateCommand;
import com.eomcs.pms.handler.TaskAddCommand;
import com.eomcs.pms.handler.TaskDeleteCommand;
import com.eomcs.pms.handler.TaskDetailCommand;
import com.eomcs.pms.handler.TaskListCommand;
import com.eomcs.pms.handler.TaskUpdateCommand;
import com.eomcs.util.Prompt;

public class App {

  static List<Board> boardList = new ArrayList<>();
  static File boardFile = new File("./board/csv");

  static List<Member> memberList = new LinkedList<>();
  static File memberFile = new File("./member/csv");

  static List<Project> projectList = new LinkedList<>();
  static File projectFile = new File("./project/csv");

  static List<Task> taskList = new ArrayList<>();
  static File taskFile = new File("./task/csv");

  public static void main(String[] args) {

    loadBoards();
    loadMembers();
    loadProjects();
    loadTasks();

    // 커맨드 객체를 저장할 맵 객체를 준비한다.
    Map<String,Command> commandMap = new HashMap<>();

    // 맵 객체에 커맨드 객체를 보관한다.
    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(boardList));
    commandMap.put("/board/update", new BoardUpdateCommand(boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(boardList));

    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/add", new MemberAddCommand(memberList));
    commandMap.put("/member/list", memberListCommand);
    commandMap.put("/member/detail", new MemberDetailCommand(memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(memberList));
    commandMap.put("/member/delete", new MemberDeleteCommand(memberList));

    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectList));
    commandMap.put("/project/update", new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList));

    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/list", new TaskListCommand(taskList));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList));

    commandMap.put("/hello", new HelloCommand());

    // 자바에서는 stack 알고리즘(LIFO)에 대한 인터페이스로 Deque 를 제공한다.
    Deque<String> commandStack = new ArrayDeque<>();

    // 자바에서 제공하는 LinkedList 클래스는 Queue 구현체이기도 하다.
    Queue<String> commandQueue = new LinkedList<>();

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }

        // 사용자가 입력한 명령을 보관한다.
        commandStack.push(inputStr);
        commandQueue.offer(inputStr);

        switch (inputStr) {
          case "history": printCommandHistory(commandStack.iterator()); break;
          case "history2": printCommandHistory(commandQueue.iterator()); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            Command command = commandMap.get(inputStr);
              if (command != null) {
                try {
                command.execute();
                } catch(Exception e) {
                  System.out.println("명령어 실행 중 오류 발생");
                }
              } else {
                System.out.println("실행할 수 없는 명령입니다.");
              }
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();

    saveBoards();
    saveMembers();
    saveProjects();
    saveTasks();
  }

  private static void saveBoards() {
    FileWriter out = null;

    try {
      out = new FileWriter(boardFile);
      int count = 0;

      for(Board board : boardList) {
        out.write(board.toCsvString());
        count++;
      }
      System.out.printf("총 %d 개의 게시글 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("게시글 데이터 파일 쓰기 중 오류 발생.");
    } finally {
      try {out.close();} catch (IOException e) {}
    }
  }

  private static void loadBoards() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      // 파일을 읽을 때 사용할 도구를 준비한다.
      in = new FileReader(boardFile);

      // .csv파일에서 한 줄 단위로 문자열을 읽는 기능이 필요한데,
      // FileReader에는 그런 기능이 없다.
      // 그래서 FileReader를 그대로 사용할 수 없고
      // 이 객체에 다른 도구를 연결하여 사용할 것이다.
      dataScan = new Scanner(in);
      int count = 0;

     while(true) {
       try {
         // 파일에서 한 줄 읽는다.
         String line = dataScan.nextLine();

       boardList.add(Board.valueOfCsv(line));
       count++;
       } catch (Exception e) {
         break;
       }
     }
     System.out.println("총 %d 개의 게시글 데이터를 로딩했습니다.");
    } catch (FileNotFoundException e) {
      System.out.println("게시글 파일 읽기 중 오류 발생");
    } finally {
      try{dataScan.close();} catch(Exception e) {}
      try{in.close();} catch(Exception e) {}
    }
  }

  private static void saveMembers() {
    FileWriter out = null;

    try {
      out = new FileWriter(memberFile);
      int count = 0;

      for (Member member : memberList) {
        out.write(member.toCsvString());
        count++;
      }
      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("회원 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
      }
    }
  }


  private static void loadMembers() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(memberFile);
      dataScan = new Scanner(in);
      int count = 0;

      while (true) {
        try {
          String line = dataScan.nextLine();

          memberList.add(Member.valueOfCsv(line));
          count++;

        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", count);

    } catch (FileNotFoundException e) {
      System.out.println("회원 파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {dataScan.close();} catch (Exception e) {}
      try {in.close();} catch (Exception e) {}
    }
  }

  private static void saveProjects() {
    FileWriter out = null;

    try {
      out = new FileWriter(projectFile);
      int count = 0;

      for (Project project : projectList) {

        out.write(project.toCsvString());
        count++;
      }
      System.out.printf("총 %d 개의 프로젝트 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("프로젝트 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {
        out.close();
      } catch (IOException e) {
      }
    }
  }


  private static void loadProjects() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(projectFile);
      dataScan = new Scanner(in);
      int count = 0;

      while (true) {
        try {
          String line = dataScan.nextLine();

          projectList.add(Project.valueOfCsv(line));
          count++;

        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 프로젝트 데이터를 로딩했습니다.\n", count);

    } catch (FileNotFoundException e) {
      System.out.println("프로젝트 파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {dataScan.close();} catch (Exception e) {}
      try {in.close();} catch (Exception e) {}
    }
  }


  private static void saveTasks() {
    FileWriter out = null;

    try {
      out = new FileWriter(taskFile);
      int count = 0;

      for (Task task : taskList) {

        out.write(task.toCsvString());
        count++;
      }
      System.out.printf("총 %d 개의 작업 데이터를 저장했습니다.\n", count);

    } catch (IOException e) {
      System.out.println("작업 데이터의 파일 쓰기 중 오류 발생! - " + e.getMessage());

    } finally {
      try {out.close();} catch (IOException e) {}
    }
  }

  private static void loadTasks() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(taskFile);
      dataScan = new Scanner(in);
      int count = 0;

      while (true) {
        try {
          String line = dataScan.nextLine();

          taskList.add(Task.valueOfCsv(line));
          count++;

        } catch (Exception e) {
          break;
        }
      }
      System.out.printf("총 %d 개의 작업 데이터를 로딩했습니다.\n", count);

    } catch (FileNotFoundException e) {
      System.out.println("작업 파일 읽기 중 오류 발생! - " + e.getMessage());
    } finally {
      try {dataScan.close();} catch (Exception e) {}
      try {in.close();} catch (Exception e) {}
    }
  }

  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        // 5개 출력할 때 마다 계속 출력할지 묻는다.
        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
}
