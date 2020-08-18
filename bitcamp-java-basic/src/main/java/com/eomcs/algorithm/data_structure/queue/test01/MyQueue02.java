package com.eomcs.algorithm.data_structure.queue.test01;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;
// 1) Queue를 구현하기 위해 기존의 MyLinkedList를 상속받는다.
// 2) Queue에 값을 추가하는 offer(Object)를 정의한다.
public class MyQueue02 extends MyLinkedList{

  public boolean offer(Object e) {
    return add(e);
  }
}
