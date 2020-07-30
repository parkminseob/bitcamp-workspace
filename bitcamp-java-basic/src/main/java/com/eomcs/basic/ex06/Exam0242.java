package com.eomcs.basic.ex06;

import java.util.Scanner;

public class Exam0242 {

  enum Level {
    GUEST, MEMBER, ADMIN
  }
  public static void main(String[] args) {
   Scanner keyScan = new Scanner(System.in);

   System.out.println("레벨을 입력하세요.");
   System.out.println("GUEST");
   System.out.println("MEMBER");
   System.out.println("ADMIN");
   System.out.println(">");

    Level level = Level.MEMBER;

    switch (level) {
      case GUEST:
        System.out.println("조회만 가능합니다.");
        break;
      case MEMBER:
        System.out.println("글 작성 가능합니다.");
        break;
      case ADMIN:
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }


  }
}
