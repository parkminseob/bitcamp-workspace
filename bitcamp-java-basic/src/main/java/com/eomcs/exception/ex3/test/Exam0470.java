package com.eomcs.exception.ex3.test;
//던지는 예외 받기 - Throwable 변수로 예외를 받지 말라!

import java.io.IOException;
import java.sql.SQLException;

public class Exam0470 {
  static void m(int i) throws Exception, RuntimeException, SQLException, IOException{
    if(i==0)
      throw new Exception();
    else if(i==1)
      throw new RuntimeException();
    else if(i==2)
      throw new SQLException();
    else if(i==3)
      throw new IOException();
    else if(i<0)
      throw new Error();
  }
  public static void main(String[] args) {
    try {
      m(-1);
    } catch (Exception e) {
      System.out.println("어플리케이션 에러 발생");
    } catch (Error e) {
      System.out.println("시스템예외");
      // 가능한 Error 계열의 시스템 예외를 받지 말라!
      // 혹 받더라도 현재 프로그램을 종료하기 전에
      // 필수적으로 수행해야 하는 마무리 작업만 수행하도록 하라.
      // 왜?
      // 시스템 예외는 당장 프로그램을 정상적으로 실행할 수 없는 상태일 때 발생한다.
      // 정상적인 복구가 안되는 예외이다.
      // 따라서 이 예외를 처리하려 해서는 안된다.
      // 시스템을 멈출 수 밖에 없다.
    }
  }
}
