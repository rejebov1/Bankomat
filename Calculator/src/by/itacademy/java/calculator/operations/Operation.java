package by.itacademy.java.calculator.operations;

import by.itacademy.java.calculator.operands.Operands;
import by.itacademy.java.calculator.operands.OperandsBoundsException;

public interface Operation {
    double calculate (Operands operands) throws OperandsBoundsException;
}
