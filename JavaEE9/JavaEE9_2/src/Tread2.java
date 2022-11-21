public class Tread2 extends Thread{
    private Bank bank;

    public Tread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank){
            for(int i = 1; i <= 20000; i++ ){
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("decrement tread: " + bank.getAccount());
        }
    }
}