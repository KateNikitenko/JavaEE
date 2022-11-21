public class Tread1 implements Runnable {
    private Bank bank;

    public Tread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.inc();
    }
}
