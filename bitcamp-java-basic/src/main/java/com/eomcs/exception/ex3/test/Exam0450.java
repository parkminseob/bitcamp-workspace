package com.eomcs.exception.ex3.test;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0450 {
  static void m(int i) throws Exception, RuntimeException, SQLException, IOException{
    if(i==0)
      throw new Exception();
    else if(i==1)
      throw new RuntimeException();
    else if(i==2)
      throw new SQLException();
    else if(i==3)
      throw new IOException();
  }
  public static void main(String[] args) {
    try {
      m(1);
    } catch (Exception e) {
      // RuntimeException, SQLException, IOException 모두
      // Exception의 서브 클래스이기 때문에 이 블록에서 모두 처리할 수 있다.
      //
    }
  }
}
