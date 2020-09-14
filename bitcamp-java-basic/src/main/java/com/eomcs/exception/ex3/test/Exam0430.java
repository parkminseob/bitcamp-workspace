package com.eomcs.exception.ex3.test;

import java.io.IOException;
import java.sql.SQLException;

public class Exam0430 {
  static void m(int i) throws Exception, RuntimeException, SQLException, IOException{
    if(i==0)
      throw new Exception();
    else if (i==1)
      throw new RuntimeException();
    else if (i==2)
      throw new SQLException();
    else if (i==3)
      throw new IOException();
  }
  public static void main(String[] args) {
    // 예외 처리 방법 2:
    // - try ~ catch 를 사용하여 코드 실행 중에 발생된 예외를 중간에 가로챈다.
    //
    try {
      m(4);
      System.out.println("실행성공~");
      // try 블록에 있는 코드를 실행하는 중에
      // 예외가 발생하면,
      // 그 예외 객체를 파라미터로 받을 수 있는
      // catch 문을 찾아 실행한다.
    } catch (IOException e) {
      System.out.println("IOException");
    } catch (SQLException e) {
      System.out.println("SQLException");
    } catch (RuntimeException e) {
      System.out.println("RuntimeException");
    } catch (Exception e) {
      System.out.println("Exception");
    }
  }
}
