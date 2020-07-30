package com.eomcs.basic.ex06;
// break와 continue 활용하기.
public class Exam0322 {
  public static void main(String[] args) {
   int count = 0;
   int sum = 0;

   count = 0;
   sum = 0;
   while (count < 100) {
     count++;
     if (count > 50)
       continue;
     sum += count;
   } // 50을 넘어가면 합을 수행하진 않지만 카운트는 100까지 반복한다.
   System.out.printf("count = %d, sum = %d\n", count, sum);

   System.out.println("-----------------------");

   count = 0;
   sum = 0;
   while (count < 100) {
     count++;
     if (count > 50)
       break;
     sum += count;
   }
   System.out.printf("count = %d, sum = %d\n", count, sum);
  } //0~49까지 50번 반복이고 그 이후 한번이 더 추가되서 51번 카운트된건가?

}
