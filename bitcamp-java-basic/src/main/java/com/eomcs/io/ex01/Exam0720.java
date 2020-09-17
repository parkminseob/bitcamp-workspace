package com.eomcs.io.ex01;

import java.io.File;

//활용 - 지정한 폴더를 삭제하라.

public class Exam0720 {
  public static void main(String[] args) {

    // temp디렉토리 삭제하기
    File dir = new File("temp");

    deleteFile(dir);
  }

  static void deleteFile(File dir) {
    // 주어진 파일이 디렉토리라면 하위 파일이나 디렉토리를 찾아 지운다.
    if(dir.isDirectory()) {
      File[] files = dir.listFiles();
      for(File file : files) {
        deleteFile(file);
      }
    }

    dir.delete();
  }
}
