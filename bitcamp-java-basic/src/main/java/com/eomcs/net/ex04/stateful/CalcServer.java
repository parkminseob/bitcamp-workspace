package com.eomcs.net.ex04.stateful;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

// stateful방식 계산기 만들기
public class CalcServer {
  public static void main(String[] args) throws Exception {
    System.out.println("서버 실행중..");
    ServerSocket ss = new ServerSocket(8888);

    while(true) {
      Socket socket = ss.accept();
      try {
        processRequset(socket);
      } catch(Exception e) {
        System.out.println("클라이언트 요청 처리 중 오류 발생!");
        System.out.println("다음 클라이언트의 요청을 처리합니다.");
      }
    }
  }

  private static void processRequset(Socket socket) throws Exception {
    try (Socket socket2 = socket;
        DataInputStream in = new DataInputStream(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream())) {

      loop : while(true) {
        int a = in.readInt();
        String op = in.readUTF();
        int b = in.readInt();
        int result = 0;

        switch(op) {
          case "+": result = a + b; break;
          case "-": result = a - b; break;
          case "*": result = a * b; break;
          case "/": result = a / b; break;
          case "quit" : break loop;
        }
        out.printf("%d %s %d = %d\n", a, op, b, result);
      }
    out.println("goodbye!");
    }
  }


}
