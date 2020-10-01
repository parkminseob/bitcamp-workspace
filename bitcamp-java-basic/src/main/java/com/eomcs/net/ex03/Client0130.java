package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client0130 {
  public static void main(String[] args) {


    try (Scanner keyScan = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream())) {
      System.out.println("소켓을 통해 입출력 스트림을 준비했음!");

      System.out.print("데이터를 보내기 전에 잠깐>");
      keyScan.nextLine();

      out.writeInt(123456789);

      System.out.println("서버에 데이터를 보냄.");

      int value = in.readInt();
      System.out.println(value);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
