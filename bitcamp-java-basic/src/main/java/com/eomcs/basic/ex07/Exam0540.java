package com.eomcs.basic.ex07;
// 프로그램 아규먼트 응용
public class Exam0540 {

  public static void main(String[] args) {

    if (args.length < 4) {
      System.out.
      println("실행형식 :  java -cp ./bin/main com.eomcs.basic.ex07.Exam0540 이름 국어 영어 수학");
      return;
    }
    int sum = 0;
    for (int i = 1; i <args.length; i++) {
      sum += Integer.parseInt(args[i]);
    }
      System.out.printf("이름 : %s\n", args[0]);
      System.out.printf("총점 : %d\n", sum);
      System.out.printf("평균 : %.1f\n", sum / 3f);
  }
}
