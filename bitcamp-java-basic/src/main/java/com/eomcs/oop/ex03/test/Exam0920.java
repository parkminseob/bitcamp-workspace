package com.eomcs.oop.ex03.test;

// 인스턴스 필드 초기화 적용 
public class Exam0920 {
  static class Monitor {

    // 초기화 문장
    // 변수를 선언할 때 값을 설정하는 것을 초기화 문장이라고 한다.
    int bright = 50; // 밝기 (0% ~ 100%)
    int contrast = 50; // 명암 (0% ~ 100%)
    int widthRes = 1920; // 해상도 너비
    int heightRes = 1080; // 해상도 높이

    void display() {
      System.out.println("----------------------------------");
      System.out.printf("밝기(%d)\n", this.bright);
      System.out.printf("명암(%d)\n", this.contrast);
      System.out.printf("해상도(%d x %d)\n", this.widthRes, this.heightRes);
      System.out.println("----------------------------------");
    }
  }
  public static void main(String[] args) {
    Monitor m1 = new Monitor();
    // 인스턴스가 유효한 값으로 초기화 되었기 때문에 바로 사용할 수 있다.
    m1.display();
    m1.bright = 40;
    
    // 특정 속성의 값을 바꾼후에 사용해도 된다.
    m1.display();
  }
}