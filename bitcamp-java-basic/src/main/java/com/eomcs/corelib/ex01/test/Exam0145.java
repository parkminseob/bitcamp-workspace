package com.eomcs.corelib.ex01.test;

public class Exam0145 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }

    @Override
    public int hashCode() {

      String value = String.format("%s,%d,%d,%d,%d,%.1f", this.name,
          this.kor, this.eng, this.math, this.sum, this.aver);

      return value.hashCode();
    }
  }
  public static void main(String[] args) {
    Score s1 = new Score("홍길동",100,100,100);
    Score s2 = new Score("홍길동",100,100,100);
    Score s3 = new Score("홍길동",100,100,90);
    Score s4 = new Score("홍길동",90,100,100);

    System.out.println(s1 == s2); //f
    System.out.println(s1 == s3); //f
    System.out.println(s1 == s4); //f
    System.out.println(s3 == s2); //f
    System.out.println(s2 == s4); //f
    System.out.println(s3 == s4); //f

    System.out.println(s1.hashCode()); //같다
    System.out.println(s2.hashCode()); //같다
    System.out.println(s3.hashCode()); //다른해시코드
    System.out.println(s4.hashCode()); //다른해시코드

  }
}
