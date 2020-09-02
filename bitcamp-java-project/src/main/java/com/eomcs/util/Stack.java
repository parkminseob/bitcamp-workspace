package com.eomcs.util;

import java.util.EmptyStackException;

//1) Stack을 구현하기 위해 기존에 작성한 MyLinkedList를 상속받는다.
//2) Stack에 값을 추가하는 push()메서드를 정의한다.
//3) Stack에 제일 마지막에 추가한 값을 꺼내는 pop()메서드를 정의한다.
//4) Stack에서 제일 마지막에 입력한 값을 조회하는 peek()을 정의한다.
//5) Stack이 비어있는지 알려주는 empty()를 정의한다.

// 테스트2 : MyStackTest2
//6) Object.clone() 메서드를 오버라이딩 한다 :deep copy

// 테스트3 : MyStackTest3
//7) 제네릭 적용 

public class Stack<E> extends LinkedList<E> implements Cloneable {

  public E push(E item) {
    add(item);
    return item;
  }

  public E pop() {
    if(size()==0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }

  public E peek() {
    if(size()==0) {
      throw new EmptyStackException();
    }
    return get(size() - 1);
  }

  public boolean empty() {
    return this.size() == 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone() throws CloneNotSupportedException {
    // 새 스텍을 만든다 
    Stack<E> newStack = new Stack<E>();

    // 기존 스택 값을 가져온다.
    Object[] values = this.toArray();

    // 기존 스택 값을 새 스택에 넣는다.
    for(Object value : values) {
      newStack.push((E)value);
    }
    return newStack;
  }
}
