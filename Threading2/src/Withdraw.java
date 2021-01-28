public class Withdraw implements Runnable {

    Bank bank;

    public Withdraw(Bank bank) {
        this.bank = bank;

    }

    @Override
    public  void run() {
        for (int i = 0; i < 1000; i++) {
            this.bank.changeSaldo(-100);

        }
        System.out.println("Wend: bank" +this.bank);
    }

}
