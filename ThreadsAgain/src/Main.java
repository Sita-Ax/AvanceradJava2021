import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Person thore = new Person(0, "Thore Skogman");
        Person edvard = new Person (2,"Edvard Persson");

        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(10);
        pool.scheduleAtFixedRate(thore, 5,5, TimeUnit.SECONDS);
        pool.scheduleAtFixedRate(edvard, 2,10, TimeUnit.SECONDS);

        Scanner in = new Scanner(System.in);

        while (true){
            String command = in.next();
            if(command.equals("move")){
                System.out.println("Moving thore to?");
                int newVal = in.nextInt();
                System.out.println("Moving Thore to "+ newVal);
                thore.move(newVal);
            }

            thore.show();
            edvard.show();
        }


    }

}
