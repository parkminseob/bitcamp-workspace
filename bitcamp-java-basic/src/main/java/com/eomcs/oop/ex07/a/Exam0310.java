package com.eomcs.oop.ex07.a;
// 캡슐화 - 필드값을 변경할 때 마다 특정 작업을 수행하게 하기
class Score3 {
  String name;
  //국영수 점수를 바꿀때 마다 자동으로 합계, 평균 계산하게 하기
  //직접 필드값을 바꾸게 하지 말고 메서드를 통해 바꾸도록 유도한다.
  //그리고 해당 필드의 직접 접근을 막아라.
  private int kor;
  private int eng;
  private int math;

  //메서드를 통해 값을 설정하게 하기
  //보통 필드값을 설정하는 메서드를 setXXX()로 짓는다.
  //세터는 외부에서 호출할 수 있게 공개로 설정한다.
  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }
  public int getKor() {
    return this.kor;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }
  public int getEng () {
    return this.eng;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }
  public int getMath() {
    return this.math;
  }

  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;
  }

  public float getAver() {
    return this.aver;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}
public class Exam0310 {
  public static void main(String[] args) {
    Score3 s1 = new Score3();

    s1.name = "홍길동";
    s1.setKor(100);
    s1.setEng(90);
    s1.setMath(70);

    //점수를 수정해도 합계와 평균이 자동계산된다.
    s1.setEng(55);
    s1.setMath(99);


    System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.getKor(),
        s1.getEng(), s1.getMath(), s1.getSum(), s1.getAver());
  }
}
