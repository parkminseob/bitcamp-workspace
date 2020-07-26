package com.eomcs.pms;
//클래스 패키지 선언
import java.util.Scanner;
public class App2_c {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    System.out.println("[프로젝트]");

    //최대 5명의 회원정보를 입력 받는 변수 선언.
    
    int[] no = new int[5];
    String[] title = new String[5];
    String[] context = new String[5];
    String[] owner = new String[5];
    String[] members = new String[5];
    int count = 1;

    
    //1번 
    System.out.print("번호: ");
    no[0] = keyInput.nextInt();
    keyInput.nextLine();
    

    System.out.print("프로젝트명: ");
    title[0] = keyInput.nextLine();

    System.out.print("내용: ");
    context[0] = keyInput.nextLine();

    System.out.print("시작일: ");
    java.sql.Date stDate1 = java.sql.Date.valueOf(keyInput.nextLine());
    
    
    System.out.print("종료일: ");
    java.sql.Date edDate1 = java.sql.Date.valueOf(keyInput.nextLine());

    
    System.out.print("만든이: " );
    owner[0] = keyInput.nextLine();
    
    System.out.print("팀원: ");
    members[0] = keyInput.nextLine();
    
    System.out.println(); //빈줄 출력 
    
    System.out.print("계속 입력하시겠습니까?(y/N)");
    String response = keyInput.nextLine();
    
    if(response.equals("y") || response.contentEquals("Y")) {
      count = count + 1;
        //2번 
        System.out.print("번호: ");
        no[1] = keyInput.nextInt();
        keyInput.nextLine();
        
    
        System.out.print("프로젝트명: ");
        title[1] = keyInput.nextLine();
    
        System.out.print("내용: ");
        context[1] = keyInput.nextLine();
    
        System.out.print("시작일: ");
        java.sql.Date stDate2 = java.sql.Date.valueOf(keyInput.nextLine());
        
        
        System.out.print("종료일: ");
        java.sql.Date edDate2 = java.sql.Date.valueOf(keyInput.nextLine());
        
        
        System.out.print("만든이: " );
        owner[1] = keyInput.nextLine();
        
        System.out.print("팀원: ");
        members[1] = keyInput.nextLine();
        
        System.out.println(); //빈줄 출력 
        
        System.out.print("계속 입력하시겠습니까?(y/N)");
        response = keyInput.nextLine();
        
          if(response.equalsIgnoreCase("y")) {
            count = count + 1;
            //3번 
          System.out.print("번호: ");
          no[2] = keyInput.nextInt();
          keyInput.nextLine();
          
      
          System.out.print("프로젝트명: ");
          title[2] = keyInput.nextLine();
      
          System.out.print("내용: ");
          context[2] = keyInput.nextLine();
      
          System.out.print("시작일: ");
          java.sql.Date stDate3 = java.sql.Date.valueOf(keyInput.nextLine());
          
          
          System.out.print("종료일: ");
          java.sql.Date edDate3 = java.sql.Date.valueOf(keyInput.nextLine());
          
          
          System.out.print("만든이: " );
          owner[2] = keyInput.nextLine();
          
          System.out.print("팀원: ");
          members[2] = keyInput.nextLine();
          
          System.out.println(); //빈줄 출력 
          
          System.out.println("계속 입력하시겠습니까?(y/N)");
          response = keyInput.nextLine();
          
          
          if(response.equalsIgnoreCase("y")) {
             count += 1;
            
              //4번 
            System.out.print("번호: ");
            no[3] = keyInput.nextInt();
            keyInput.nextLine();
            
            System.out.print("프로젝트명: ");
            title[3] = keyInput.nextLine();
        
            System.out.print("내용: ");
            context[3] = keyInput.nextLine();
        
            System.out.print("시작일: ");
            java.sql.Date stDate4 = java.sql.Date.valueOf(keyInput.nextLine());
            
            
            System.out.print("종료일: ");
            java.sql.Date edDate4 = java.sql.Date.valueOf(keyInput.nextLine());
            
            
            System.out.print("만든이: " );
            owner[3] = keyInput.nextLine();
            
            System.out.print("팀원: ");
            members[3] = keyInput.nextLine();
            
            System.out.println(); //빈줄 출력 
           
            System.out.println("계속 입력하시겠습니까?(y/N)");
            response = keyInput.nextLine();
            
            if (response.equalsIgnoreCase("y")) {
               count++;
                //5번 
                System.out.print("번호: ");
                no[4] = keyInput.nextInt();
                keyInput.nextLine();
                
                
                System.out.print("프로젝트명: ");
                title[4] = keyInput.nextLine();
                
                System.out.print("내용: ");
                context[4] = keyInput.nextLine();
                
                System.out.print("시작일: ");
                java.sql.Date stDate5 = java.sql.Date.valueOf(keyInput.nextLine());
                
                
                System.out.print("종료일: ");
                java.sql.Date edDate5 = java.sql.Date.valueOf(keyInput.nextLine());
                
                
                System.out.print("만든이: " );
                owner[4] = keyInput.nextLine();
                
                System.out.print("팀원: ");
                members[4] = keyInput.nextLine();
                
                System.out.println(); //빈줄 출력 
              } 
            }
          }
       
          
      }
    
     keyInput.close();
     
    System.out.println("-----------------------");
    System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[0], title[0], context[0], stDate1, edDate1, owner[0], members[0]);
    if (count > 1) {      
      System.out.printf("%d, %s, %s, %s, %s\n", no[1], title[1], context[1], owner[1], members[1]);
      if (count > 2) {
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[2], title[2], context[2],  owner[2], members[2]);
        if (count > 3) {
        }
        System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[3], title[3], context[3],  owner[3], members[3]);
          if (count > 4) {
            
            System.out.printf("%d, %s, %s, %s, %s, %s, %s\n", no[4], title[4], context[4],  owner[4], members[4]);
          }
      }
          
      }

  }
}
