package com.eomcs.util;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

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

  // 수퍼클래스의 iterator()는 ListIterator를 리턴한다.
  // ListIteraotr는 Stack으로 목록을 관리하는 방식과 다르게 데이터를 조회한다.
  // 따라서 Stack에 맞는 Iterator를 리턴할 필요가 있다.
  // => 오버라이딩을 해서 상속받은 메서드를 서브 클래스에 맞게 재정의.

  @Override
  public Iterator<E> iterator(){
    try {
      return new StackIterator<E>(this.clone());
    } catch (Exception e) {
      // 스택을 복제하다가 오류가 발생하면
      // 이 메서드를 호출한 쪽에 오류 내용을 전달한다.
      throw new RuntimeException("스택 복제 중에 오류 발생");
    }
  }

  private static class StackIterator<E> implements Iterator<E>{

    Stack<E> stack;

    public StackIterator(Stack<E> stack) {
      this.stack = stack;
    }

    @Override
    public boolean hasNext() {
      return !stack.empty();
    }

    @Override
    public E next() {
      if(stack.empty()) {
        throw new NoSuchElementException();
      }
      return stack.pop();
    }
  }

}
