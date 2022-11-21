public class Tread1 extends Thread {
    private Bank bank;

    public Tread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 1; i <= 20000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("increment tread: " + bank.getAccount());
        }
    }
}