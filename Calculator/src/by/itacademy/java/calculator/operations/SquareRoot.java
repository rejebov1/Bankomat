package by.itacademy.java.calculator.operations;

import by.itacademy.java.calculator.operands.Operands;
import by.itacademy.java.calculator.operations.Operation;

public class SquareRoot implements Operation {
    @Override
    public double calculate(Operands operands){
        operands.get(0);
        return operands.get(0)+operands.get(1);


    }
}
