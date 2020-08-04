package com.eomcs.basic.ex07;
// call by reference
public class Exam0320 {

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }
  public static void main(String[] args) {
    int[] arr = new int[] {100,200};
    swap(arr);
    // 배열안의 메모리(인스턴스)를 넘기는 것이 아니라
    // 주소를 넘기는 것이다.
    // 그래서 call by reference라고 부른다.
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
  }


}
