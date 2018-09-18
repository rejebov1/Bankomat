package by.itacademy.java.calculator.operands;

public class OperandsTwo implements Operands {
    private double a, b;

    public OperandsTwo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double get(int index) throws OperandsBoundsException {
        if (index == 0)
            return a;
        else if (index ==1)
                return b;
        throw new OperandsBoundsException("The index for Operand with two args");
    }
}
