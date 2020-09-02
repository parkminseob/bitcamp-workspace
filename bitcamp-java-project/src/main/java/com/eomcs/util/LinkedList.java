package com.eomcs.util;

import java.lang.reflect.Array;

public class LinkedList<E> {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  private Node<E> first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  private Node<E> last;

  // 목록 크기를 보관한다.
  private int size;

  // 여러 개의 MyLinkedList 객체가 공유하는 클래스이기 때문에
  // static으로 Node클래스를 설계한다.
  static class Node<E> {
    E value;
    Node<E> next;

    public Node() {}
    public Node(E value) {
      this.value = value;
    }
  }

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
  public int size() {
    return this.size;
  }

  public E[] toArray(E[] arr) {
    if(arr.length < this.size) {

      //      Class<?> arrayClassInfo = arr.getClass();
      //      Class<?> arrayItemClassInfo = arrayClassInfo.getComponentType();
      //      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), this.size());
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), this.size());
    }

    Object[] originArr = this.toArray();
    for (int i = 0; i < this.size(); i++) {
      arr[i] = (E) originArr[i];
    }
    return arr;
  }
}