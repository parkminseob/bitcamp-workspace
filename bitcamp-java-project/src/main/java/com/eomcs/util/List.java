package com.eomcs.util;

public interface List<E> {

  public abstract boolean add(E e);

  public abstract void add(int index, E value);

  public abstract E get(int index);

  public abstract E set(int index, E e);

  public abstract E remove(int index);

  public abstract Object[] toArray();

  public abstract E[] toArray(E[] arr);

  int size();

  // Iterator 구현체를 리턴해주는 메서드
  Iterator<E> iterator();
}
