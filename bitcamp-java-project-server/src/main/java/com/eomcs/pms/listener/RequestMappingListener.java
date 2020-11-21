package com.eomcs.pms.listener;

import java.util.Map;
import com.eomcs.context.ApplicationContextListener;

// 클라이언트 요청을 처리할 커맨드 객체를 준비한다.
public class RequestMappingListener implements ApplicationContextListener {

  Map<String,Object> context;

  @Override
  public void contextInitialized(Map<String,Object> context) {
    try {
      this.context = context;



    } catch (Exception e) {
      System.out.println("서비스 객체를 준비하는 중에 오류 발생!");
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(Map<String,Object> context) {
  }
}
