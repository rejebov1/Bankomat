package by.itacademy.java.atm;

public class PriorAtm extends Atm implements Income, Outcome, VendorInfo {
    @Override
    public String display() {
        return "PriorBank";
    }
}

