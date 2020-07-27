package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3_d {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    
    System.out.println("[작업]");
    System.out.println("프로젝트? ");
    String project = keyInput.nextLine();

    //5명의 작업 정보 입력받기
    
    int[] no = new int[5];
    String[] str = new String[5];
    String[] context = new String[5];
    String[] worker = new String[5];
    String[] state = new String[5];
    Date[] edDate = new Date[5];
    int count = 0;
    
   for (int i = 0; i < 5; i++) {
     count++;
     
     
     System.out.print("번호? ");
     str[i] = keyInput.nextLine();
     no[i] = Integer.parseInt(str[i]); //문자를 입력 받은 다음에 숫자로 리턴한다.
     
     System.out.print("내용? ");
     context[i] = keyInput.nextLine();
     
     System.out.print("완료일? ");
     edDate[i] = java.sql.Date.valueOf(keyInput.nextLine());
     
     System.out.println("상태? ");    
     
     System.out.println("0: 신규");
     System.out.println("1: 진행중");
     System.out.println("2: 완료");   
     System.out.print(">");
     
     state[i] = keyInput.nextLine();
     
     
     System.out.print("담당자? ");
     worker[i] = keyInput.nextLine();
     
     System.out.println();
     
     System.out.println("계속 입력하시겠습니까?(y/N)");
     String response = keyInput.nextLine();
     
     if (response.equalsIgnoreCase("y") == false) {
       break;
   }
   }
        
        keyInput.close();
    
    System.out.println("---------------------");
    
    for (int i = 0; i < count; i++) {

      String status = null;
      switch (state[i]) {
        case "0":
          status = "신규";
          break;
        case "1":
          status = "진행중";
          break;
        default :
          status = "완료";
      }

      
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], context[i], edDate[i], status, worker[i]);
        
      
      }    
    }
//    if (state.equals("0")) {
//      System.out.println("신규");
//    }
//    else if (state.equals("1")) {
//      System.out.println("진행중");
//    }
//    else{
//      System.out.println("완료");
//    }
//    System.out.printf("담당자 : %s\n", worker);
//    
    
   
  }
  

