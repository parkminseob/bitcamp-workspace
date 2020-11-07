package com.eomcs.pms.Filter;

import java.util.Map;
import com.eomcs.pms.handler.Command;
import com.eomcs.pms.handler.Request;

// 필터 역할 :
// - Command객체를 찾아 실행한다.
public class DefaultCommandFilter implements CommandFilter {


  @SuppressWarnings("unchecked")
  @Override
  public void doFilter(Request request, FilterChain next) throws Exception {
    // Request보관소에서 context맵 객체를 꺼낸다.
    Map<String, Object> context = request.getContext();

    // context맵에서 Command객체가 들어있는 맵 객체를 꺼낸다.
    Map<String, Command> commandMap = (Map<String, Command>) context.get("commandMap");

    // 사용자가 입력한 명령에 따라 command객체를 실행한다.

    Command command = commandMap.get(request.getCommandPath());
    if (command != null) {
      try {
        command.execute(context);

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
}
