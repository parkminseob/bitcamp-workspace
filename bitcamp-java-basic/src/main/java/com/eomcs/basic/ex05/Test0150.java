package com.eomcs.basic.ex05;

public class Test0150 {
  public static void main(String[] args) {
    
    byte b = 1;
    short s = 2;
    int i = 3;
    long l = 4;
    float f = 5.5f;
    double d = 6.6;
    boolean bool = true;
    char c = 7;
    
    //byte + byte = int
    //byte r1 = b + b;
    
    //short + short = int
    //short r2 = s + s;
    
    //byte + short = int
    //short r3 = b + s;
    
    //byte + int = int
    int r4 = b + i;
    
    //short + int = int
    int r5 = s + i;
    
    //int + long = long
    //int r6 = i + l;
    
    //long + float = float
    //long r7 = l + f;
    
    //int + float = float
    //int r8 = i +f;
    
    // float + double = double
    //float r9 = f + d; // 컴파일 오류!

    //boolean + int
    //int r12 = bool + i;
  }
}
