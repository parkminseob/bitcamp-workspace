package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// byteStream
public class Server0130 {
  public static void main(String[] args) {

    try (Scanner keyboard = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("클라이언트의 연결을 기다리고 있음.");

      try( Socket socket = serverSocket.accept();
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {
        System.out.println("대기열에서 클라이언트 정보를 꺼내 소켓 생성.");
        System.out.println("클라이언트와 통신할 입출력 스트림이 준비되었음.");

        System.out.println("클라이언트가 보낸 int값을 기다리고 있음.");
        int value = in.readInt();
        System.out.println(value);

        System.out.print("데이터를 보내기 전에 잠깐!");
        keyboard.nextLine();

        out.writeInt(value);
        System.out.println("클라이언트에게 데이터를 보냄.");
      }
      System.out.println("클라이언트와 연결을 끊었음.");
    } catch(Exception e ) {
      e.printStackTrace();
    }
    System.out.println("서버 종료!");
  }
}
