package com.eomcs.util;

import java.util.NoSuchElementException;

public class Queue<E> extends LinkedList<E> implements Cloneable{

  public boolean offer(E e) {
    return add(e);
  }

  public E poll() {
    if(size() == 0) {
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if(size() == 0) {
      return null;
    }
    return get(0);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Queue<E> clone() throws CloneNotSupportedException {
    Queue<E> newMyQueue = new Queue<E>();
    Object[] values = this.toArray();
    for(Object value : values) {
      newMyQueue.offer((E)value);
    }
    return newMyQueue;
  }

  // 상속 받은 메서드가 서브 클래스의 역할에 맞지 않다면
  // 역할에 맞게끔 재정의 하라. => overriding
  // AbstractList로부터 상속받은 iterator()는 ListIterator객체를 리턴한다.
  // ListIterator는 입력한 순서대로 조회한다.
  // Queue도 입력한 순서대로 조회하는 것은 같다. 다만 맨앞의 값을 꺼내서 삭제한다.
  // 따라서 Queue 방식에 맞게 동작하는 Iterator를 리턴하도록 하라.
  @Override
  public Iterator<E> iterator() {
    try {
      return new QueueIterator<E>(this.clone());
    } catch (Exception e) {
      throw new RuntimeException("Queue복제하는 중에 오류 발생!");
    }
  }

  private static class QueueIterator<E> implements Iterator<E>{

    Queue<E> queue;

    public QueueIterator(Queue<E> queue) {
      this.queue = queue;
    }

    @Override
    public boolean hasNext() {
      return queue.size() > 0;
    }

    @Override
    public E next() {
      if(queue.size() == 0) {
        throw new NoSuchElementException();
      }
      return queue.poll();
    }
  }
}
