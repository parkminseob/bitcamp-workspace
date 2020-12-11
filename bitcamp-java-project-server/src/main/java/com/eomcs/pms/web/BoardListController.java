package com.eomcs.pms.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
  private static final long serialVersionUID = 1;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    ServletContext ctx = request.getServletContext();
    BoardService boardService =
        (BoardService) ctx.getAttribute("boardService");

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head><title>게시글목록</title></head>");
    out.println("<body>");
    try {
      out.println("<h1><b>게시물 목록</h1>");

      out.println("<a href='form.html'>새 글</a><br>");

      List<Board> list = boardService.list();
      out.println("<table border='1'>");
      out.println("<thead><tr>");
      out.println("<th>번호</th>"
          + "<th>제목</th>"
          + "<th>작성자</th>"
          + "<th>등록일</th>"
          + "<th>조회수</th>"
          + "</tr></thead>");

      out.println("<tbody>");
      for (Board board : list) {
        out.printf("<tr>"
            + "<td>%d</td>"
            + "<td><a href='detail?no=%d'>%s</a></td>"
            + "<td>%s</td>"
            + "<td>%s</td>"
            + "<td>%d</td>"
            + "</tr>\n",
            board.getNo(),
            board.getNo(),
            board.getTitle(),
            board.getWriter().getName(),
            board.getRegisteredDate(),
            board.getViewCount());

      }
      out.println("</tbody>");
      out.println("</table>");

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