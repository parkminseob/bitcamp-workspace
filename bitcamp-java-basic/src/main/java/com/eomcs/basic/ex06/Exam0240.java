package com.eomcs.basic.ex06;

public class Exam0240 {
  public static void main(String[] args) {

    int level = 1;

    //상수를 사용하지 않으면 주석을 달아야만 무슨 뜻인지 알 수 있음.

    switch (level) {
      case 0 : // 손님
        System.out.println("조회만 가능합니다.");
        break;
      case 1 : // 일반회원
        System.out.println("글 작성 가능합니다.");
        break;
      case 2 : // 관리자
        System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
        break;
    }

  }
}
