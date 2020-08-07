package com.eomcs.oop.ex03;
// 총정리 - 인스턴스 필드 기본 값 사용
public class Exam0930 {
  static class Monitor {

    int bright; // 밝기 (0% ~ 100%)
    int contrast; // 명암 (0% ~ 100%)
    int widthRes; // 해상도 너비
    int heightRes; // 해상도 높이

    { // 인스턴스 블록 <= 실무에서는 인스턴스 블록 잘 사용하지 않음. 대신 생성자를 주로 사용
      this.bright = 50;

      // 다음과 같이 인스턴스 필드에 값을 직접 대입하지 못하는 경우
      // 이렇게 인스턴스 초기화 블록에서 값을 설정하면 됨.
      // => 값 설정이 복잡하면 초기화 문장이 아닌 인스턴스 초기화 블록 사용.
      if(this.bright < 50) {
        this.contrast = 70;
      } else {
        this.contrast = 40;
      }
        this.widthRes = 1920;
        this.heightRes = 1080;
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
