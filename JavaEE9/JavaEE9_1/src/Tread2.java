public class Tread2 implements Runnable{
    private Bank bank;

    public Tread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.dec();
    }
}