package com.eomcs.io.ex09.step3;

import java.io.IOException;
import java.io.InputStream;

//버퍼 기능을 입출력 플러그인/장신구(decorator)로 전환한다.

public class BufferedInputStream extends DecoratorInputStream {

  byte[] buf = new byte[8196];
  int size;
  int cursor;

  public BufferedInputStream(InputStream in) {
    super(in);
  }

  // DecoratorInputStream 에서 상속 받은 메서드를
  // 이 클래스의 역할에 맞게끔 재정의한다.
  @Override
  public int read() throws IOException {
    if(cursor == size) {
      if((size = 연결된부품.read(buf)) == -1) {
        return -1;
      }
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }
}
