package com.eomcs.net.ex11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class RequestProcessor extends Thread {

  Socket socket;

  public RequestProcessor(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try(Socket socket = this.socket;
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream out = new PrintStream(socket.getOutputStream())) {

      // 웹 브라우저가 보낸 첫줄에는 데이터가 포함되어 있기 때문에 따로 추출한다.
      String requestLine = in.readLine();

      while(true) {
        if(in.readLine().length() == 0) {
          break;
        }
      }
      sendHttpResponse(out, compute(requestLine));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String compute (String request) {
    try {
      // 웹 브라우저가 보낸 requestLine에서 데이터를 추출한다.
      // 예) "GET /plus?a=100&b=200 HTTP/1.1"
      String[] values = request.split(" ")[1].split("\\?"); // ["/plus", "a=100&b=200"]
      String operator = getOperator(values[0]); // "/plus", "/minus" 등

      String[] parameter = values[1].split("&"); // "a=100&b=200" ==> ["a=100", "b=200"]
      int a = 0;
      int b = 0;

      for(String parameters : parameter) {
        String[] kv = parameters.split("=");
        if(kv[0].equals("a")) {
          a = Integer.parseInt(kv[1]);
        } else if (kv[0].equals("b")) {
          b = Integer.parseInt(kv[1]);
        }
      }

      int result = 0;
      switch (operator) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        case "*": result = a * b; break;
        case "/": result = a / b; break;
        default :
          return "해당 연산자를 지원하지 않습니다.";
      }
      return String.format("결과는 %d %s %d = %d", a, operator, b, result);
    } catch (Exception e) {
      return String.format("계산 중 오류 발생! -%s", e.getMessage());
    }
  }

  private String getOperator(String name) {
    switch(name) {
      case "/plus": return "+";
      case "/minus": return "-";
      case "/multiple": return "*";
      case "/devide": return "/";
      default:
        return "?";
    }
  }

  private void sendHttpResponse(PrintStream out, String message) throws Exception {
    out.println("HTTP/1.1 200 OK");
    out.println("Content-Type: text/plain;charset=UTF-8");
    out.println();
    out.print(message);
    out.flush();
  }
}
