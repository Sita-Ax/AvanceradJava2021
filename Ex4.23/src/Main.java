public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int nOSteps = 100;
        int direction;

        for (int i =0; i < nOSteps; i++){
            direction = (int)((Math.random()*4)+1);
            // 1 = upp 2 = höger 3 = ned 4 = vänster
            switch (direction){
                case 1:
                    y+=1; //y++; y = y+1;
                    break;
                case 2:
                    x+=1;
                    break;
                case 3:
                    y -=1;
                    break;
                case 4:
                    x-=1;
                    break;

                    default:
                        System.out.println("WTF!");
            }
        }
        System.out.println("FyllBerra befinner sig i position: ("+x+", "+y+")");

    }

}
