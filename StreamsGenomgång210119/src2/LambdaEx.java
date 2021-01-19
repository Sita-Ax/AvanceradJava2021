public class LambdaEx {

    public static void main(String[] args) {

        MyFunctionalInterface m1 = (x) -> x*x;
        MyFunctionalInterface m2 = (x) -> x+5;
        MyFunctionalInterface m3 = (x) -> {
          if (x>3){
              return 5;
          }
          else return 0;
        };


        stringFunc lastLetterUpper = (s) -> {
            s= s.toUpperCase();
            return s.substring(s.length()-1);

        };

        stringFunc firstLetterUpper = (s)->{
            s = s.toUpperCase();
            return s.substring(0,1);
        };

        System.out.println((firstLetterUpper.strMethod("banankontakt")));
        bar(firstLetterUpper,"foobarbaez");
       /* System.out.println(m1.myMethod(2));
        System.out.println(m2.myMethod(2));
        System.out.println(m3.myMethod((19)));
*/


        foo(m1, 3);
        foo(m2, 3);


    }

    public static void foo (MyFunctionalInterface mfi, int x){
        System.out.println(mfi.myMethod(x));

    }
    public static void bar (stringFunc sfm, String st){
        System.out.println(sfm.strMethod(st));

    }
}
