package com.eomcs.oop.ex06.a.test;

public class Exam0115 {
  public static void main(String[] args) {
    Car c = new Sedan();
    
    // Vehicle 인스턴스 변수 
    c.model = "졸려";
    c.capacity = 5;
    // Car 인스턴스 변수 
    c.cc = 890;
    c.valve = 16;
    
    // 레퍼런스 타입의 범위를 벗어나서 사용할 수 없음
    c.sunroof = true; //안돼!!
    
    // 해결책?
    // 레퍼런스 변수가 실제 가리키는 것이 무엇인지 알려준다.
    
    ((Sedan)c).sunroof = true;
    
    // 또는 인스턴스의 원래 클래스 레퍼런스에 저장한 다음 사용
    Sedan s = (Sedan) c;
    s.sunroof = true;
    
    // 근데 이렇게 하지말자
    // 어차피 실행할때 오류 발생한다.
  }
}
