package com.eomcs.net.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0110 {
  public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(8888);
        Scanner keyScan = new Scanner(System.in)) {

      System.out.println("서버 실행");

      try (Socket socket = serverSocket.accept();
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          PrintWriter out = new PrintWriter(socket.getOutputStream())) {

        System.out.println("클라이언트가 연결되었음!");

        while(true) {
          String name = in.readLine();
          if(name.equalsIgnoreCase("quit")) {
            out.println("Goodbye");
            out.flush();
            break;
          }
          out.printf("%s님 반갑습니다~\n", name);
          out.flush();
        }
      }
      System.out.println("클라이언트와 연결 해제.");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
