package com.eomcs.net.ex02;

import java.net.ServerSocket;
import java.util.Scanner;

// 서버란?
// 네트워크 연결을 기다리는 쪽을 가리킨다.
public class Server0220 {
  public static void main(String[] args) throws Exception {
    // 중간에 실행을 잠깐 멈출 때 사용하기 위함.
    Scanner keyboard = new Scanner(System.in);

    System.out.println("서버 실행!");
    // 1) 네트워크 연결을 기다리는 역할을 수행할 객체를 준비한다.
    // => new ServerSocket(포트번호)
    // 현재 실행 중인 프로그램과 포트 번호가 중복되어서는 안된다.
    ServerSocket ss = new ServerSocket(8888, 2);
    // 포트번호
    // 한 컴퓨터에서 네트워크 연결을 기다리는 프로그램의 식별번호이다.
    // OS는 이 번호를 가지고 데이터를 받을 프로그램을 결정한다.

    System.out.println("클라이언트 연결을 기다리는 중...");

    // 사용자가 엔터를 칠 때 까지 리턴하지 않는다.
    keyboard.nextLine();

    ss.close();
    System.out.println("서버 종료!");

    keyboard.close();

  }
}
