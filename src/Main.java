public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Deposit d = new Deposit(bank);
        Withdraw w = new Withdraw(bank);

        Thread dThread = new Thread(d);
        Thread wThread = new Thread(w);

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        Thread t1 =new Thread(thread1);
        Thread t2 = new Thread(thread2);

        dThread.start();
        wThread.start();


       // t1.start();
        // t2.start();


    }
}
