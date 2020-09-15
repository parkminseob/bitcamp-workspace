package com.eomcs.io.ex01;

import java.io.File;
import java.io.IOException;

public class Exam0130 {
  public static void main(String[] args) throws IOException {
    // File 클래스
    // => 파일이나 디렉토리 정보를 관리
    // => 파일이나 디렉토리를 생성,삭제,변경

    // 존재하지 않는 폴더를 조회
    //
    File currentDir = new File("./haha");
    System.out.printf("폴더명: %s\n", currentDir.getName());
    System.out.printf("경로: %s\n", currentDir.getPath());
    System.out.printf("절대경로: %s\n", currentDir.getAbsolutePath());
    System.out.printf("계산된 절대경로: %s\n", currentDir.getCanonicalPath());

    // 존재하지 않는 폴더인 경우 크기를 알아낼 수 없다.
    System.out.printf("총크기: %s\n", currentDir.getTotalSpace());
    System.out.printf("남은크기: %s\n", currentDir.getFreeSpace());
    System.out.printf("가용크기: %s\n", currentDir.getUsableSpace());

    // 존재하지 않는 폴더인 경우 정보를 알아낼 수 없다. 모두 false
    System.out.printf("디렉토리여부: %s\n", currentDir.isDirectory());
    System.out.printf("파일여부: %s\n", currentDir.isFile());
    System.out.printf("감춤폴더: %s\n", currentDir.isHidden());
    System.out.printf("존재여부: %s\n", currentDir.exists());
    System.out.printf("실행가능여부: %s\n", currentDir.canExecute());
  }
}