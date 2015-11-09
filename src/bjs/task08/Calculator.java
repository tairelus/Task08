package bjs.task08;

import java.lang.Math;

/**
 * Created by YM on 09.11.2015.
 */
public class Calculator {
    //For unary operation only leftOperand will be used
    private double leftOperand, rightOperand, resultValue;

    void setBinary(double leftOperand, double rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    void setUnary(double leftOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = 0;
    }

    double getSum() {
        resultValue = leftOperand + rightOperand;
        return resultValue;
    }

    double getSqrt() {
        //If the argument is NaN (not a number), then the result is NaN.
        resultValue = Math.sqrt(leftOperand);
        return resultValue;
    }

    double getSin() {
        resultValue = Math.sin(leftOperand);
        return resultValue;
    }

    void printResult() {
        System.out.println("Result value: " + resultValue);
    }
}
