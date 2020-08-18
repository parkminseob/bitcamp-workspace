package com.eomcs.algorithm.data_structure.stack.test01;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;
// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받기.
// 2) Stack에 값을 추가하는 push()메서드 정의
public class MyStack02 extends MyLinkedList{

  public Object push(Object item) {
    add(item);
    return item;
  }

}
