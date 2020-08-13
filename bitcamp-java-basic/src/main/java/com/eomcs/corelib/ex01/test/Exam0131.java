package com.eomcs.corelib.ex01.test;
//equals() 오버라이딩
public class Exam0131 {
  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;
    obj1.tel = "1111-1111";
    obj1.email = "gong@gog";
    obj1.gender = 1;
    obj1.working = false;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    obj2.tel = "1111-1111";
    obj2.email = "gong@gog";
    obj2.gender = 1;
    obj2.working = false;

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));


    My my1 = new My();
    My my2 = new My();
    System.out.println(my1.equals(my2));
  }

  static class My {
    String name;
    int age;
    String tel;
    String email;
    int gender;
    boolean working;
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + gender;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((tel == null) ? 0 : tel.hashCode());
      result = prime * result + (working ? 1231 : 1237);
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
      My other = (My) obj;
      if (age != other.age)
        return false;
      if (email == null) {
        if (other.email != null)
          return false;
      } else if (!email.equals(other.email))
        return false;
      if (gender != other.gender)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (tel == null) {
        if (other.tel != null)
          return false;
      } else if (!tel.equals(other.tel))
        return false;
      if (working != other.working)
        return false;
      return true;
    }



  }


}
