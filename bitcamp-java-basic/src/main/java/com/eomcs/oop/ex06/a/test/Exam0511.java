package com.eomcs.oop.ex06.a.test;
// 다형적 변수와 instanceof 연산자

public class Exam0511 {
  public static void main(String[] args) {
    Vehicle v = new Sedan();
    
    // instanceof 연산자?
    // 레퍼런스에 들어있는 주소가 특정 클래스의 인스턴스인지 검사한다.
    // 또는 그 하위 클래스의 인스턴스인지 검사한다.
    System.out.println(v instanceof Sedan);
    System.out.println(v instanceof Car);
    System.out.println(v instanceof Vehicle);
    System.out.println(v instanceof Object);
    
    // v는 Sedan을 가리키고있다
    // v는 Sedan의 인스턴스 주소를 담고있다.
    // v는 Car의 인스턴스 주소를 담고있다.(Sedan이 Car를 상속했음)
    // v는 Vehicle 인스턴스 주소를 담고있다.(Car가 Vehicle을 상속했음)
    // v는 Object의 인스턴스 주소를 담고있다.(Object는 최상위 조상이다.)
    
    // 오른쪽에 큰 단위(수퍼클래스또는 자기자신)가 오면 true라고 생각하고
    // 작은단위(서브클래스와 상속관계에 없는 클래스)가 오면 false이다.
    System.out.println(v instanceof Tico);
    System.out.println(v instanceof Truck);
    System.out.println(v instanceof Bike);
    
  }
}
