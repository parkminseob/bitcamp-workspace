class Hello2 {
    public static void main (String[] args){
        System.out.println("src/main/java/Hello2.java");
        System.out.println("Hello, world!");
    }
}

//주제 : 소스 파일과 바이트코드를 분리하기 
//클래스로 인코딩 할때에는 javac -encoding UTF-8 src/main/java/Hello2.java
//왜 분리해야 하는가? 거래처에 상품을 납품 할때는 소스파일을 빼야하기 때문이다.
//java -classpath src/main/java Hello2 <- 이 코드는 -classpath 대로 경로를 따라가서 Hello2를 실행하란 뜻
//클래스와 바이트 코드를 분리할 때에는
//java -encoding UTF-8 -d bin src/main/java/Hello2.java   
//위 코드대로라면 bin(바이너리)폴더에 class파일이 분리되어서 들어간다.
//java -classpath bin Hello2  로 실행하면 bin폴더안의 Hello2가 실행된다.