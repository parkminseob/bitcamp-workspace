package com.eomcs.corelib.ex02.test;
// String 다양한 생성자 활용
public class Exam0180 {
  public static void main(String[] args) throws Exception{

    String s1 = new String();
    // 내부적으로 문자의 코드 값을 저장할 char 배열
    // 또는 byte배열을 생성한다.
    // 생성자에서 넘겨주는 값을 배열에 저장한다.
    // 생성자에 아무것도 넘겨주지 않으면 빈 배열을 생성한다.

    System.out.println(s1);

    String s2 = new String("Hello"); // String 인스턴스 생성
    System.out.printf("s2 = %s\n", s2);

    char[] chars = {'H','e','l','l','o'};
    String s3 = new String(chars); //char 배열로 String 인스턴스 생성
    System.out.printf("s3=%s\n",s3);

    byte[] bytes =
      {(byte) 0xb0, (byte) 0xa1, (byte) 0xb0, (byte) 0xa2, 0x30, 0x31, 0x32, 0x41, 0x42, 0x43
      };
    String s4 = new String(bytes); //바이트 배열로 String 인스턴스 생성
    System.out.printf("s4=%s\n",s4);
    // 한글이 깨지는 이유
    // => String 생성자는 파라미터로 받은 바이트 배열에 ISO-8859-1 문자 코드가 들어 있다가 간주한다.
    // 즉 0xb0 0xa1 값이 한글 '가'가 아니라 0xb0와 0xa1 각각을 영어라 간주하고
    // ISO-8859-1 에 정의된 문자표에 따라 유니코드(UTF-16)으로 바꿔 저장한다.
    // 0xb0(ISO-8859-1) ==> 0x00b0(UTF-16)
    // => 제대로 한글을 처리하려면?
    // 생성자에 바이트 배열을 넘겨줄 때
    // 배열에 들어 있는 코드 값이 어떤 문자표의 코드 값인지 알려줘야 한다.

    String s5 = new String(bytes, "euc-kr");
    System.out.printf("s5=%s\n", s5);

    byte[] bytes2 =
      {(byte) 0xac, (byte) 0x00, (byte) 0xac, (byte) 0x01, 0x00, 0x61, 0x00, 0x62, 0x00, 0x63};

    String s6 = new String(bytes2, "utf-16");
    System.out.printf("s6=%s\n", s6);

    byte[] bytes3 =
      {(byte) 0xac, (byte) 0x00, (byte) 0xac, (byte) 0x01, 0x00, 0x61, 0x00, 0x62, 0x00, 0x63};

    String s7 = new String(bytes3, "utf-8");
    System.out.printf("s7=%s\n", s7);
  }
}
