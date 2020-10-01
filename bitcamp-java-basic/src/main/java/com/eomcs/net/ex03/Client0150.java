package com.eomcs.net.ex03;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0150 {
  public static void main(String[] args) {

    try (Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream())) {
      System.out.println("서버와 연결됨!");

      System.out.print("데이터를 보내기 전에 잠깐>");
      keyScan.nextLine();

      out.println("ABC가각간");

      System.out.println("서버에 데이터를 보냄.");

      String str = in.nextLine();
      System.out.println(str);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
