package com.eomcs.oop.ex09.e.test.project4;

import com.eomcs.oop.ex09.e.test.Computer2;
//4번째 프로젝트에서 터치 기능이 들어간 새 컴퓨터를 만들기로 했다.
//방법1)
//=> touch 기능이 추가된 새 규칙(Computer2)을 정의한다.
//=> 그리고 새 컴퓨터(NewComputer1)는 그 규칙에 따라 만든다.
public class NewComputer implements Computer2 {

  @Override
  public void compute() {
    System.out.println("새컴퓨터..");
  }

  @Override
  public void touch() {
    System.out.println("이젠 터치까지? 대박이네..");
  }
}
