import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int len = args.length;
        System.out.println(Arrays.toString(args));
        ArrayList<WordCount> list = new ArrayList<>();
        WordCount temp;

        for (String s:args ){
            temp = new WordCount(s);
            list.add(temp);
        }

        for (WordCount wc :list){
            Thread th = new Thread(wc);
            th.start();

        }

    }
}
