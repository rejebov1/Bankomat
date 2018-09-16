package by.itacademy.java.atm;

public class BelarusAtm extends Atm implements Income, Outcome, VendorInfo {
    @Override
    public String display() {
        return "BelarusBank";
    }
}