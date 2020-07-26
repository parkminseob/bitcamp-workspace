package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3_c {

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
    int count = 1;
    
    //1번
    
    System.out.print("번호? ");
    str[0] = keyInput.nextLine();
    no[0] = Integer.parseInt(str[0]); //문자를 입력 받은 다음에 숫자로 리턴한다.
    
    System.out.print("내용? ");
    context[0] = keyInput.nextLine();
    
    System.out.print("완료일? ");
    edDate[0] = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.println("상태? ");    
   
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");   
    System.out.print(">");
    state[0] = keyInput.nextLine();
        
    System.out.print("담당자? ");
    worker[0] = keyInput.nextLine();
    
    System.out.println();
    
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count++;
        
        //2번
        
        System.out.print("번호? ");
        str[1] = keyInput.nextLine();
        no[1] = Integer.parseInt(str[1]);
        
        System.out.print("내용? ");
        context[1] = keyInput.nextLine();
        
        System.out.print("완료일? ");
        edDate[1] = java.sql.Date.valueOf(keyInput.nextLine());
        
        System.out.println("상태? ");    
        
        System.out.println("0: 신규");
        System.out.println("1: 진행중");
        System.out.println("2: 완료");   
        System.out.print(">");
        state[1] = keyInput.nextLine();
        
        System.out.print("담당자? ");
        worker[1] = keyInput.nextLine();
        
        System.out.println();
        
        System.out.println("계속 입력하시겠습니까?(y/N)");
        response = keyInput.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          count++;
          
          //3번
          
          
          System.out.print("번호? ");
          str[2] = keyInput.nextLine();
          no[2] = Integer.parseInt(str[2]);
          
          System.out.print("내용? ");
          context[2] = keyInput.nextLine();
          
          System.out.print("완료일? ");
          edDate[2] = java.sql.Date.valueOf(keyInput.nextLine());
          
          System.out.println("상태? ");    
          
          System.out.println("0: 신규");
          System.out.println("1: 진행중");
          System.out.println("2: 완료");   
          System.out.print(">");
          state[2] = keyInput.nextLine();
          
          System.out.print("담당자? ");
          worker[2] = keyInput.nextLine();
          
          System.out.println();
          
          System.out.println("계속 입력하시겠습니까?(y/N)");
          response = keyInput.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count++;
            
            
            //4번
            
            
            System.out.print("번호? ");
            str[3] = keyInput.nextLine();
            no[3] = Integer.parseInt(str[3]);
            
            System.out.print("내용? ");
            context[3] = keyInput.nextLine();
            
            System.out.print("완료일? ");
            edDate[3] = java.sql.Date.valueOf(keyInput.nextLine());
            
            System.out.println("상태? ");    
            
            System.out.println("0: 신규");
            System.out.println("1: 진행중");
            System.out.println("2: 완료");   
            System.out.print(">");
            state[3] = keyInput.nextLine();
            
            System.out.print("담당자? ");
            worker[3] = keyInput.nextLine();
            
            System.out.println();
            
            System.out.println("계속 입력하시겠습니까?(y/N)");
            response = keyInput.nextLine();
            
            if(response.equalsIgnoreCase("y")) {
              
              //5번
              
              
              System.out.print("번호? ");
              str[4] = keyInput.nextLine();
              no[4] = Integer.parseInt(str[4]);
              
              System.out.print("내용? ");
              context[4] = keyInput.nextLine();
              
              System.out.print("완료일? ");
              edDate[4] = java.sql.Date.valueOf(keyInput.nextLine());
              
              System.out.println("상태? ");    
              
              System.out.println("0: 신규");
              System.out.println("1: 진행중");
              System.out.println("2: 완료");   
              System.out.print(">");
              state[4] = keyInput.nextLine();
              
              System.out.print("담당자? ");
              worker[4] = keyInput.nextLine();
              
              System.out.println();
            }
          }
        }
    }
        
        keyInput.close();
    
    
    System.out.println("---------------------");
    
    System.out.printf("%d, %s, %s, %s, %s\n", no[0], context[0], edDate[0], state[0], worker[0]);
    if (count >1) {      
      System.out.printf("%d, %s, %s, %s, %s\n", no[1], context[1], edDate[1], state[1], worker[1]);
      if (count > 2) {
        
        System.out.printf("%d, %s, %s, %s, %s\n", no[2], context[2], edDate[2], state[2], worker[2]);
        if (count > 3) {
          
          System.out.printf("%d, %s, %s, %s, %s\n", no[3], context[3], edDate[3], state[3],  worker[3]);
          if(count > 4) {
            
            System.out.printf("%d, %s, %s, %s, %s\n", no[4], context[4], edDate[4], state[4], worker[4]);
          }
        }
      }
    }
    
    System.out.print("상태 : ");
    
    switch (state[1]) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    
    switch (state[1]) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state[2]) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state[3]) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state[4]) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
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
}
