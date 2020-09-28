package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

// 대기열 크기 조정
public class Server0220 {
  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.println("서버 실행");

    // => new ServerSocket(포트번호, 대기열크기);
    //
    ServerSocket ss = new ServerSocket(8888, 2);
    System.out.println("서버소켓 생성완료");
    System.out.println("클라이언트 연결을 기다리는중");

    // 잠깐 멈추기
    // => 클라이언트가 접속하게 하라!
    // => 최대 몇 개까지 접속 가능한가?
    s.nextLine();

    ss.close();
    System.out.println("서버종료");

    s.close();

  }
}
