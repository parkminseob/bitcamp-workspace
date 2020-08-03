package com.eomcs.pms;

import java.util.Scanner;

// 1) 명령 프롬프트를 출력한다
// 2) 명령어를 입력 받아 출력한다

public class App {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    while(true) {
    System.out.print("명령> ");
    String command = keyInput.nextLine();

    if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit")) {
      break;
    }

    System.out.println(command);

    }

    keyInput.close();
    System.out.println("종료!");
    /*

    System.out.println("[회원]");

    // 최대 5명의 회원 정보를 입력 받는 변수를 선언

    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] password = new String[5];
    String[] photo = new String[5]; //배열임을 알 수 있가 String 뒤에 [] 을 붙인다.
    String[] tel = new String[5];
    Date[] now = new Date[5];

    long currentMillis = 0;
    int count = 0;


    for (int i = 0; i < 5; i++) {
      count++;

      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      name[i] = keyInput.nextLine();

      System.out.print("이메일?");
      email[i] = keyInput.nextLine();

      System.out.print("암호?");
      password[i] = keyInput.nextLine();

      System.out.print("사진?");
      photo[i] = keyInput.nextLine();

      System.out.print("전화?");
      tel[i] = keyInput.nextLine();

      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);

      System.out.println(); //빈줄 출력

      System.out.print("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y") == false) {
        break; //반복문을 멈춰라.
      }
    }

    System.out.println("-------------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i], now[i].toString());
    }
    */
  }
}
