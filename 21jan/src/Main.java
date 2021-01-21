import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] words = {"stenar", "äpplen", "pil", "svampar",
                "kaffe", "stenar", "böcker", "polyvinylklorid", "köttbullar", "äpplepaj", "privatdetektiv"};

        //Array med alla ord längre än sju bokstäver!
/*
        int counter = 0;
        for (String w : words) {
            if (w.length() > 7) {
                counter += 1;
            }
        }

        String[] words2 = new String[counter];
        counter = 0;
        for (String w : words) {
            if (w.length() > 7) {
                words2[counter] = w;
                counter += 1;
            }
        }
        counter = 0;

        System.out.println(Arrays.toString(words2));
        for (String s : words2) {
            if (s.charAt(0) == 'p') {
                counter++;
            }
        }

        String[] finalArray = new String[counter];
        counter = 0;

        for (String s : words2) { //  for (int i = 0; i<word.length;i++){s = words[i];}
            //********
            if (s.charAt(0) == 'p') {
                finalArray[counter] = s;
                counter++;
            }

        }
        System.out.println(Arrays.toString(finalArray));
*/
        //Samma sak igen!

        Predicate<String> p1 = x-> x.length() > 2;
        Predicate<String> p2 = x-> x.length() < 5;
        Predicate<String> p3 = x-> x.charAt(0) =='p';

        Predicate<Integer> p4 = x->x*2 > 14;

        myMethod(words,p1,p2);
        myMethod(words, p2,p3);


/*
        List<String> list = Arrays.asList(words);

        List list2 =  list
                .stream()


                .filter(x -> {
                    if (x.length() > 7){
                        return true;
                    }
                    else{
                        return false;
                    }

                })

                .filter(p1) //*****************'
                .filter(p2)

                .filter(x-> x.charAt(0)=='p')
                .map (x-> x +"!")
                .map (x-> x.length())

                .collect(Collectors.toList());


        System.out.println("list2" + list2);


        //System.out.println(Arrays.toString(newArray));
*/
    }

    public static void myMethod (String[] arr, Predicate<String> p1, Predicate<String> p2){
        List<String> list = Arrays.asList(arr);

        List list2 =  list
                .stream()

                .filter(p1) //*****************'
                .filter(p2)


                .collect(Collectors.toList());


        System.out.println("list2" + list2);


    }

}
