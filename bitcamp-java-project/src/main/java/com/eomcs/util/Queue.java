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
    class QueueIterator<T> implements Iterator<T>{

      Queue<T> queue;

      @SuppressWarnings("unchecked")
      public QueueIterator() {
        try {
          // 큐는 한 번 poll() 하면 데이터가 제거된다.
          // 따라서 복제본을 만들어 사용한다.
          queue = (Queue<T>) Queue.this.clone();
        } catch (Exception e) {
          // 큐를 복제할 때 오류가 발생한다면,
          // 이 메서드를 호출한 쪽에 실행 오류를 던진다.
          throw new RuntimeException("Queue복제하는 중에 오류 발생!");
        }
      }

      @Override
      public boolean hasNext() {
        return queue.size() > 0;
      }

      @Override
      public T next() {
        if(queue.size() == 0) {
          throw new NoSuchElementException();
        }
        return queue.poll();
      }
    }
    return new QueueIterator<E>();
  }
}
