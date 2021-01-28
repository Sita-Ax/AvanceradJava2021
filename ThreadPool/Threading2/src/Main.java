import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Nummer1 n1 = new Nummer1();
        Nummer2 n2 = new Nummer2();

        Thread t1= new Thread(n1);
        Thread t2 =new Thread(n2);

        t1.start();
        t2.start();

        makePool();
        System.out.println("Main running");
        System.out.println("Antal aktiva trådar: "+Thread.activeCount());

        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads);

        for(Thread t: listOfThreads){
            System.out.println(t.getName());

        }
    }
    public static void makePool(){

        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(5);
        pool.scheduleAtFixedRate(new Nummer1() ,3,4, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(new Nummer2() ,5,4, TimeUnit.SECONDS);





    }
}
