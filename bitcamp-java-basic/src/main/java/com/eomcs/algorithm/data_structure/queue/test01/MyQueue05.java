package com.eomcs.algorithm.data_structure.queue.test01;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;
// 1) Queue를 구현하기 위해 기존의 MyLinkedList를 상속받는다.
// 2) Queue에 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
// 5) Queue.clone() 오버라이딩 : deep copy
public class MyQueue05 extends MyLinkedList implements Cloneable {

  public boolean offer(Object e) {
    return add(e);
  }

  public Object poll() {
    if(size() == 0) {
      return null;
    }
    return remove(0);
  }

  public Object peek() {
    if(size() == 0) {
      return null;
    }
    return get(0);
  }

  @Override
  public MyQueue05 clone() throws CloneNotSupportedException {
    MyQueue05 newQueue = new MyQueue05();
    Object[] value = newQueue.toArray();
    for(Object values : value) {
      newQueue.offer(values);
    }
    return newQueue;
  }
}
