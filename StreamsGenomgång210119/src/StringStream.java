import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {
        String[] strings = {"a", "banan", "penna","volvo", "svampstuvning", "julgran","a","stearinsljus","a"};

        List<String> myList = Arrays.asList(strings);

        List newArray = myList
                .stream()
                .map( x-> x.toUpperCase())
                .map(x-> x.length())
                .distinct()

                .collect(Collectors.toList());

        System.out.println(newArray);
    }

}
