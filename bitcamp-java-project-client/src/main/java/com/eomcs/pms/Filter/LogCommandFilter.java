package com.eomcs.pms.Filter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import com.eomcs.pms.handler.Request;

public class LogCommandFilter implements CommandFilter {
  PrintWriter logOut;

  public LogCommandFilter(File file) throws Exception {
    logOut = new PrintWriter(new FileWriter(file));
  }



  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    //System.out.println("로그남김!");

    logOut.println(request.getCommandPath());
    logOut.flush();
    next.doFilter(request);
  }

  @Override
  public void destroy() {
    logOut.close();
    System.out.println("로그 파일을 닫았습니다.");
  }

  //  @Override
  //  public void doFilter(Request request, FilterChain next) throws Exception {
  //    Queue<String> commandQueue = new LinkedList<>();
  //    commandQueue.offer(request.getCommandPath());
  //
  //    PrintWriter logOut = new PrintWriter(new FileOutputStream("command.log"));
  //    for(String str : commandQueue) {
  //      logOut.println(str);
  //    }
  //    logOut.flush();
  //    next.doFilter(request);
  //  }
}
