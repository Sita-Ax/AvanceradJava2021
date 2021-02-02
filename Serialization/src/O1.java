import java.io.Serializable;

public class O1 implements Serializable {

    private int value;
    public O1(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "O1{" +
                "value=" + value +
                '}';
    }
}
