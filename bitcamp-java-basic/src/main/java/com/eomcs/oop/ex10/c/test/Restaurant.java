package com.eomcs.oop.ex10.c.test;

public class Restaurant extends Building {
  @Override
  public void startEffect() {
    System.out.println("뚝따라뚝딱딱스");  
  }
  @Override
  public void endEffect() {
    System.out.println("밥 잘 먹고 다녀라~");    
  }
}
