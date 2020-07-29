package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 II
//
public class Exam0451 {
  public static void main(String[] args) {
    
    int lang2 = 0;
    // 00000000 00000000 00000000 00000000
    
    // 32비트에서 뒤에 8비트를 사용하여 8개의 true/false 값을 저장할 수 있다.
    // 8 비트에서 각 언어에 값을 저장할 비트를 다음과 같다고 가정하자.
    // 00000000
    // ||||||||- css
    // |||||||- html
    // ||||||- php
    // |||||- python
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c
    
    // 이렇게 준비된 32비트 메모리에서 특정 비트의 값을 1로 설정하고 싶다면 
    // 다음과 같이 특정 비트의 값이 1인 수를 OR(|) 연산하라!
    lang2 |= 0x80; // c = true 
    // 00000000 | 10000000 = 10000000

    //lang2 |= 0x00; // c++ = false

    lang2 |= 0x20; // java = true
    // 10000000 | 00100000 = 10100000

    //lang2 |= 0x00; // js = false

    lang2 |= 0x08; // python = true
    // 10100000 | 00001000 = 10101000

    //lang2 |= 0x00; // php = false

    lang2 |= 0x02; // html = true
    // 10101000 | 00000010 = 10101010

    //lang2 |= 0x00; // css = false

    // 실무에서는 이렇게 비트를 이용하여 여러 개의 true/false 상태를 저장하기도 한다.

  }
}
