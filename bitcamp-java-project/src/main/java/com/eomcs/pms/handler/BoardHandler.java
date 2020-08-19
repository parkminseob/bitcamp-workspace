package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;

public class BoardHandler {
  
  static class Board{
  int no;
  String title;
  String content;
  String writer;
  int countView;
  Date registeredDate;
  }
  static final int LENGTH = 100;
  
  Board[] list = new Board[LENGTH]; // list로 이름을 바꾼다.
  int size = 0;
  
  public void add() {
    System.out.println("[게시글 등록]");
    
    Board board = new Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("글쓴이? ");
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    board.countView = 0;
    list[size++] = board;
  }
  public void list() {
    System.out.println("[게시글 목록]");
    
    for(int i = 0; i < size; i++) {
      Board board = list[i];
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.no,
          board.title,
          board.writer,
          board.registeredDate,
          board.countView);
    }
  }
  
}
