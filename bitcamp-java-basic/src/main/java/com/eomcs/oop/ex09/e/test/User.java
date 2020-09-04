package com.eomcs.oop.ex09.e.test;

import com.eomcs.oop.ex09.e.test.project1.FirstComputer;
import com.eomcs.oop.ex09.e.test.project2.SecondComputer;
import com.eomcs.oop.ex09.e.test.project3.ThirdComputer;
import com.eomcs.oop.ex09.e.test.project4.NewComputer2;

public class User {
  public static void main(String[] args) {

    //1970
    play(new FirstComputer());

    //1980
    play(new SecondComputer());

    //1990
    play(new ThirdComputer());

    play(new NewComputer2());
  }

  static void play(Computer computer) {
    computer.compute();
    computer.touch();
    System.out.println("--------------");
  }
}
