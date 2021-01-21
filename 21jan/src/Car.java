public class Car extends Vehicle {

    private String regNr, model;
    private int year;


    public Car(String regNr, String model, int year, int price) {
        super(price);
        this.regNr = regNr;
        this.model = model;
        this.year = year;

    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void show(){
        System.out.println("model " +this.model);
        System.out.println(this.regNr);
    }

}