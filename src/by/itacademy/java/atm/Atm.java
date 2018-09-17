package by.itacademy.java.atm;

public abstract class Atm implements Income, Outcome, VendorInfo, Balance {

    private int twenty = 0;
    private int fifty = 0;
    private int hundred = 0;
    private int count = 0;

    @Override
    public void addMoney(int count) {

        int remaining = count % 100;
        hundred = (count - remaining) / 100;
        remaining = remaining % 50;
        fifty = (count - hundred * 100 - remaining) / 50;
        remaining = remaining % 20;
        twenty = (count - hundred * 100 - remaining - fifty * 50) / 20;
        if (remaining == 0) {
            this.twenty = twenty;
            this.fifty = fifty;
            this.hundred = hundred;
        }
    }

    @Override
    public void getMoney(int count) {
        int remaining = count % 100;
        int hundred = (count - remaining) / 100;
        remaining = remaining % 50;
        int fifty = (count - hundred * 100 - remaining) / 50;
        remaining = remaining % 20;
        int twenty = (count - hundred * 100 - remaining - fifty * 50) / 20;
        if (remaining == 0) {
            this.twenty -= twenty;
            this.fifty -= fifty;
            this.hundred -= hundred;

        }
    }

@Override
    public int total() {
        return hundred * 100 + fifty * 50 + twenty * 20;
    }

@Override
    public abstract String display();
}