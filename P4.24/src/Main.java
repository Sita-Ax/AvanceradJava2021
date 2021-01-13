public class Main {
    public static void main(String[] args) {
        // 1 2 3
        int nOSteps = 1000;
        int winDoor;
        int playerGuess;
        int nOLosses = 0;
        int nOWins = 0;

        for (int i = 0; i<nOSteps;i++){
            winDoor = (int)(Math.random()*3)+1;
            playerGuess =(int)(Math.random()*3)+1;

            if (playerGuess == winDoor){
                nOLosses +=1;
            } else{
                nOWins+=1;
            }

        }
        System.out.println("Wins: "+nOWins + " Losses: "+nOLosses);
    }
}
