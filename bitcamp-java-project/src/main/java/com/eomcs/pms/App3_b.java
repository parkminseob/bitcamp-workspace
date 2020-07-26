package com.eomcs.pms;

import java.util.Scanner;
import java.sql.Date;

public class App3_b {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    
    System.out.println("[작업]");
        System.out.println("프로젝트? ");
        String project = keyInput.nextLine();

    //5명의 작업 정보 입력받기
    
    String str1="", str2="", str3="", str4="", str5="";
    int no1=0, no2=0, no3=0, no4=0, no5=0;
    String context1="", context2="", context3="", context4="", context5="";
    String worker1="", worker2="", worker3="", worker4="", worker5="";
    String state1="", state2="", state3="", state4="", state5="";
    Date edDate1= null, edDate2= null, edDate3= null, edDate4= null,edDate5= null;
    int count = 1;
    
    //1번
    
    System.out.print("번호? ");
    str1 = keyInput.nextLine();
    no1 = Integer.parseInt(str1); //문자를 입력 받은 다음에 숫자로 리턴한다.
    
    System.out.print("내용? ");
    context1 = keyInput.nextLine();
    
    System.out.print("완료일? ");
    edDate1 = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.println("상태? ");    
   
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");   
    System.out.print(">");
    state1 = keyInput.nextLine();
        
    System.out.print("담당자? ");
    worker1 = keyInput.nextLine();
    
    System.out.println();
    
      System.out.println("계속 입력하시겠습니까?(y/N)");
      String response = keyInput.nextLine();
      
      if (response.equalsIgnoreCase("y")) {
        count++;
        
        //2번
        
        System.out.print("번호? ");
        str2 = keyInput.nextLine();
        no2 = Integer.parseInt(str2);
        
        System.out.print("내용? ");
        context2 = keyInput.nextLine();
        
        System.out.print("완료일? ");
        edDate2 = java.sql.Date.valueOf(keyInput.nextLine());
        
        System.out.println("상태? ");    
        
        System.out.println("0: 신규");
        System.out.println("1: 진행중");
        System.out.println("2: 완료");   
        System.out.print(">");
        state2 = keyInput.nextLine();
        
        System.out.print("담당자? ");
        worker2 = keyInput.nextLine();
        
        System.out.println();
        
        System.out.println("계속 입력하시겠습니까?(y/N)");
        response = keyInput.nextLine();
        
        if (response.equalsIgnoreCase("y")) {
          count++;
          
          //3번
          
          
          System.out.print("번호? ");
          str3 = keyInput.nextLine();
          no3 = Integer.parseInt(str3);
          
          System.out.print("내용? ");
          context3 = keyInput.nextLine();
          
          System.out.print("완료일? ");
          edDate3 = java.sql.Date.valueOf(keyInput.nextLine());
          
          System.out.println("상태? ");    
          
          System.out.println("0: 신규");
          System.out.println("1: 진행중");
          System.out.println("2: 완료");   
          System.out.print(">");
          state3 = keyInput.nextLine();
          
          System.out.print("담당자? ");
          worker3 = keyInput.nextLine();
          
          System.out.println();
          
          System.out.println("계속 입력하시겠습니까?(y/N)");
          response = keyInput.nextLine();
          
          if (response.equalsIgnoreCase("y")) {
            count++;
            
            
            //4번
            
            
            System.out.print("번호? ");
            str4 = keyInput.nextLine();
            no4 = Integer.parseInt(str4);
            
            System.out.print("내용? ");
            context4 = keyInput.nextLine();
            
            System.out.print("완료일? ");
            edDate4 = java.sql.Date.valueOf(keyInput.nextLine());
            
            System.out.println("상태? ");    
            
            System.out.println("0: 신규");
            System.out.println("1: 진행중");
            System.out.println("2: 완료");   
            System.out.print(">");
            state4 = keyInput.nextLine();
            
            System.out.print("담당자? ");
            worker2 = keyInput.nextLine();
            
            System.out.println();
            
            System.out.println("계속 입력하시겠습니까?(y/N)");
            response = keyInput.nextLine();
            
            if(response.equalsIgnoreCase("y")) {
              
              //5번
              
              
              System.out.print("번호? ");
              str5 = keyInput.nextLine();
              no5 = Integer.parseInt(str5);
              
              System.out.print("내용? ");
              context5 = keyInput.nextLine();
              
              System.out.print("완료일? ");
              edDate5 = java.sql.Date.valueOf(keyInput.nextLine());
              
              System.out.println("상태? ");    
              
              System.out.println("0: 신규");
              System.out.println("1: 진행중");
              System.out.println("2: 완료");   
              System.out.print(">");
              state5 = keyInput.nextLine();
              
              System.out.print("담당자? ");
              worker5 = keyInput.nextLine();
              
              System.out.println();
            }
          }
        }
    }
        
        keyInput.close();
    
    
    System.out.println("---------------------");
    
    System.out.printf("%d, %s, %s, %s, %s\n", no1, context1, edDate1, state1, worker1);
    if (count >1) {      
      System.out.printf("%d, %s, %s, %s, %s\n", no2, context2, edDate2, state2, worker2);
      if (count > 2) {
        
        System.out.printf("%d, %s, %s, %s, %s\n", no3, context3, edDate3, state3, worker3);
        if (count > 3) {
          
          System.out.printf("%d, %s, %s, %s, %s\n", no4, context4, edDate4, state4,  worker4);
          if(count > 4) {
            
            System.out.printf("%d, %s, %s, %s, %s\n", no5, context5, edDate5, state5, worker5);
          }
        }
      }
    }
    
    System.out.print("상태 : ");
    
    switch (state1) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    
    switch (state2) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state3) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state4) {
      case "0":
        System.out.printf("신규");
        break;
      case "1":
        System.out.printf("진행중");
        break;
      default :
        System.out.printf("완료");
    }
    
    switch (state5) {
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
