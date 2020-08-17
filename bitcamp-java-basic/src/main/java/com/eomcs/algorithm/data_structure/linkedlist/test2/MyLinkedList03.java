package com.eomcs.algorithm.data_structure.linkedlist.test2;
// 1) MyLinkedList 정의 
// 2) 값을 담을 Node 클래스 설계 
// 3) 첫번째 노드와 마지막 노드의 주소를 담을 필드 설계, 목록 크기를 저장할 필드 설계
public class MyLinkedList03 {

  Node first;
  Node last;
  int size;
  
  static class Node {
    Object value;
    Node next;
  }
  
}
