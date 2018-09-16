package by.itacademy.java.atm;

public class MtBankAtm extends Atm implements Income, Outcome, VendorInfo {
    @Override
    public String display() {
        return "MTBank";
    }
}

