package com.eomcs.oop.ex02.util;

public class Score_a {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void computer() {
    this.sum = this.eng + this.kor + this.math;
    this.aver = this.sum / 3f;
  }
  //생성자
  public Score_a(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;

    this.computer();
  }
}