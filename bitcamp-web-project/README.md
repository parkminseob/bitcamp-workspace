# eomcs-java-web
자바 웹 프로그래밍 예제 모음

## src-00

- 자바 웹 프로젝트 폴더 준비
  - $ gradle init 실행 후 src/main/webapp폴더 추가
- build.gradle 설정
  - java, eclipse-wtp, war플러그인 추가
  - servlet-api 라이브러리 추가
- .war파일 생성
  - gradle build 실행
- .war파일을 톰캣 서버에 배포
  - $CATALINA_HOME/webapps/폴더에 복사
- 톰캣 서버 실행
  - 현재 실행 중이면 재실행한다.
- 테스트