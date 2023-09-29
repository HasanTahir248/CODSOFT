import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//Creating variblaes and random method which will be used in the task
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int max_number = 100;
    int min_number = 1;
    int max_attempts = 10;
    int attempts= 0;
    int score = 0;
//Starting the game
    while (true){
//Generating a random number for the game
      int secret_number = random.nextInt(max_number - min_number + 1) + min_number;
      System.out.println("\n****************************** WELCOME TO NUMBER GAME *************************************\n");
      System.out.println("      I will select a random number between "+min_number+" and "+max_number+". \n              ");
      System.out.println("  You will guess the number, you have "+max_attempts+ " attempts to pick the right one.\n      ");
      System.out.println("\n*********************************** LETS START ********************************************\n");
//Taking the guess number from the player in 10 attempts
      while(attempts < max_attempts){
        System.out.println("\n Enter your guess:");
        int guess = in.nextInt();
        attempts++;
//If correct number is given
        if (guess == secret_number){
          System.out.println("\n Congratulations! You entered the correct number.\n");
          score++;
          break;
        }
//If small number is given
        if (guess < secret_number){
          System.out.println("\n Try Again! Your number is to low.\n");
        }
//If biger number is given
        if (guess > secret_number){
          System.out.println("\n Try Again! Your number is to high.\n");
        }
        if (attempts == max_attempts){
          System.out.println("\n Sorry! Your are out of attempts.\n");
        }
      }
//Asking if he/she wants to play again
        System.out.println("\n Do you want to play another round? (yes/no):");
        attempts = 0;
        String play = in.next();
//Showing the result to the player
        if (!play.equalsIgnoreCase("Yes")){
          System.out.println("\n****************************** THANKS FOR PLAYING **************************************\n");
          System.out.println("\n NUMBER OF ROUNDS WON:   "+score+"  \n");
          break;
        }
      
    }
    
  }
}