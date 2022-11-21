public class Driver {
    public static void main(String[] args) {
        final Bank bank = new Bank();

        Tread1 tread1 = new Tread1(bank);
        tread1.run();

        Tread2 tread2 = new Tread2(bank);
        tread2.run();
    }
}

