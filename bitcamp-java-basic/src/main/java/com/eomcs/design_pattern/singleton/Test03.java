// Singleton 연습 : 김밥 인스턴스를 한 개만 생성하도록  Singleton 패턴을 적용하라. 
package com.eomcs.design_pattern.singleton;

class Kimbap {
  // 클래스 안의 코드를 완성하시오.
  int price;

  private static Kimbap instance;

  private Kimbap() {}

  public static Kimbap getInstance() {
    if(instance == null) {
      instance = new Kimbap();
    }
    return instance;
  }

}

public class Test03 {
  public static void main(String[] args) {
    // 다음 코드는 컴파일 오류를 발생시켜야 한다.
    //Kimbap bap1 = new Kimbap();

    Kimbap bap2 = Kimbap.getInstance();
    Kimbap bap3 = Kimbap.getInstance();
    Kimbap bap4 = Kimbap.getInstance();
    System.out.println(bap2 == bap3); // true;
    System.out.println(bap4 == bap3);
  }
}








