public class Bicycle extends Vehicle{
private int id;
private String color;


public Bicycle(int id, String color, int price){
    super(price);
    this.id = id;
    this.color = color;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println(this.id);
        System.out.println(this.color);
    }

}
