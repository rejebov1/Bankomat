package by.itacademy.java.calculator.operations;

import by.itacademy.java.calculator.operands.Operands;
import by.itacademy.java.calculator.operands.OperandsBoundsException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Addition implements Operation {
    public static final Logger LOGGER = Logger.getLogger(Addition.class.getName());

    @Override
    public double calculate(Operands operands) throws OperandsBoundsException {
        {
            return operands.get(0) + operands.get(1);


        }
    }
}
