package com.eomcs.oop.ex07.b.test;
//캡슐화(encapsulation) - 게터와 세터
public class Exam0140 {

  public static void main(String[] args) {

    Customer4 c1 = new Customer4();

    // 인스턴스 변수에 바로 접근할 수 없기때문에 메서드를 통해 값을 넣는다.
    // 셋터를 구비했으니 장착하도록 한다.
    c1.setName("홍길동");
    c1.setAge(300);
    c1.setWeight(100);
    c1.setHeight(-50);

    // 유효성 검증 코드를 넣지 않았기 때문에
    // 입력값이 그대로 출력된다.
    System.out.printf("%s, %d, %d, %d\n", c1.getName(), c1.getAge(),
        c1.getWeight(), c1.getHeight());

  }
}
