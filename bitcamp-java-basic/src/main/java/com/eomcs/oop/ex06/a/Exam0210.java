package com.eomcs.oop.ex06.a;

public class Exam0210 {
  public static void main(String[] args) {
    Vehicle v1 = new Sedan();

    v1.model = "티코";
    v1.capacity = 5;

//    v1.cc = 1980;
//    v1.valve = 16;
//    v1.sunroof = true;
//    v1.auto = true;

    // 자바 컴파일러는 레퍼런스의 클래스를 보고 사용할 수 있는 변수/메서드 인지 아닌지
    // 판단한다. 비록 v1 변수에 Sedan 객체의 주소가 들어 있다 할지라도,
    // 실제 들어 있는 객체의 주소로 판단하지 않고 레퍼런스가 어떤 클래스냐에 따라 판단한다.
    
    // 그럼에도 레퍼런스가 실제로 가리키는 객체의 모든 메모리에 접근하고 싶다면
    // 형변환 시키면 된다!
    ((Sedan)v1).cc = 1980;
    ((Sedan)v1).valve = 16;
    ((Sedan)v1).sunroof = true;
    ((Sedan)v1).auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        v1.model, v1.capacity,
        ((Sedan)v1).cc, ((Sedan)v1).valve,
        ((Sedan)v1).sunroof, ((Sedan)v1).auto);

    // 각각의 변수를 일일이 형변환 하기 불편하니
    // 그냥 레퍼런스를 형변환해서 쓰기
    Sedan s = (Sedan)v1;
    s.cc = 1980;
    s.valve = 16;
    s.sunroof = true;
    s.auto = true;

    System.out.printf("%s, %d, %d, %d, %b, %b\n",
        s.model, s.capacity,
        s.cc, s.valve, s.sunroof, s.auto);
  }
}
