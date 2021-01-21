import java.util.ArrayList;

public class OOexample {

    public static void main(String[] args){

        ArrayList<Vehicle> vList = new ArrayList<Vehicle>();

    Car car1 = new Car ("Abc123","volvo",1985,320000);
    Car car2 = new Car("cde756","bmw",2015,5000);
        Bicycle b1 = new Bicycle(1,"red",200);
        Bicycle b2 = new Bicycle(2,"green",300);

        vList.add(car1);
        vList.add(b1);

    System.out.println("Car1 model: " +car1.getModel());
    System.out.println("Bicycle 1 color = " +b1.getColor());

    for (Vehicle v: vList){
        v.show();
    }
    }
}
