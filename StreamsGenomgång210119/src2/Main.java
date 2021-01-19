import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] ints = {1,3,4,5,2,26,943,12};

        IntStream myStream = Arrays.stream(ints);

        int[] newArray = myStream
                .filter( x -> {
                    if(x%3 == 0){
                        return true;
                }
                return false;

                } )
                .map(x -> 2*x)
                .sorted()

                .toArray();

        System.out.println(Arrays.toString(newArray));





    }
}
