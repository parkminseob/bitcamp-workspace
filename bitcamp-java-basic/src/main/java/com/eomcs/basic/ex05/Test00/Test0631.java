package com.eomcs.basic.ex05.Test00;

public class Test0631 {
  public static void main(String[] args) {
    
    //후위 증감응용 2
    
    int i = 7;
    
    i = i++;
    
    //7을 오른쪽 i 값에 넣는다.
    //아직 왼쪽 i에 오른쪽 i값을 넣을 수 없다.
    //오른쪽 i가 +1 추가되어 8이된다.
    //이제 아까 임시 메모리에 저장되었던 7값을 왼쪽 i에 넣는다.
    // i = 7
    
    
    
    System.out.println(i); //7
   
  }
}
