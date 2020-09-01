package com.eomcs.generic.ex01.test;
// 제네릭 사용 전 - 다형적 변수 활용 
public class Exam0111 {

  // Object로 변수타입 선언

  static class ObjectBox{
    Object value;

    public void set(Object value) {
      this.value = value;
    }

    public Object get() {
      return value;
    }
  }
  public static void main(String[] args) {

    ObjectBox box1 = new ObjectBox();
    box1.set(new Member("홍길동", 20));
    Member m = (Member)box1.get(); //값을 꺼낼 때 형변환 해야함 
    System.out.println(m);

    ObjectBox box2 = new ObjectBox();
    box2.set(new String("Hello"));
    String str = (String)box2.get();
    System.out.println(str);

    ObjectBox box3 = new ObjectBox();
    box3.set(100);
    int i = (int)box3.get();

    System.out.println(i);

    // 객체의 타입 별로 Box 클래스를 구분해서 쓰지 않으니 코딩이 편하다. 
    // 단 값을 꺼낼 때 원래의 타입으로 바꾸기 위해 형변환(type casting) 해야 하는 불편함이 있다.
    //
  }
}
