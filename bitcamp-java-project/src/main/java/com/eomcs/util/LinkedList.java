package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> extends AbstractList<E> { 

  private Node<E> first;

  private Node<E> last;

  static class Node<E> {
    E value;
    Node<E> next;

    public Node() {}
    public Node(E value) {
      this.value = value;
    }
  }

  @Override
  public boolean add(E e) {
    Node<E> node = new Node<>();
    node.value = e;

    if (first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }

  @Override
  public E get(int index) {
    if(index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않아요!");
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }


  @Override
  public void add(int index, E element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않아요!");
    }

    Node<E> node = new Node<>(element);
    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node<E> cursor = this.first;
    for (int i = 1; i <= index-1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;
    cursor.next = node;

    if (node.next == null) {
      last = node;
    }

  }

  @Override
  public E remove (int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않아요!");
    }
    size--;

    if (index == 0) {
      Node<E> old = first;
      first = old.next;
      old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index-1; i++) {
      cursor = cursor.next;

    }
    Node<E> old = cursor.next;
    cursor.next = old.next;
    old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.

    if(cursor.next == null) {
      last = cursor;
    }
    return old.value;
  }

  @Override
  public E set(int index, E element) {
    if(index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않아요!");
    }
    Node<E> cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }

    E old = cursor.value;
    cursor.value = element;

    return old;
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node<E> cursor = first;
    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }
    return arr;
  }

  @SuppressWarnings("unchecked")
  @Override
  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {

      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), this.size());
    }

    Object[] originArr = this.toArray();
    for (int i = 0; i < this.size(); i++) {
      arr[i] = (E) originArr[i];
    }
    return arr;
  }
}