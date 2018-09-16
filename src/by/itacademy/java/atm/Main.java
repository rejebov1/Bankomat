package by.itacademy.java.atm;

public class Main {
    public static void main(String[] args) {
        Atm prior = new PriorAtm();
        prior.addMoney(450);
        prior.getMoney(250);
        System.out.println(prior.display());
        System.out.println(prior.total());

        Atm belarus = new BelarusAtm();
        belarus.addMoney(500);
        belarus.getMoney(150);
        belarus.display();
        System.out.println(belarus.display());
        System.out.println(belarus.total());

        Atm mtbank = new MtBankAtm();
        mtbank.addMoney(400);
        mtbank.getMoney(300);
        mtbank.display();
        System.out.println(mtbank.display());
        System.out.println(mtbank.total());

    }
}
