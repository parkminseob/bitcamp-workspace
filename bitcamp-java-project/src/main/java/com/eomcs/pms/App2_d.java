package com.eomcs.pms;
//4번 반복문 사용
import java.util.Scanner;
public class App2_d {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    System.out.println("[프로젝트]");

    //최대 5명의 회원정보를 입력 받는 변수 선언.
    
    int[] no = new int[5];
    String[] title = new String[5];
    String[] context = new String[5];
    String[] owner = new String[5];
    String[] members = new String[5];
    int count = 0;

    
    for(int i = 0; i < 5; i++) {
      count++;
      
      System.out.print("번호: ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      
  
      System.out.print("프로젝트명: ");
      title[i] = keyInput.nextLine();
  
      System.out.print("내용: ");
      context[i] = keyInput.nextLine();
  
      System.out.print("시작일: ");
      java.sql.Date stDate1 = java.sql.Date.valueOf(keyInput.nextLine());
      
      
      System.out.print("종료일: ");
      java.sql.Date edDate1 = java.sql.Date.valueOf(keyInput.nextLine());
  
      
      System.out.print("만든이: " );
      owner[i] = keyInput.nextLine();
      
      System.out.print("팀원: ");
      members[i] = keyInput.nextLine();
      
      System.out.println(); //빈줄 출력 
      
      System.out.print("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();
      
      if(response.equalsIgnoreCase("y") == false) {
        break;
      }
      
       
      }
    keyInput.close();
    
     
    System.out.println("-----------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], title[i], context[i], owner[i], members[i].toString());
    }

  }
}
