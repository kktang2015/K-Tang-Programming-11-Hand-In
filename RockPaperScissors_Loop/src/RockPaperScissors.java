import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        dgdg();

        }
   public static void dgdg() { //declare variables
       int playerscore = 0;
       int computerscore = 0;
       int draw = 0;
       int i = 0;
       while (i <= 10) { //loop 10 times
           System.out.println("Computer Score: "+ computerscore);
           System.out.println("");
           System.out.println("Player Score: " + playerscore);
           System.out.println("");
           System.out.println("Choose Rock, Paper or Scissors. 'r' for Rock, 'p' for Paper and 's' for Scissors."); // Ask for player input
           Scanner scan = new Scanner(System.in);
           String playerchoice = scan.nextLine();


           int playerchoiceint = 0;

           switch (playerchoice) {
               case "r":
                   playerchoiceint = 0;
                   break;
               case "p":
                   playerchoiceint = 1;
                   break;
               case "s":
                   playerchoiceint = 2;
                   break;
               default: // invalid choice
                   playerchoiceint = 3;
           }


           // define playerchoiceint 0,1,2 to string rock, paper and scissors for display later
           if (playerchoiceint == 0) {
               playerchoice = "rock";
           } else if (playerchoiceint == 1) {
               playerchoice = "paper";
           } else if (playerchoiceint == 2) {
               playerchoice = "scissors";
           } else if (playerchoiceint == 3) {
               playerchoice = "Not Valid Choice!";
           }
           // The followings generate a random integer number and assign r, p and s to the integer
           int computerint = (int) (Math.random() * 3); //0 and 1 .45345345345434, 45.34
           String computerchoice = ""; // Initialize computerchoice as string

           if (computerint == 0) {
               computerchoice = "rock";
           } else if (computerint == 1) {
               computerchoice = "paper";
           } else if (computerint == 2) {
               computerchoice = "scissors";
           }





           // Compare the player input and computer generate value to determine if player win, lose, or tie
           // References: r = 0, p = 1, s = 2
           // Default choice if invalid
           if (playerchoiceint == 3) {
               System.out.println("Invalid Choice. Pick something else");
           } else if (((playerchoiceint == 0) && (computerint == 0)) || ((playerchoiceint == 1) && (computerint == 1)) || ((playerchoiceint == 2) && (computerint == 2))) {
               System.out.println("Draw!");
               draw++;//to show draw
           } else if ((playerchoiceint == 0) && (computerint == 2)) {
               System.out.println("You Win!");

               System.out.println("Want to play again?");
               playerscore++; // add score to player
           } else if ((playerchoiceint == 1) && (computerint == 0)) {
               System.out.println("You Win!");

               System.out.println("Want to play again?");
               playerscore++;
           } else if ((playerchoiceint == 2) && (computerint == 1)) {
               System.out.println("You Win!");

               System.out.println("Want to play again?");
               playerscore++;
           } else {
               System.out.println("You Lose!");
               System.out.println("Play again");
               computerscore++; // add score to computer
           }


           System.out.print("Computer Choice: " + computerchoice + "\t");
           System.out.print("Player Choice: " + playerchoice);
           System.out.println("");
i++;

       }

   }

    }







