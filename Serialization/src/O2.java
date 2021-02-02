import java.io.Serializable;

public class O2 implements Serializable {
    private String string;
    public O2(String s){
        this.string = s;

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "O2{" +
                "string='" + string + '\'' +
                '}';
    }
}
