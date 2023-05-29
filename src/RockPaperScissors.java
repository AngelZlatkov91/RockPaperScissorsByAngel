import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper of [s]cissors: ");
        String playerMove = scanner.next();


        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
         playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
         playerMove = SCISSORS;
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random random = new Random();
        int computerRandomNUmber = random.nextInt(4);
        String computerMove = "";
         switch (computerRandomNUmber) {
             case 1:
                 computerMove = ROCK;
                 break;
             case 2:
                 computerMove = PAPER;
                 break;
             case 3:
                 computerMove = SCISSORS;
                 break;
         }
        System.out.printf("The computer chose %s.%n",computerMove);
         if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                 (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                 (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
             System.out.println("You win.");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
        (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
             System.out.println("You lose.");
         } else {
             System.out.println("This game was a draw.");
         }

    }
}