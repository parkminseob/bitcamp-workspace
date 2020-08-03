package com.eomcs.pms;

import java.sql.Date;
//클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.util.Scanner;

// 1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//    메모리를 설계한다. => Member 클래스 정의
//
public class App_a {
  public static void main(String[] args) {
    // 값을 담기 위해 메모리를 준비할 때
    // 어떤 종류의 메모리를 준비해야 하는지 설꼐도를 작성한다.
    // => 이것을 "클래스 정의"라고 부른다.
    class Member {
     int no;
     String name;
     String email;
     String password;
     String photo;
     String tel;
     Date now;
   }

   Scanner keyInput = new Scanner(System.in);
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
    keyInput.close();

    System.out.println("-------------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i], now[i].toString());
    }
  }
}
