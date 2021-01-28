public class Deposit implements Runnable {
    Bank bank;

    public Deposit(Bank bank) {
        this.bank = bank;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int x = bank.getSaldo();
            x += 100;
         //   System.out.println("adding 100");
            bank.setSaldo(x);

        }
        System.out.println("dend: bank" +this.bank);
    }
}
