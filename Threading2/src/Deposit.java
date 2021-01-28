public class Deposit implements Runnable {
    Bank bank;

    public Deposit(Bank bank) {
        this.bank = bank;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

                bank.changeSaldo(100);


        }
        System.out.println("dend: bank" +this.bank);
    }
}
