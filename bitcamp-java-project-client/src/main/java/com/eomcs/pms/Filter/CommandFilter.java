package com.eomcs.pms.Filter;

import java.util.Map;
import com.eomcs.pms.handler.Request;

// 역할 :
// - 필터를 실행할 때 호출하는 메서드 규칙을 정의한다.

public interface CommandFilter {
  // 기존 구현체에 영향을 주지 않고 새 규칙을 추가하는 방법.
  // => default메서드로 선언하기
  default void init(Map<String,Object> context) throws Exception {}

  void doFilter(Request request, FilterChain next) throws Exception;

  default void destroy() {};
}
