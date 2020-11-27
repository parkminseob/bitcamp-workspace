package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;

// Command 규칙에 따라 클래스를 정의한다.
@WebServlet("/board/add")
public class BoardAddServlet extends HttpServlet {
  private static final long serialVersionUID = 1;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ServletContext ctx = request.getServletContext();
    BoardService boardService =
        (BoardService) ctx.getAttribute("boardService");

    Board board = new Board();
    request.setCharacterEncoding("UTF-8");
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));


    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta http-equiv='Refresh' content='1;url=list'>");
    out.println("<title>게시글 등록</title></head>");
    out.println("<body>");

    try {
      out.println("<h1><b>게시물 등록</h1>");

      Member loginUser = new Member();
      loginUser.setNo(16);
      board.setWriter(loginUser);

      boardService.add(board);

      out.println("게시글을 등록하였습니다.");

    } catch (Exception e) {
      out.printf("<p>작업 처리 중 오류 발생! - %s</p>\n", e.getMessage());
      StringWriter errout = new StringWriter();
      e.printStackTrace(new PrintWriter(errout));
      out.printf("<pre>%s</pre>\n", errout.toString());
    }
    out.println("</body>");
    out.println("</html>");
  }
}

