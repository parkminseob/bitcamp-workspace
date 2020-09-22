package com.eomcs.io.ex09.step2;

import java.io.IOException;
import java.io.InputStream;

//버퍼 기능을 입출력 플러그인/장신구(decorator)로 전환한다.

public class BufferedInputStream extends DecoreatorInputStream {

  byte[] buf = new byte[8196];
  int size;
  int cursor;

  public BufferedInputStream(InputStream in) {
    super(in); // 수퍼 클래스의 생성자를 호출하여 연결된 부품을 보관한다.
  }

  // DecoratorInputStream에서 상속받은 메서드를
  // 이 클래스의 역할에 맞게끔 재정의 한다.
  @Override
  public int read() throws IOException {
    if(cursor == size) { // 버퍼에 저장되어있는 데이터를 모두 읽었다는 의미
      if((size = 연결부품.read(buf))== -1) { // 파일에서 데이터를 읽으려는데 데이터가 없다면
        return -1;
      }
      cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }
}
