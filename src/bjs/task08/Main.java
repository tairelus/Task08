package bjs.task08;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setBinary(125.4, 12);
        calc.getSum();
        calc.printResult();

        calc.setUnary(16);
        calc.getSqrt();
        calc.printResult();

        calc.setUnary(Math.PI/2);
        calc.getSin();
        calc.printResult();
    }
}
