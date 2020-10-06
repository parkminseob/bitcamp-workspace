package com.eomcs.net.ex11;

import java.net.ServerSocket;

// 계산기 서버 1단계 : 클라이언트 요청에 응답하기
public class CalculatorServer {
  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 실행 중...");

      while(true) {
        RequestProcessor thread = new RequestProcessor(serverSocket.accept());
        thread.start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
