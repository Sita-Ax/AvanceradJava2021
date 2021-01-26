import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String myString ="aaa Kalle Os&&tar&& 08-&&111222 A(A12aaf ddchbWWA) 018111333 Ola Qqqqq aaaaaa R() 08/34324235";
        //String pattern ="[A-Z]\\(([A-Za-z0-9\\s]+)?\\)";
        // String pattern = "0[0-9]{1,4}[-/]?[1-9][0-9]+";
        //String pattern ="[a]{3,5}";
        String pattern = "\\w+";

        //*************************
//[ [A-Z] Alla matchningar på stora bokstäver
// [] Matchar något i "hakarna" [AB]a => Aa eller Bb
        // + - en eller flera a+ => a eller aaaa eller aaaaaaaaaa
        // \\s -mellanslag
        // ? eller inte.   abc(def)?ghi abcdefghi eller abcghi
        // {n,m} mellan n och m stycken
        
        finder(myString, pattern);


    }

    public static void finder (String myString, String pattern){

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(myString);

        while(matcher.find()){
            if(matcher.group().length() != 0) {
                System.out.println(matcher.group());
            }
            System.out.print ("Start: "+matcher.start()+" " );
            System.out.println("slut: "+matcher.end() );
        }

    }
}
