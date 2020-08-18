package com.eomcs.algorithm.data_structure.linkedlist.test2;
// 1) MyLinkedList 정의
// 2) 값을 담을 Node 클래스 설계
// 3) 첫번째 노드와 마지막 노드의 주소를 담을 필드 설계, 목록 크기를 저장할 필드 설계
// 4) add()메서드 설계
// 5) get()메서드 정의
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object)메서드 정의
public class MyLinkedList06 {

  Node first;
  Node last;
  int size;

  static class Node {
    Object value;
    Node next;

    public Node() {}
    public Node(Object value) {
      this.value = value;
    }

  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;

    if(first == null) {
      first = node;
    } else {
      last.next = node;
    }
    last = node;
    size++;
    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size ) {
      throw new IndexOutOfBoundsException("유효하지 않은 인덱스!!");
    }
    Node cursor = this.first;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

   public void add​(int index, Object element) {
     if (index < 0 || index > this.size ) {
       throw new IndexOutOfBoundsException("유효하지 않은 인덱스!!");
     }
     Node node = new Node(element);
     size++;

     if(index == 0) {
     node.next = first;
     first = node;
     return;
     }

     Node cursor = this.first;
     for(int i = 1; i <= index-1; i++) {
       cursor = cursor.next;
     }
     node.next = cursor.next;
     cursor.next = node;

     if(node.next == null) {
       last = node;
     }
   }
}





















