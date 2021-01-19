import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {
        String[] strings = {"a", "banan", "penna","volvo", "svampstuvning", "julgran","a","stearinsljus","a"};

        int y = 5;
        Predicate<String> p1 = s-> s.length()<2;
        Predicate<String> p2 = s-> s.length()>y;

        List<String> myList = Arrays.asList(strings);

        List newArray = myList
                .stream()
                .map( x-> x.toUpperCase())
                .filter(p2)
                .map(x-> x.length())

                .distinct()

                .collect(Collectors.toList());

        System.out.println(newArray);
    }

}
