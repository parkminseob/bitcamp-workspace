package com.eomcs.basic.ex05.Test00;

public class Test0451 {
  public static void main (String[] args) {
    
    int lang2 = 0;
    
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
    
    System.out.println(Integer.toBinaryString(lang2));
    
  }

}
