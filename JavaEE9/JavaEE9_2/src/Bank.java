public class Bank {
    private int account ;

    public synchronized void inc(){
        for (int i = 1; i  <= 20000; i++){
            account += 2;
        }
        System.out.println("account = " + account);
    }

    public synchronized void dec(){
        for (int i = 1; i  <= 20000; i++){
            account -= 1;
        }
        System.out.println("account = " + account);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}