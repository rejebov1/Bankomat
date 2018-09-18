package by.itacademy.java.calculator.operations;

import by.itacademy.java.calculator.operands.Operands;
import by.itacademy.java.calculator.operands.OperandsBoundsException;

public class Division implements Operation {
    @Override
    public double calculate(Operands operands) throws OperandsBoundsException {
        operands.get(0);
        return operands.get(0)+operands.get(1);
    }
}