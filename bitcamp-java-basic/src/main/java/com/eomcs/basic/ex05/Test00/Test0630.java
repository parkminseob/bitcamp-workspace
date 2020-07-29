package com.eomcs.basic.ex05.Test00;

public class Test0630 {
  public static void main(String[] args) {
    
    //후위 증감응용 
    
    int i = 7;
    
    int j = i++;
    //i값에 7을 넣는다
    //아직 j에 i값을 넣을 수 없다.(오른쪽 식이 다 끝나지 않았기 때문)
    //i + 1 = 8
    //이제 j값에 i++되기전 값인 7을 넣는다.
    // j = 7
    
    
    
    System.out.println(i); //8
    System.out.println(j); //7
  }
}
