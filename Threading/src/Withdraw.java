public class Withdraw implements Runnable {

    Bank bank;

    public Withdraw(Bank bank) {
        this.bank = bank;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            int x = bank.getSaldo();
            x -= 100;
          //  System.out.println("Removing 100: " +x);
            bank.setSaldo(x);
          //  System.out.println(bank);

        }
        System.out.println("Wend: bank" +this.bank);
    }

}
