package com.eomcs.net.ex02;
//클라이언트 만들기

import java.net.Socket;

public class Client0110 {
  public static void main(String[] args) throws Exception {
    // 클라이언트?
    // 연결을 요청하는 쪽을 가리키는 용어다.
    // 서버?
    // 연결 요청을 받는 쪽을 가리키는 용어다.

    // 1) 서버에 연결 요청을 할 때 사용할 도구 준비
    // 서버와의 연결이 이루어지면 Socket 객체를 리턴
    // 클라이언트 측의 포트 번호는 OS가 자동으로 부여한다.
    Socket socket = new Socket("localhost", 8888);
    // 첫번째 위치에 Ip주소 또는 도메인명
    // 두번째 위치에 포트번호
    // IP주소가 회사 대표 번호라면, 포트 번호는 내선 번호라 할 수 있다.

    System.out.println("서버와 연결되었음!");

    // 2) 서버와 연결 해제
    // 작업이 끝난 후에는 명시적으로 서버와 연결을 해제하는 것이 좋다.
    // 서버측에서 해당 클라이언트와 연결하기 위해 사용한 자원을 빠르게 해제할 수 있기 때문.

    socket.close();
    System.out.println("연결 종료!");
  }
}
