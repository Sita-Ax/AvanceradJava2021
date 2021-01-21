import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;

public class Dstream {
    public static void main(String[] args) {

        double[] da = {2.3, 1967.004,2.3, 23.324, 234534.2,2.4, 0.234};

        DoubleStream ds = Arrays.stream(da);

        double [] value =
                ds

                        .mapToInt(x-> (int)x )

                        .distinct()
                        .sorted()
                        .mapToDouble(x-> (double)x)
                        .toArray()
                ;

        System.out.println(Arrays.toString(value));


                ;
    }
}
