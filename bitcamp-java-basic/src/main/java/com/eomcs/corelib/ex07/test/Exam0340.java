package com.eomcs.corelib.ex07.test;

import java.util.HashSet;

public class Exam0340 {

  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Member other = (Member) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }
  }
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("유관순", 16);

    System.out.printf("equals() : %b\n", v3.equals(v5));
    System.out.printf("hashCode() : %d, %b\n", v3.hashCode(), v5.hashCode());
    System.out.println("---------------------");

    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5);

    print(set);
  }
  static void print(HashSet set) {
    Object[] arr = set.toArray();
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
