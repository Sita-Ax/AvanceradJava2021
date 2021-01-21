public abstract class Vehicle {
    private int price;

    public Vehicle (int price ){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void show();

}
