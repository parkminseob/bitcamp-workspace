package com.eomcs.oop.ex06.a.test;

public class Exam0210 {
  public static void main(String[] args) {
    Vehicle v1 = new Sedan();
    
    v1.model = "Tico";
    v1.capacity = 5;
    
    // 자바 컴파일러는 레퍼런스의 클래스를 보고 사용할 수 있는 변수/메서드 인지 아닌지
    // 판단한다. 비록 v1 변수에 들어있는 것이 Sedan 객체 주소라 하더라도
    // 실제 들어 있는 객체 주소로 판단하지 않고 레퍼런스가 어떤 클래스냐에 따라 판단하기 때문이다.
    
    //        v1.cc = 1980; // 컴파일 오류!
    //        v1.valve = 16; // 컴파일 오류!
    //        v1.sunroof = true; // 컴파일 오류!
    //        v1.auto = true; // 컴파일 오류!
    
    // 그럼에도 불구하고 레퍼런스가 실제 가리키는 객체의 모든 메모리에
    // 접근하고 싶다면 형변환해라~
    ((Sedan)v1).cc = 1980;
    ((Sedan)v1).valve = 16;
    ((Sedan)v1).sunroof = true;
    ((Sedan)v1).auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        v1.model, v1.capacity,
        ((Sedan)v1).cc, ((Sedan)v1).valve,
        ((Sedan)v1).sunroof, ((Sedan)v1).auto);
  }
}
