import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class WordCount implements Runnable{
    static int combined = 0;
    File file;
    int count;
    Scanner in;
    ReentrantLock lock;

    public WordCount(String filename){
        lock = new ReentrantLock();
        file = new File ("src/" +filename);

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    @Override
    public void run() {
        String line;
        this.count =0 ;
        while(in.hasNext()){
            line = in.nextLine();
            String[] array = line.split("\\s+");
            count += array.length;
        }
        synchronized(this) {
            combined = combined + count;
        }
        System.out.println(this.file.getName() +" är " +count + " ord lång! ");


        if (Thread.activeCount() <= 2) {
            System.out.println("Totalt:" + combined);
        }
    }
}
