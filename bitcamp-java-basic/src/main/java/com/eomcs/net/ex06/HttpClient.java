package com.eomcs.net.ex06;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//HTTP 클라이언트 만들기

// Http요청 프로토콜
//---------------------------------
// GET [자원주소] HTTP/1.1 (CRLF)
// Host : [서버주소] (CRLF)
// (CRLF)
//---------------------------------
//
// 프로토콜(protocol)?
// 클라이언트/서버 간의 통신 규칙
// 데이터를 주고 받는 규칙

public class HttpClient {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("maximiliang.dothome.co.kr", 80);
    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    // HTTP요청 프로토콜에 따라 서버에 전송
    // => macOS에서 JVM을 실행할 때, println()은 문자열 뒤에 0a(LF) 코드만 붙인다.
    // => 이를 해결하려면, 다음과 같이 명확하게 CRLF 코드를 붙여라.
    //
    out.print("GET http://maximiliang.dothome.co.kr HTTP/1.1\r\n");
    out.print("Host: maximiliang.dothome.co.kr\r\n");
    out.print("\r\n");

    while(true) {
      try {
        System.out.println(in.nextLine());
      } catch (Exception e) {
        break;
      }
    }
    out.close();
    in.close();
    socket.close();
  }
}
