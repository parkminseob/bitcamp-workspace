package com.eomcs.oop.ex02;

import com.eomcs.util.Calculator;

public class Exam0230 {


  public static void main(String[] args) {
    Calculator result1 = new Calculator();
    Calculator result2 = new Calculator();


    result1.plus(2);
    result1.plus(3);
    result1.minus(1);
    result1.multiple(7);
    result1.divide(3);

    result2.plus(3);
    result2.plus(4);
    result2.minus(5);
    result2.multiple(6);
    result2.divide(7);

    Calculator.resultCalculator(result1.result);
    Calculator.resultCalculator(result2.result);

  }


}
