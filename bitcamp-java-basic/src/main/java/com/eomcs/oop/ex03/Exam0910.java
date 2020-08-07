package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0910 {
  static class Monitor {
    // 인스턴스 변수(클래스 변수 포함)가 생성되면 0으로 자동 초기화 된다.
    // byte, short, int, long = 0
    // float, double = 0.0
    // boolean = false
    // char = '\u0000'

    // 로컬 변수는 자동 초기화 되지 않으므로 주의!

    int bright;
    int contrast;
    int widthRes;
    int heightRes;

    void display() {
      System.out.println("---------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d)\n", this.widthRes, this.heightRes);
      System.out.println("---------------------------");
    }

  }
  public static void main(String[] args) {
   Monitor m1 = new Monitor(); //모니터 인스턴스 생성

   m1.display(); //출력결과는 모두 0


   // 모니터를 만든 후 출하 전에
   // 모니터의 기본값을 설정해주자.

   // 다음은 모니터 인스턴스를 사용하는 사용자가 직접 0부터 셋팅하여 사용하는 예.
   m1.bright = 50;
   m1.contrast = 50;
   m1.widthRes = 1920;
   m1.heightRes = 1080;

   m1.display();
  }
}
