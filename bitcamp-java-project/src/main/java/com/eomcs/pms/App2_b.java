package com.eomcs.pms;

import java.util.Scanner;
public class App2_b {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    System.out.print("[프로젝트]");

    //최대 5명의 회원정보를 입력 받는 변수 선언.
    
    int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
    String title1 = "",title2 = "",title3 = "",title4 = "",title5 = "";
    String context1 = "",context2= "",context3 = "",context4 = "",context5 = "";
    String owner1 = "",owner2 = "",owner3 = "",owner4 = "",owner5 = "";
    String members1 = "",members2 = "",members3 = "",members4 = "",members5 = "";
    int count = 1;

    
    //1번 
    System.out.print("번호: ");
    no1 = keyInput.nextInt();
    keyInput.nextLine();
    

    System.out.print("프로젝트명: ");
    title1 = keyInput.nextLine();

    System.out.print("내용: ");
    context1 = keyInput.nextLine();

    System.out.print("시작일: ");
    java.sql.Date stDate1 = java.sql.Date.valueOf(keyInput.nextLine());
    
    
    System.out.print("종료일: ");
    java.sql.Date edDate1 = java.sql.Date.valueOf(keyInput.nextLine());

    
    System.out.print("만든이: " );
    owner1 = keyInput.nextLine();
    
    System.out.print("팀원: ");
    members1 = keyInput.nextLine();
    
    System.out.println(); //빈줄 출력 
    
    System.out.print("계속 입력하시겠습니까?(y/N)");
    String response = keyInput.nextLine();
    
    if(response.equals("y") || response.contentEquals("Y")) {
      count = count + 1;
        //2번 
        System.out.print("번호: ");
        no2 = keyInput.nextInt();
        keyInput.nextLine();
        
    
        System.out.print("프로젝트명: ");
        title2 = keyInput.nextLine();
    
        System.out.print("내용: ");
        context2 = keyInput.nextLine();
    
        System.out.print("시작일: ");
        java.sql.Date stDate2 = java.sql.Date.valueOf(keyInput.nextLine());
        
        
        System.out.print("종료일: ");
        java.sql.Date edDate2 = java.sql.Date.valueOf(keyInput.nextLine());
        
        
        System.out.print("만든이: " );
        owner2 = keyInput.nextLine();
        
        System.out.print("팀원: ");
        members2 = keyInput.nextLine();
        
        System.out.println(); //빈줄 출력 
        
        System.out.print("계속 입력하시겠습니까?(y/N)");
        response = keyInput.nextLine();
        
          if(response.equalsIgnoreCase("y")) {
            count = count + 1;
            //3번 
          System.out.print("번호: ");
          no3 = keyInput.nextInt();
          keyInput.nextLine();
          
      
          System.out.print("프로젝트명: ");
          title3 = keyInput.nextLine();
      
          System.out.print("내용: ");
          context3 = keyInput.nextLine();
      
          System.out.print("시작일: ");
          java.sql.Date stDate3 = java.sql.Date.valueOf(keyInput.nextLine());
          
          
          System.out.print("종료일: ");
          java.sql.Date edDate3 = java.sql.Date.valueOf(keyInput.nextLine());
          
          
          System.out.print("만든이: " );
          owner3 = keyInput.nextLine();
          
          System.out.print("팀원: ");
          members3 = keyInput.nextLine();
          
          System.out.println(); //빈줄 출력 
          
          System.out.println("계속 입력하시겠습니까?(y/N)");
          response = keyInput.nextLine();
          
          
          if(response.equalsIgnoreCase("y")) {
             count += 1;
            
              //4번 
            System.out.print("번호: ");
            no4 = keyInput.nextInt();
            keyInput.nextLine();
            
        
            System.out.print("프로젝트명: ");
            title4 = keyInput.nextLine();
        
            System.out.print("내용: ");
            context4 = keyInput.nextLine();
        
            System.out.print("시작일: ");
            java.sql.Date stDate4 = java.sql.Date.valueOf(keyInput.nextLine());
            
            
            System.out.print("종료일: ");
            java.sql.Date edDate4 = java.sql.Date.valueOf(keyInput.nextLine());
            
            
            System.out.print("만든이: " );
            owner4 = keyInput.nextLine();
            
            System.out.print("팀원: ");
            members4 = keyInput.nextLine();
            
            System.out.println(); //빈줄 출력 
           
            System.out.println("계속 입력하시겠습니까?(y/N)");
            response = keyInput.nextLine();
            
            if (response.equalsIgnoreCase("y")) {
               count++;
                //5번 
                System.out.print("번호: ");
                no5 = keyInput.nextInt();
                keyInput.nextLine();
                
                
                System.out.print("프로젝트명: ");
                title5 = keyInput.nextLine();
                
                System.out.print("내용: ");
                context5 = keyInput.nextLine();
                
                System.out.print("시작일: ");
                java.sql.Date stDate5 = java.sql.Date.valueOf(keyInput.nextLine());
                
                
                System.out.print("종료일: ");
                java.sql.Date edDate5 = java.sql.Date.valueOf(keyInput.nextLine());
                
                
                System.out.print("만든이: " );
                owner5 = keyInput.nextLine();
                
                System.out.print("팀원: ");
                members5 = keyInput.nextLine();
                
                System.out.println(); //빈줄 출력 
              } 
            }
          }
       
          
      }
    
     keyInput.close();
     
    System.out.println("-----------------------");
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no1, title1, context1, stDate1, edDate1, owner1, members1);
    if (count > 1) {      
      System.out.printf("%d, %s, %s, %s, %s\n", no2, title2, context2, owner2, members2);
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no3, title3, context3,  owner3, members3);
        if (count > 3) {
        }
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no4, title4, context4,  owner4, members4);
          if (count > 4) {
            
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no5, title5, context5,  owner5, members5);
          }
      }
          
      }

  }
}
