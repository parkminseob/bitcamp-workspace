package com.eomcs.algorithm.data_structure.stack.test01;

import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;
// 1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받기.
// 2) Stack에 값을 추가하는 push()메서드 정의
// 3) Stack에 제일 마지막에 추가한 값을 꺼내는 pop()메서드 정의
// 4) Stack에서 제일 마지막에 입력한 값을 조회하는 peek()메서드 정의
// 5) Stack이 비어있는지 알려주는 empty()를 정의한다.

// 테스트2 : MyStackTest2
// 6) Object.clone() 메서드를 오버라이딩 한다 :deep copy
// 7) 제네릭 적용
public class MyStack<E> extends MyLinkedList<E> implements Cloneable{

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size()-1);
  }

  public E peek() {
    if(size() == 0) {
      throw new EmptyStackException();
    }
    return get(size()-1);
  }

  public boolean empty() {
    return this.size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public MyStack<E> clone() throws CloneNotSupportedException {
    MyStack<E> newStack = new MyStack<>();

    for(Object value : this.toArray()) {
      newStack.push((E)value);
    }
    return newStack;
  }

}

















