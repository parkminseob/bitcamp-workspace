package com.eomcs.net.ex04.stateless2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    // 서버에서 이 클라이언트를 구분할 때 사용하는 번호이다.
    // => 0 번으로 서버에 요청하면, 서버가 신규 번호를 발급해 줄 것이다.
    long clientId = 0;

    while(true) {
      System.out.print("연산자? ");
      String op = keyScan.nextLine();

      System.out.print("값? ");
      int value = Integer.parseInt(keyScan.nextLine());

      try(Socket socket = new Socket("localhost", 8888);
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {

        // 서버에 클라이언트 아이디를 보낸다.
        out.writeLong(clientId);

        out.writeUTF(op);
        out.writeInt(value);
        out.flush();

        clientId = in.readLong();

        int result = in.readInt();
        System.out.printf("계산 결과 : %d\n", result);
      } catch(Exception e) {
        System.out.println("서버와 통신 중 오류 발생!");
      }

      System.out.println("계속 하시겠습니까?(Y/n)");
      if(keyScan.nextLine().equalsIgnoreCase("n")) {
        break;
      }
    }
    keyScan.close();
  }
}
