public class Person implements Runnable{
    int position;
    String name;

    public Person(int position, String name) {
        this.position = position;
        this.name = name;
    }
public void show (){
        System.out.println(this.name +" befinner sig i position "+this.position);
}
public synchronized void move(int x){

        this.position =x;
}

    @Override
    public void run() {
        int rand = (int)(Math.random()*100)+1;
        if (rand<50 && this.position !=0){
            this.position -= 1;
            System.out.println(this.name +" går åt vänster");
        } else {
            this.position +=1;
            System.out.println(this.name +" går åt höger");
        }

    }
}
