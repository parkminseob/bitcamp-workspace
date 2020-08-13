package com.eomcs.corelib.ex01.test;

import java.util.HashMap;

// hashCode()와 equals() 오버라이딩 하기
public class Exam0153 {

  static class MyKey2 {
    String contents;

    public MyKey2(String contents) {
      this.contents = contents;
    }


    @Override
    public String toString() {
    return "MyKey2 [contents=" + contents + "]";
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((contents == null)? 0 : contents.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey2 other = (MyKey2) obj;
      if (contents == null) {
        if (other.contents != null)
          return false;
      } else if (!contents.equals(other.contents))
        return false;
      return true;
    }
  }

  public static void main(String[] args) {
    HashMap<MyKey2,Student>map = new HashMap<>();

    MyKey2 k1 = new MyKey2("ok");
    MyKey2 k2 = new MyKey2("no");
    MyKey2 k3 = new MyKey2("haha");
    MyKey2 k4 = new MyKey2("ohora");
    MyKey2 k5 = new MyKey2("hul");

    map.put(k1, new Student("홍길동", 20, false));
    map.put(k2, new Student("임꺽정", 30, true));
    map.put(k3, new Student("유관순", 17, true));
    map.put(k4, new Student("안중근", 24, true));
    map.put(k5, new Student("윤봉길", 22, false));

    System.out.println(map.get(k3));

    // equals와 hashCode를 오버라이딩 했으니 다시 k6객체를 새로 생성해보기
    MyKey2 k6 = new MyKey2("haha");

    System.out.println(map.get(k6)); // 정상적으로 출력됨!

    System.out.println(k3 == k6); // 인스턴스는 다르고
    System.out.printf("k3(%s), k6(%s)\n", k3, k6); // 데이터는 같다
    System.out.println(k3.hashCode()); //해쉬도 같다!
    System.out.println(k6.hashCode());
    System.out.println(k3.equals(k6)); // 데이터도 같다!!
  }
}
