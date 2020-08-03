package com.eomcs.basic.ex07;
 // 가변 파라미터와 배열 파라미터
public class Exam0260 {

  // 가변 파라미터
  // 리턴값을 받지않음.
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님? 오늘도 증말 멋쟁이시네용!!\n", names[i]);
    }
  }
  // 배열 파라미터

  static void hello2(String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님! 오늘도 조은하루되세요~~~~\n", names[i]);
    }
  }

  public static void main(String[] args) {

    //가변 파라미터에서 메소드를 호출할때는
    //다음과 같이 낱개의 값을 여러개 줄 수도 있고
    hello("홍삼","인삼","산삼","도라지");
    System.out.println("------------------");

    //또는 다음과 같이 배열에 담아서 전달할 수도 있다.
    String[] arr = {"홍삼","인삼","산삼","도라지"};

    hello(arr);
    System.out.println("--------------------");

    //배열 파라미터는 낱개의 값을 전달할 수 없음.
    //hello2("감자","고구마","토란","생강");

    //꼭 배열에 넣어서 전달해야함!
    String[] arr2 = {"감자","고구마","토란","생강"};
    hello2(arr2);
    System.out.println("----------------");
  }
}
