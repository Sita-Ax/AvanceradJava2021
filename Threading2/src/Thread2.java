public class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println("Thread 2 running");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
