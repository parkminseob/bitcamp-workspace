package com.eomcs.pms;

import java.io.File;
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

  public static void main(String[] args) {

    Map<String, Command> commandMap = new HashMap<>();

    commandMap.put("/board/add", new BoardAddCommand(boardList));
    commandMap.put("/board/list",  new BoardListCommand(boardList));
    commandMap.put("/board/detail",  new BoardDetailCommand(boardList));
    commandMap.put("/board/update",  new BoardUpdateCommand(boardList));
    commandMap.put("/board/delete",  new BoardDeleteCommand(boardList));

    List<Member> memberList = new LinkedList<>();
    MemberListCommand memberListCommand = new MemberListCommand(memberList);
    commandMap.put("/member/add",  new MemberAddCommand(memberList));
    commandMap.put("/member/list",  new MemberListCommand(memberList));
    commandMap.put("/member/detail", new MemberDetailCommand(memberList));
    commandMap.put("/member/update",  new MemberUpdateCommand(memberList));
    commandMap.put("/member/delete",  new MemberDeleteCommand(memberList));

    List<Project> projectList = new LinkedList<>();
    commandMap.put("/project/add", new ProjectAddCommand(projectList, memberListCommand));
    commandMap.put("/project/list", new ProjectListCommand(projectList, memberListCommand));
    commandMap.put("/project/detail", new ProjectDetailCommand(projectList, memberListCommand));
    commandMap.put("/project/update",new ProjectUpdateCommand(projectList, memberListCommand));
    commandMap.put("/project/delete", new ProjectDeleteCommand(projectList, memberListCommand));

    List<Task> taskList = new ArrayList<>();
    commandMap.put("/task/add", new TaskAddCommand(taskList, memberListCommand));
    commandMap.put("/task/list", new TaskListCommand(taskList, memberListCommand));
    commandMap.put("/task/detail", new TaskDetailCommand(taskList, memberListCommand));
    commandMap.put("/task/update", new TaskUpdateCommand(taskList, memberListCommand));
    commandMap.put("/task/delete", new TaskDeleteCommand(taskList, memberListCommand));


    commandMap.put("/hello", new HelloCommand());

    Deque<String> commandStack = new ArrayDeque<>();
    Queue<String> commandQueue = new LinkedList<>();

    loop:
      while (true) {
        String inputStr = Prompt.inputString("명령> ");

        // 사용자가 입력한 명령을 보관한다.
        commandStack.push(inputStr);
        commandQueue.offer(inputStr);

        switch (inputStr) {

          // Iterator 패턴을 이용하면,
          // 자료 구조와 상관없이 일관된 방법으로 목록의 값을 조회할 수 있다.
          case "history": printCommandHistory(commandStack.iterator()); break;
          case "history2": printCommandHistory(commandQueue.iterator()); break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            Command command = commandMap.get(inputStr);
            if(command != null) {
              try {
                command.execute();
              } catch (Exception e) {
                System.out.printf("명령 처리 중 오류 발생: %s\n %s\n",
                    e.getClass().getName(),
                    e.getMessage());
              }
            } else {
              System.out.println("실행할 수 없는 명령입니다.");
            }
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();

    saveBoards();
  }

  private static void saveBoards() {
    System.out.println("[게시글 저장]");

    File file = new File("./board.csv");

    FileWriter out = null;
    try {
      out = new FileWriter(file);

      for(Board board : boardList) {
        String record = String.format("%d, %s, %s, %s, %s, %d\n",
            board.getNo(),
            board.getTitle(),
            board.getContent(),
            board.getWriter(),
            board.getRegisteredDate().toString(),
            board.getViewCount());
        out.write(record);
      }
    } catch(IOException e) {
      System.out.println("파일 출력 작업 중 오류 발생.");
    } finally {

      try {
        out.close();
      } catch (Exception e) {
      }
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
