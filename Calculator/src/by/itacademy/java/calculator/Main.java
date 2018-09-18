package by.itacademy.java.calculator;

import by.itacademy.java.calculator.operands.OperandsTwo;
import by.itacademy.java.calculator.operations.Addition;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println(calculator.execute(0,new OperandsTwo(4,5)));
    }

}
