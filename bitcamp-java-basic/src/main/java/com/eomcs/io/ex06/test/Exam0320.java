package com.eomcs.io.ex06.test;
//BufferedFileInputStream과 BufferedFileOutputStream을 사용하여 파일 복사 및 시간 측정

public class Exam0320 {
  public static void main(String[] args) throws Exception {
    BufferedFileInputStream in = new BufferedFileInputStream("temp/jls11.pdf");
    BufferedFileOutputStream out = new BufferedFileOutputStream("temp/jls11_4.pdf");

    int b;

    long startTime = System.currentTimeMillis();

    while((b = in.read()) != -1)
      out.write(b);

    // 아직 파일로 출력되지 않고 남아있는 버퍼 데이터를
    // 마무리로 출력한다.
    //out.flush();

    long endTime = System.currentTimeMillis();

    System.out.println(endTime - startTime);

    in.close();
    out.close();
  }
}
