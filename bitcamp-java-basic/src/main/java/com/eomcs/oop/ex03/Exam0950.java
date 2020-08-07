package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0950 {
  static class Monitor {

    int bright; // 밝기 (0% ~ 100%)
    int contrast = 50; // 명암 (0% ~ 100%)
    int widthRes; // 해상도 너비
    int heightRes = 1080; // 해상도 높이

    // 만약 생성자가 한 개라도 있으면 컴파일러는 기본 생성자를 추가하지 않음.
    Monitor(int bright, int contrast) {
      this.bright = bright;
      this.contrast = contrast;
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
    // 기본 생성자가 없는 경우 다음과 같이 기본 생성자를 지정할 수 없음!
    // new Monitor();

    //생성자가 원하는 타입의 원하는 갯수의 값을 줘야함.
    //new Monitor(3f, 2);

   Monitor m1 = new Monitor(50, 50); //모니터 인스턴스 생성
   m1.display();
  }
}
