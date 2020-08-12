package com.eomcs.oop.ex07.b.test;
//캡슐화(encapsulation) - 게터와 세터
public class Exam0130 {

  public static void main(String[] args) {

    Customer3 c1 = new Customer3();

    // 인스턴스 변수에 바로 접근할 수 없기때문에 메서드를 통해 값을 넣는다.
    // 셋터를 구비했으니 장착하도록 한다.
    c1.setName("홍길동");
    c1.setAge(300);
    c1.setWeight(100);
    c1.setHeight(-50);

    // 유효한 값이 아니면 필터링 될것이다.
    //값은 게터를 이용해서 꺼내도록 하자.
    System.out.printf("%s, %d, %d, %d\n", c1.getName(), c1.getAge(),
        c1.getWeight(), c1.getHeight());

  }
}
