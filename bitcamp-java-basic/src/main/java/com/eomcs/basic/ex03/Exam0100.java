// Exam0100.java
// 주제 : 리터럴 (Litteral)

package com.eomcs.basic.ex03;

class Exam0100 {
    public static void main(String[] args){
        // 출력 명령문
        // - System.out.println(값);
        // [숫자]
        // 정수
        System.out.println(78);
        System.out.println(+78);
        System.out.println(-78);
        System.out.println(0116);
        System.out.println(0x4e);
        System.out.println(0b01001110);

        // 부동소수점(실수)  =>둥둥 떠다니는 소수점5d
        System.out.println(3.14);        
        System.out.println(31.4e-1); //e-1은 10의 -1승을 의미함
        System.out.println(314e-2);
        System.out.println(0.0314e2); //e2는 10의 2승을 의미함

        // [논리]
        // -true / false 
        System.out.println(true);
        System.out.println(false);

        // [문자]    
        // 문자
        System.out.println('A');
        System.out.println('가');
        // 문자열
        System.out.println("A");
        System.out.println("가");
        System.out.println("");
        System.out.println("ABC");
        System.out.println("가나다");
    }
}
