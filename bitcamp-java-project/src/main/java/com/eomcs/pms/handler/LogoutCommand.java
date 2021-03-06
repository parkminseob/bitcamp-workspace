package com.eomcs.pms.handler;

import java.util.Map;
import com.eomcs.pms.domain.Member;

// Command 규칙에 따라 클래스를 정의한다.
public class LogoutCommand implements Command {

  @Override
  public void execute(Map<String, Object> context) {
    Member loginUser = (Member) context.get("loginUser");
    if(loginUser == null) {
      System.out.println("로그인 상태가 아닙니다.");
      return;
    }
    System.out.printf("%s님 안녕히가세요!", loginUser.getName());
    context.remove("loginUser");
  }
}
