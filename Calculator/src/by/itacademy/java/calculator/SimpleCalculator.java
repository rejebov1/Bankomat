package by.itacademy.java.calculator;

import by.itacademy.java.calculator.operands.Operands;
import by.itacademy.java.calculator.operands.OperandsBoundsException;
import by.itacademy.java.calculator.operations.*;

import java.util.logging.Level;

import static by.itacademy.java.calculator.operations.Addition.LOGGER;

public class SimpleCalculator {
    private Operation[] operations = {
            new Addition(),
            new Division(),
            new Subtraction(),
            new Multiplication(),
            new SquareRoot(),
            new Exhibitor()
    };

    public double execute(int index, Operands operands) {
        try {
            System.out.println(operations[index].calculate(operands));
        } catch (OperandsBoundsException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);

        }

    }
}

