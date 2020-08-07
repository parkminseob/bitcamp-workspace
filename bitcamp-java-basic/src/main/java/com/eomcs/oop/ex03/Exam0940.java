package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0940 {
  static class Monitor {

    int bright; // 밝기 (0% ~ 100%)
    int contrast; // 명암 (0% ~ 100%)
    int widthRes; // 해상도 너비
    int heightRes; // 해상도 높이

    {
      System.out.println("인스턴스 초기화 블록 실행!");
      bright = 20;
      contrast = 20;
      widthRes = 800;
      heightRes = 600;
    }

    // 호출될 생성자는 new 명령에서 지정한다.
    // 파라미터를 받지 않는 생성자(파라미터 없는 생성자)를
    // 기본 생성자(default constructor)라 부른다.
    Monitor() {
      System.out.println("생성자 실행!");
      this.bright = 50;
      this.contrast = 50;
      this.widthRes = 1920;
      this.heightRes = 1080;
      // 인스턴스 초기화 블럭이 있는데 생성자가 필요한 이유
      // 생성자는 외부에서 초기화시킬 값을 받을 수 있다.
      // 다만 현재의 생성자는 기본 생성자로서 외부로부터 값을 받지 않기때문에
      // 인스턴스 초기화블록이랑 다를 바가 없다.
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
   Monitor m1 = new Monitor(); //모니터 인스턴스 생성
   // 인스턴스 필드값이 유효한 기본값으로 초기화 되었기 때문에 바로 사용 가능.
   m1.display();
   // 사용자가 속성 값을 바꿀수도 있다.

   m1.bright = 40;
   m1.display();
  }
}
