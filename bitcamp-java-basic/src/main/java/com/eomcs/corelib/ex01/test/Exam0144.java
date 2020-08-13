package com.eomcs.corelib.ex01.test;
//hash코드 오버라이딩
public class Exam0144 {
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
    // hashCode()를 오버라이딩하면 원하는 값을 리턴할 수 있따.
    @Override
    public int hashCode() {
      // 무조건 모든 Score 인스턴스가 같은 해시코드를 갖게하기!
      return 1000;
    }
  }
  public static void main(String[] args) {
    Score s1 = new Score("홍길동",100,100,100);
    Score s2 = new Score("홍길동",100,100,100);
    Score s3 = new Score("홍길동",10,60,50);

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());

    // 이로서 hashcode가 주소값이 아니란게 증명됐다.
    // 하지만 이런식으로 hashCode로 오버라이딩하는건 의미가없다!
  }
}
