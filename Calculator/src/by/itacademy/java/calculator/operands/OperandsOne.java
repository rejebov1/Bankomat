package by.itacademy.java.calculator.operands;

public class OperandsOne implements Operands {
    private double a;

    public OperandsOne(double a) {
        this.a = a;
    }

    public double get(int index) {
        return a;
    }
}
