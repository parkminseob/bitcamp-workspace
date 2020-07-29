package com.eomcs.basic.ex05.Test00;

public class Test0450 {
  public static void main (String[] args) {
    
    //8개의 데이터를 저장하는데 32바이트 소요됨
    
    boolean c, cpp, java, js, python, php, html, css;
    c = true;
    cpp = false;
    java = true;
    js = false;
    python = true;
    php = false;
    html = true;
    css = false;
    
    
    //배열을 써도 8바이트를 사용하게됨
    //boolean 배열을 JVM에서 다룰 땐 각 boolean에 대해 1바이트를 사용한다.
    boolean[] lang = new boolean[8];
    
    lang[0] = true;
    lang[1] = false;
    lang[2] = true;
    lang[3] = false;
    lang[4] = true;
    lang[5] = false;
    lang[6] = true;
    lang[7] = false;
    
    
    //비트 연산자를 사용하면 4바이트 변수 하나에 최대32개의 데이터 저장 가
    int lang2 = 0;
    
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c
    
    lang2 |= 0x80; // c = true
    lang2 |= 0x20; // java = true
    lang2 |= 0x08; // python = true
    lang2 |= 0x02; // html = true
    
    System.out.println(Integer.toBinaryString(lang2));
  }

}
