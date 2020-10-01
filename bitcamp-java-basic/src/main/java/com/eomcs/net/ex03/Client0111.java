package com.eomcs.net.ex03;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0111 {
  public static void main(String[] args) {


    try (Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream()) {
      System.out.println("소켓을 통해 입출력 스트림을 준비했음!");

      System.out.print("데이터를 보내기 전에 잠깐>");
      keyScan.nextLine();
      // 서버에게 데이터 보내기
      // - 보통 클라이언트 쪽에서 먼저 서버로 데이터를 보낸다.
      // - 실제 write()는 소켓의 내부 버퍼로 출력한다.
      //   따라서 write() 호출 후 즉시 리턴될 것이다.
      // - 즉 상대편에서 읽을 때까지 기다리는 것이 아니다.
      // - 보낼 데이터를 랜카드의 메모리에 올려 놓으면 바로 리턴한다.
      out.write(100);

      System.out.println("서버에 데이터를 보냄.");

      int response = in.read();
      System.out.println(response);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
