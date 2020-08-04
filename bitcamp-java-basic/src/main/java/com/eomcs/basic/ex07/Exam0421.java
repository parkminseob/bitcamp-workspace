package com.eomcs.basic.ex07;
// 배열 생성은 어디서 하는 것이 좋은가?
// 상황따라 적합한 선택을 하면 됨!

public class Exam0421 {

  public static void main(String[] args) {

    int[] moneies = new int[] {100, 200, 300};
    float[] total = new float[3];
    //호출하는 쪽에서 결과를 담을 배열을 주는 경우.
    compute(moneies, total, 0.089f);

    for (int i = 0; i < moneies.length; i++) {
      System.out.printf("%d => %.1f\n", moneies[i], total[i]);
    }

      System.out.println("-----------------");

      float[] result;
      result = compute2(moneies, 0.0089f);

      for (int i = 0; i < moneies.length; i++) {
        System.out.printf("%d => %.1f\n", moneies[i], result[i]);
      }

      // System.out.println(result); 이렇게 하면 이상한게 뜨던데
      //이게 주소값 아닌가?

  }
  static void compute(int[] moneies, float[] total, float interest) {
    for (int i = 0; i < moneies.length; i++) {
      total[i] = moneies[i] + (moneies[i] * interest);
    }
  }
  static float[] compute2(int[] moneies, float interest) {
    float[] totals = new float[moneies.length];
    for (int i = 0; i < moneies.length; i++) {
      totals[i] = moneies[i] + (moneies[i] * interest);
    }
    return totals;
  }

}
