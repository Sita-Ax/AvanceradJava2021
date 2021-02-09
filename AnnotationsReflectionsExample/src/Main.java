import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("wood",200,"Green");
        CoffeTable coffeTable = new CoffeTable();
        //table1.showTable();
        //coffeTable.showTable();
        Class tableClass = table1.getClass();
        System.out.println(tableClass);
        Method[] m = tableClass.getMethods();

        System.out.println(tableClass.getConstructors()[0]);

        System.out.println(Arrays.toString(m));
        for( Method method: m){
            if (method.getName().contains("get")){
                System.out.println("A getter " +method);
            }

        }
    }
}
