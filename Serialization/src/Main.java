import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        O1 o1 = new O1(4);
        O2 o2 = new O2("foo");
        O2 o22 = new O2("Bar");
        Lists list = new Lists();
        list.add(o1);
        list.add(o2);
        list.add(o22);
        list.show();

        Scanner in = new Scanner(System.in);
        String input =" ";
        while (!input.equals("q")){
            if (input.charAt(0) == '1'){
                System.out.println("Give int");
                int val = in.nextInt();
                o1 = new O1(val);
                list.add(o1);
            }
            if (input.charAt(0) =='2'){
                System.out.println("Give String");
                String s = in.next();
                o2 = new O2(s);
                list.add(o2);
            }
            if(input.equals("save")){
                list.save();
            }
            if (input.equals("load")){
                list = list.load();
            }

            list.show();
            System.out.println("give input \n1. Add Int \n2. Add String \nload to load \nsave to save \nq - quitq");
            input = in.next();
        }



    }

}
