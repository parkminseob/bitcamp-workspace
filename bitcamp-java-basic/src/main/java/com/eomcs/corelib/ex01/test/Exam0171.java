package com.eomcs.corelib.ex01.test;

public class Exam0171 {
  
  // 인스턴스를 복제할 수 있으려면
  // Object에서 제공하는 clone()을 호출할 수 있어야 한다.
  // 하지만 clone()은 protected라서
  // 오버라이딩 후 사용해야한다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    public Score() {}
    
    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum /3f;
    }
    
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }
    // 오버라이딩한 clone() 메서드를 다른 패키지 멤버들도 쓸 수 있게
    // public으로 접근범위를 넓힌다.
    // 오버라이딩 할 때는 클래스 타입을 변경할 수 있다!
    
    @Override
    public Score clone() throws CloneNotSupportedException{
      // 복제를 위한 코드는 따로 작성할 필요가 없다.
      // JVM이 알아서 해줄것이다.
      // 상속받은 메서드를 오버라이딩하고, 접근 권한을 public으로 확대한다.
      // 리턴 타입은 해당 클래스 이름으로 변경한다.
      return (Score) super.clone();
    }
  }
  public static void main(String[] args) throws Exception {
    
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = s1.clone(); //런타임에러!
    // 런타임 에러 뜨는 이유
    // clone()메서드를 오버라이딩 했다고 끝나는 것이 아니라
    // Score 클래스에 복제 기능을 활성화시키는 설정을 해야한다.
    
    // 이 다음 예제를 살펴보자!
    
    System.out.println(s1 == s2);
    System.out.println(s1);
    System.out.println(s2);
  }
}
