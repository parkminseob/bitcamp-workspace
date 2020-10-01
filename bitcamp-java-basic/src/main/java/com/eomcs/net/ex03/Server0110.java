package com.eomcs.net.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// byteStream
public class Server0110 {
  public static void main(String[] args) {
    Scanner keyboard = null;
    ServerSocket serverSocket = null;

    try {
      keyboard = new Scanner(System.in);
      serverSocket = new ServerSocket(8888);
      System.out.println("클라이언트의 연결을 기다리고 있음.");

      Socket socket = null;
      OutputStream out = null;
      InputStream in = null;

      try {
        socket = serverSocket.accept();
        System.out.println("대기열에서 클라이언트 정보를 꺼내 소켓 생성.");

        out = socket.getOutputStream();
        in = socket.getInputStream();
        System.out.println("클라이언트와 통신할 입출력 스트림이 준비되었음.");

        // Client와 Server의 통신 규칙에 따라 순서대로 입출력 해야 한다.
        // 왜?
        // 입출력은 blocking 모드로 작동하기 때문이다.
        // 즉 read()라는 메서드는 클라이언트가 보낸 데이터를 읽기 전까지 리턴하지 않는다.
        //
        // 클라이언트와 서버 간의 데이터를 주고 받는 통신 규칙을 "프로토콜(protocol)"이라 한다.
        // 클라이언트에서 한 줄의 문자열을 보내면
        // 서버는 한 줄의 문자열을 읽은 후에 응답해야 한다.

        System.out.print("데이터를 읽기 전에 잠깐!");
        keyboard.nextLine();

        System.out.println("클라이언트가 보낸 1바이트를 기다리고 있음.");
        int request = in.read();

        System.out.println(request);

        System.out.print("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();

        // 클라이언트에게 받은 문자열을 그대로 보낸다.
        // 클라이언트가 보낸 데이터를 다 읽을 때 까지는 리턴하지 않는다.
        out.write(request);

        System.out.println("클라이언트에게 데이터를 보냄.");
      } catch (Exception e) {
        e.printStackTrace();
      } finally {
        try {socket.close();} catch(Exception e) {}
        try {out.close();} catch(Exception e) {}
        try {in.close();} catch(Exception e) {}
      }

    } catch(Exception e ) {
      e.printStackTrace();
    } finally {
      try {keyboard.close();} catch(Exception e) {}
      try {serverSocket.close();} catch(Exception e) {}
    }
  }
}
