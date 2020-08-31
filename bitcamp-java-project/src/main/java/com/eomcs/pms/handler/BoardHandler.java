package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.ArrayList;
import com.eomcs.util.Prompt;

public class BoardHandler {

  ArrayList<Board> boardList = new ArrayList();

  public void add() {
    System.out.println("[게시물 등록]");

    Board board = new Board();
    board.setNo(Prompt.inputInt("번호? "));
    board.setTitle(Prompt.inputString("제목? "));
    board.setContent(Prompt.inputString("내용? "));
    board.setWriter(Prompt.inputString("작성자? "));
    board.setRegisteredDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    // boardList.add(new String("okok")); 문법적으로 이런걸 막을수가 없다!
    boardList.add(board);

    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시물 목록]");
    Board[] boards = new Board[boardList.size()];
    boardList.toArray(boards);
    for (Board board : boards) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          board.getNo(),
          board.getTitle(),
          board.getWriter(),
          board.getRegisteredDate(),
          board.getViewCount());
    }
  }
  
  public void detail() {
    System.out.println("[게시글 상세조회]");
    int no = Prompt.inputInt("번호? ");
    Board board = findByNo(no);
    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
    } else {
      board.setViewCount(board.getViewCount() + 1);
      System.out.printf("제목: %s\n", board.getTitle());
      System.out.printf("내용: %s\n", board.getContent());
      System.out.printf("등록일: %s\n", board.getRegisteredDate());
      System.out.printf("조회수: %s\n", board.getViewCount());
    }
  }
  
  private Board findByNo(int no) {
    for(int i = 0; i< boardList.size(); i++) {
      Board board = boardList.get(i);
      if(board.getNo() == no) {
        return board;
      }
    }
    return null;
  }
}
