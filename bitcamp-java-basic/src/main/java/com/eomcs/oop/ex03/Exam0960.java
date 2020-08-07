package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0960 {
  static class Monitor {

    int bright; // 밝기 (0% ~ 100%)
    int contrast = 50; // 명암 (0% ~ 100%)
    int widthRes; // 해상도 너비
    int heightRes = 1080; // 해상도 높이

    // 여러 개의 생성자 정의하기
    Monitor() {
      this.bright = 50;
      this.contrast = 50;
      this.heightRes = 1200;
      this.widthRes = 2560;
      System.out.println("Monitor()");
    }

    Monitor(int bright, int contrast) {
      this.bright = bright;
      this.contrast = contrast;
      System.out.println("Monitor(int, int)");
    }

    Monitor(int bright, int contrast, int widthRes, int heightRes){
      this.bright = bright;
      this.contrast = contrast;
      this.heightRes = heightRes;
      this.widthRes = widthRes;
      System.out.println("Monitor(int, int, int, int)");
    }

    void display() {
      System.out.println("---------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d)\n", this.widthRes, this.heightRes);
      System.out.println("---------------------------");
    }
  }
  public static void main(String[] args) {
   Monitor m1 = new Monitor();
   Monitor m2 = new Monitor(50, 50); //모니터 인스턴스 생성
   Monitor m3 = new Monitor(50, 50, 1920, 1080);
   m1.display();
   m2.display();
   m3.display();
  }
}
