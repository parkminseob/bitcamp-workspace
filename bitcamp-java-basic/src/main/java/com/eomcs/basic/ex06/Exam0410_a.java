// 반복문 for
package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0410_a {
  public static void main(String[] args) {

  ArrayList<String> scores = new ArrayList<String>();
  scores.add("헐!1");
  scores.add("헐!2");
  scores.add("헐!3");
  scores.add("헐!4");
  scores.add("헐!5");

  for (Object value : scores) {
    System.out.println(value);
  }

  }
}
