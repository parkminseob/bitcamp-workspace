package com.eomcs.basic.ex07;

public class Exam0220 {
  // 예2) 메서드 : 리턴값(x), 파라미터(o)
  // 메서드 블록을 실행할 떄 값이 필요하면 파라미터 변수 선언하기.
  // 돈 줄 테니까 밥먹고와!

  static void hello(String name, int age) {
    // 파라미터란?
    // 메서드를 실행할 때 사용할 값을 외부로부터 받기 위해 선언한 로컬 변수.
    // 메서드 실행때 생성되고 메서드 실행이 끝나면 제거된다.
    System.out.printf("%d살 %s님 반갑습니다~\n", age, name);
  }

public static void main(String[] args) {

  System.out.println("main()11111");

  hello("홍길동", 20);

  System.out.println("main()22222");

  hello("임꺽정", 30);

  System.out.println("main()333333");

  hello("유관순", 18);

  System.out.println("main()44444444");

  }
// 아규먼트(argument)
//- 메서드를 호출할 때 넘겨주는 값
//- 예) hello("홍길동", 20);
//"홍길동", 20 이 아규먼트이다.
//
//파라미터(parameter)
//- 아규먼트를 받는 변수
//- 예) void hello(String name, int age) {...}
//name과 age 변수가 파라미터이다.
//
//현장에서는 "아규먼트"와 "파라미터"를 구분하지 않고 사용한다.

}


