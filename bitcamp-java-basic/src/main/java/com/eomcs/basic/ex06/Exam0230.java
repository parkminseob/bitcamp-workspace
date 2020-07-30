package com.eomcs.basic.ex06;

public class Exam0230 {
  public static void main(String[] args) {

    byte b = 2;
    switch (b) {
      case 1 :
      case 2 :
        default:
       }

    short s = 2;
    switch (s) {
      case 1 :
      case 2 :
        default :
    }

    int i = 2;
    switch (i) {
      case 1:
      case 2:
        default :
     }
    //A문자의 유니코드값도 int값이기 때문에 가능
    char c = 'A';
    switch (c) {
      case 'A' :
      case 66 :
      case 0x43 :
        default :

    }
    // String값을 switch와 case 값으로 사용 가능
    String str = "hello";
    switch (str) {
      case "hello":
      case "ohora":
      case "hul":
      default :
    }
  }
}
