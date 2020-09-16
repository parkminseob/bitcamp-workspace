package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;

//메서드 레퍼런스 - 생성자 레퍼런스 활용

public class Exam0752 {

  @SuppressWarnings("unchecked")
  static <T> Collection<T> prepareNames(Supplier<Collection<T>> factory, T... values) {
    Collection<T> list = factory.get(); // => new ArrayList<String>()
    for (T value : values) {
      list.add(value);
    }
    return list;
  }

  static<T> void print(Iterator<T> i) {
    while(i.hasNext()) {
      System.out.println(i.next() + ",");
    }
    System.out.println();
  }
  public static void main(String[] args) {

    // 2) 익명 클래스 사용하여 Supplier 구현체 만들기
    Supplier<Collection<String>> supplier = new Supplier<Collection<String>>() {
      @Override
      public Collection<String> get() {
        return new ArrayList<>();
      }
    };
    Collection<String> list = prepareNames(supplier, "홍길동", "임꺽정", "유관순", "임꺽정");
    print(list.iterator());
  }
}
