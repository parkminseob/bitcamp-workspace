package com.eomcs.corelib.ex07.test;
// 그냥 스택을 잇터레이터로 조회하면 큐방식으로 출력된다.
import java.util.Iterator;
import java.util.Stack;

public class Exam0230 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("ddd");
    String s5 = new String("eee");

    Stack stack = new Stack();
    stack.push(s1);
    stack.push(s2);
    stack.push(s3);
    stack.push(s4);
    stack.push(s5);

    // 잇터레이터 레퍼 생성한 다음 그 안에 스택.잇터레이터 메소드를 장착한걸
    // get에 넣는다. 잇터레이터는 값을 꺼낼 수 있게한다.
    // hashNext가 true인동안 next()가 실행되며 값을 꺼낸다.
    Iterator get = stack.iterator();
    while(get.hasNext()) {
      System.out.print(get.next() + ",");
    }
    System.out.println();
  }
}
