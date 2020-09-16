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
  static List<Member> memberList = new LinkedList<>();
  static List<Project> projectList = new LinkedList<>();
  static List<Task> taskList = new ArrayList<>();

  static File boardFile = new File("./board.csv");
  static File memberFile = new File("./member.csv");
  static File projectFile = new File("./project.csv");
  static File taskFile = new File("./task.csv");

  public static void main(String[] args) {

    loadBoards();
    loadMembers();
    loadProjects();
    loadTasks();

    Map<String,Command> commandMap = new HashMap<>();

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

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        if (inputStr.length() == 0) {
          continue;
        }

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
                // 실행 중 오류가 발생할 수 있는 코드는 try 블록 안에 둔다.
                command.execute();
              } catch (Exception e) {
                // 오류가 발생하면 그 정보를 갖고 있는 객체의 클래스 이름을 출력한다.
                System.out.println("--------------------------------------------------------------");
                System.out.printf("명령어 실행 중 오류 발생: %s\n", e);
                System.out.println("--------------------------------------------------------------");
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println();
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

      for(Board board : boardList) {

        out.write(board.toCsvString());
      }

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
      in = new FileReader(boardFile);

      dataScan = new Scanner(in);

      while(true) {
        try {
          boardList.add(Board.valueOfCsv(dataScan.nextLine()));
        } catch (Exception e) {break;}
      }
    } catch(FileNotFoundException e) {
      System.out.println("게시글 파일 읽기 중 오류 발생.");
    } finally {
      try{dataScan.close();} catch(Exception e) {}
      try {in.close();} catch(Exception e) {}
    }
  }


  private static void saveMembers() {
    FileWriter out = null;

    try {
      out = new FileWriter(memberFile);

      for(Member member : memberList) {
        out.write(member.toCsvString());
      }

    } catch (IOException e) {
      System.out.println("회원 데이터 파일 쓰기 중 오류 발생.");
    } finally {
      try {out.close();} catch (IOException e) {}
    }

  }

  private static void loadMembers() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(memberFile);
      dataScan = new Scanner(in);

      while(true) {
        try {
          memberList.add(Member.valueOfCsv(dataScan.nextLine()));

        } catch (Exception e) {break;}
      }
    } catch(FileNotFoundException e) {
      System.out.println("회원 파일 읽기 중 오류 발생.");
    } finally {
      try{dataScan.close();} catch(Exception e) {}
      try {in.close();} catch(Exception e) {}
    }
  }

  private static void saveProjects() {
    FileWriter out = null;

    try {
      out = new FileWriter(projectFile);

      for(Project project : projectList) {
        out.write(project.toCsvString());
      }

    } catch (IOException e) {
      System.out.println("프로젝트 데이터 파일 쓰기 중 오류 발생.");
    } finally {
      try {out.close();} catch (IOException e) {}
    }

  }

  private static void loadProjects() {
    FileReader in = null;
    Scanner dataScan = null;

    try {
      in = new FileReader(projectFile);
      dataScan = new Scanner(in);

      while(true) {
        try {
          projectList.add(Project.valueOfCsv(dataScan.nextLine()));

        } catch (Exception e) {break;}
      }
    } catch(FileNotFoundException e) {
      System.out.println("프로젝트 파일 읽기 중 오류 발생.");
    } finally {
      try{dataScan.close();} catch(Exception e) {}
      try {in.close();} catch(Exception e) {}
    }
  }


  private static void saveTasks() {
    FileWriter out = null;

    try {
      out = new FileWriter(taskFile);

      for(Task task : taskList) {
        out.write(task.toCsvString());
      }

    } catch (IOException e) {
      System.out.println("작업 데이터 파일 쓰기 중 오류 발생.");
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

      while(true) {
        try {
          taskList.add(Task.valueOfCsv(dataScan.nextLine()));

        } catch (Exception e) {break;}
      }
    } catch(FileNotFoundException e) {
      System.out.println("작업 파일 읽기 중 오류 발생.");
    } finally {
      try{dataScan.close();} catch(Exception e) {}
      try {in.close();} catch(Exception e) {}
    }
  }


  static void printCommandHistory(Iterator<String> iterator) {
    try {
      int count = 0;
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
        count++;

        if ((count % 5) == 0 && Prompt.inputString(":").equalsIgnoreCase("q")) {
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("history 명령 처리 중 오류 발생!");
    }
  }
}
