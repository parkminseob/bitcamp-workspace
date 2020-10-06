package com.eomcs.net.ex11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {
    Scanner keyboardScanner = new Scanner(System.in);
    while (true) {

      String input = Prompt(keyboardScanner);
      if(input == null) {
        continue;
      } else if (input.equalsIgnoreCase("quit")) {
        break;
      }

      try(Socket socket = new Socket("localhost", 8888);
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

        sendRequest(out, input); // 서버에 요청을 보내기
        receiveResponse(in); // 서버에 실행 결과를 출력

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    keyboardScanner.close();
  }

  static String Prompt(Scanner keyboardScanner) {
    System.out.print("계산식> ");
    String input = keyboardScanner.nextLine();

    if(input.equalsIgnoreCase("quit")) {
      return input;
    } else if (input.split(" ").length != 3) {
      System.out.println("입력 형식이 올바르지 않습니다. 예) 23 + 9");
      return null;
    }
    return input;
  }

  private static void sendRequest(PrintStream out, String message) throws Exception {
    out.println(message);
    out.flush();
  }

  private static void receiveResponse(BufferedReader in) throws Exception {
    while(true) {
      String input = in.readLine();
      if(input.length() == 0) {
        break;
      }
      System.out.println(input);
    }
  }
}
