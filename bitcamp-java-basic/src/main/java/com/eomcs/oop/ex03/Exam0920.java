package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0920 {
  static class Monitor {

    // 초기화 문장
    // 변수 선언때 값을 설정하는 걸 초기화 문장이라고 한다.

    int bright = 50;
    int contrast = 50;
    int widthRes = 1920;
    int heightRes = 1080;

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
   // 인스턴스 필드값이 유효한 기본값으로 초기화 되었기 때문에 바로 사용 가능.
   m1.display();
   // 사용자가 속성 값을 바꿀수도 있다.

   m1.bright = 40;
   m1.display();
  }
}
