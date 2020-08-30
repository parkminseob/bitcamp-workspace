package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

// 1) `Prompt` 클래스를 별도의 패키지로 분류한다
// 2) 핸들러 클래스들을 별도의 패키지로 분류한다
public class App {

  public static void main(String[] args) {
    
    BoardHandler boardHandler = new BoardHandler();
    BoardHandler boardHandler2 = new BoardHandler();
    
    TaskHandler taskHandler = new TaskHandler();
    MemberHandler memberHandler =  new MemberHandler();
    ProjectHandler projectHandler = new ProjectHandler();
    
    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

        switch (command) {
          case "/member/add": memberHandler.add(); break;
          case "/member/list": memberHandler.list(); break;
          case "/project/add": projectHandler.add(); break;
          case "/project/list": projectHandler.list(); break;
          case "/task/add": taskHandler.add(); break;
          case "/task/list": taskHandler.list(); break;
          case "/board/add": boardHandler.add(); break;
          case "/board/list": boardHandler.list(); break;
          case "/board2/add": boardHandler2.add(); break;
          case "/board2/list": boardHandler2.list(); break;
          
          
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    Prompt.close();
  }
}
