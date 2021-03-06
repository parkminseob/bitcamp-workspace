// Object 클래스 - clone()사용법 
package com.eomcs.corelib.ex01.test;
// clone()은 인스턴스를 복제할 때 호출하는 메서드이다.
public class Exam0170 {

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
      this.aver = this.sum / 3f;
    }
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor="+ kor + ", eng="+
    eng + ", math=" + math + ",sum=" + sum + ", aver=" + aver + "]";
    }
  }
  public static void main(String[] args) {
    
    Score s1 = new Score("홍길동", 100,100,100);
    System.out.println(s1);
    
    // 인스턴트 복제하기
    // 방법1) 직접 복제하기. 즉 새 객체를 만들어 기존 객체의 값 저장.
    Score s2 = new Score(s1.name, s1.kor, s1.eng, s1.math);
    System.out.println(s1==s2); //다른 인스턴스다!
    
    System.out.println(s1);
    System.out.println(s2);
    // 들어있는 값은 같다.
    
    // 방법2
    // Object에서 상속받은 clone()메서드 호출
    //Score s3 = s1.clone();
    
    // clone()메서드는 protected이다.
    // 따라서 같은 패키지에 소속된 클래스이거나 상속 받은 서브클래스가 아니면 호출할 수 없다.
    
    // 해결책
    // Object에서 상속받은 clone()을 오버라이딩 하라!
    // Test0171.java 살펴보기
  }
}
