package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    System.out.print("[작업]");
    
    
    
    System.out.print("프로젝트? ");
    String project = keyInput.nextLine();
    
    System.out.print("번호? ");
    String str = keyInput.nextLine();
    int no = Integer.parseInt(str); //문자를 입력 받은 다음에 숫자로 리턴한다.
    
    System.out.print("내용? ");
    String context = keyInput.nextLine();
    
    System.out.print("완료일? ");
    java.sql.Date enDate = java.sql.Date.valueOf(keyInput.nextLine());
    
    System.out.println("상태? ");    
   
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");   
    System.out.print(">");
    String state = keyInput.nextLine();
        
    System.out.print("담당자? ");
    String worker = keyInput.nextLine();
    
    
    
    keyInput.close();
    
    
    System.out.println("---------------------");
    
    
    System.out.printf("프로젝트 : %s\n", project);
    System.out.printf("번호 : %d\n", no);
    System.out.printf("내용 : %s\n", context);
    System.out.printf("완료일 : %s\n", enDate.toString());
    System.out.print("상태 : ");
    
    switch (state) {
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
