package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    //콘솔에서 사용자의 입력을 처리하는 도구를 준비한다.
    // => 키보드 input stream : System.in
    // => input stream에서 data를 읽어 적절한 타입으로 return하는 도구 : Scanner
    java.util.Scanner keyInput = new java.util.Scanner(System.in);
    
    
    System.out.println("[회원]");
    System.out.print("번호? ");
    int no = keyInput.nextInt(); //nextInt(); 는 숫자값만 읽어준다.
    keyInput.nextLine();  // 숫자 뒤에 남아있는 CR/LF값 읽기
    //nextInt호출 뒤에 nextLine을 호출할때에는 쓰레기값을 정리해주기위해
    //keyInput.nextLine();을 호출해준다.
    
    System.out.print("이름? ");
    String name = keyInput.nextLine();
    
    System.out.print("이메일?");
    String email = keyInput.nextLine();
    
    System.out.print("암호?");
    String passward = keyInput.nextLine();
    
    System.out.print("사진?");
    String photo = keyInput.nextLine();
    
    System.out.print("전화?");
    String tell = keyInput.nextLine();
    
    long currentMillis = System.currentTimeMillis(); //1970-1-1 00:00:00 에서 경과된 밀리초를 리
    java.sql.Date now = new java.sql.Date(currentMillis);
    
  
    
    keyInput.close();

    System.out.println("-------------------------------");
    System.out.printf("번호: %d\n", no);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", email);
    System.out.printf("암호: %s\n", passward);
    System.out.printf("사진: %s\n", photo);
    System.out.printf("전화: %s\n", tell);
    System.out.printf("가입일: %s\n", now.toString());
  
  }
}
