package com.eomcs.corelib.ex01.test;

public class Exam0162 {
  public static void main(String[] args) {

    String[] obj2 = new String[10];
    Class<?> classInfo = obj2.getClass();
    System.out.println(classInfo.getName());

    Class<?> compTypeInfo = classInfo.getComponentType();
    System.out.println(compTypeInfo.getName());
  }
}
