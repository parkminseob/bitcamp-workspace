package com.eomcs.oop.ex07.b.test;

public class Customer3 {
  private String name;
  private int age;
  private int weight;
  private int height;

  // 외부에서 인스턴스 변수의 접근을 제한했기 때문에 값을 넣거나 조회할 수 없다.
  // 이를 가능하게 만드는 수단/방법(method)를 제공해야 한다.
  // 값을 넣는 메서드는 보통 set으로 시작하고, 그래서 setter라고 부른다.

  // 인스턴스 변수 name의 값을 넣는 메소드
  public void setName(String name) {
    // 이 메서드에서 유효성 검사를 한다.
    if (name == null) {
      this.name = "이름없음";
      return;
    }

    if(name.length() < 2) {
      this.name = "이름없음";
      return;
    }

    if (name.length() > 5) {
      this.name = name.substring(0,5);
    } else {
      this.name = name;
    }

  }

  public void setAge(int age) {
    if (age < 1 || age > 120) {
      this.age = 0;
      return;
    }
  }
  public void setWeight(int weight) {
    if (weight < 1 || weight > 200) {
      this.weight = 0;
      return;
    }
    this.weight = weight;
  }

  public void setHeight(int height) {
    if (height < 1 || height > 300) {
      this.height = 0;
      return;
    }
    this.height = height;
  }
  // 외부에서 인스턴스 변수를 조회할 수 있는 메서드를 제공한다.
  // 보통 get으로 시작해서 getter라고 부른다.

  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public int getHeight() {
    return this.height;
  }
  public int getWeight() {
    return this.weight;
  }

}
