package com.eomcs.util;

import java.util.NoSuchElementException;

public abstract class AbstractList<E> implements List<E>{
  protected int size;

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<E> iterator(){
    Iterator<E> iterator = new Iterator<E>() {

      int cursor;

      @Override
      public boolean hasNext() {
        return cursor < AbstractList.this.size();
      }

      @Override
      public E next() {
        if(cursor == size()) {
          throw new NoSuchElementException();
        }
        return get(cursor++);
      }
    };
    return iterator;
    //리턴하는거는 인스턴스 주소거나 리터럴뿐이다. 클래스가 아니다!
  }
}
