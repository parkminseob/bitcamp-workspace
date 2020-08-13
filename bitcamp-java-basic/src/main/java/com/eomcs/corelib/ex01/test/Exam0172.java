package com.eomcs.corelib.ex01.test;

public class Exam0172 {
  
  // 인스턴스 복제 기능을 활성화 하려면 Cloneable 인터페이스를 구현해야 한다.
  // 
  // 인터페이스는 아직 안배웠어
  // 그러니까 중요한건 메소드 선언부에 implements Cloneable을 선언해야 한다는 것이지.
  static class Score implements Cloneable {
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
    @Override
    public Score clone() throws CloneNotSupportedException{
      return (Score) super.clone();
    }
  }
  public static void main(String[] args) throws Exception {
    
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = s1.clone();
    // Score클래스의 복제 기능을 활성화 시켰기 때문에
    // 런타임 에러가 뜨지 않는다.
    
    System.out.println(s1 == s2);
    System.out.println(s1);
    System.out.println(s2);
  }
}
