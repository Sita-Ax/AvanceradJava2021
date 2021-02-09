public class Table {
    private String material;
    private int price;
    private String descriptioh;

    public Table(String material, int price, String descriptioh) {
        this.material = material;
        this.price = price;
        this.descriptioh = descriptioh;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescriptioh() {
        return descriptioh;
    }

    public void setDescriptioh(String descriptioh) {
        this.descriptioh = descriptioh;
    }

    @Deprecated
    public void showTable(){
        System.out.println("Ett bord i " +material +" som kostar " + price);
    }
}
