import java.util.Random;
import java.util.Scanner;

public class HighLow {
//Game Development 101
//
//Welcome to the world of game development!
//
//You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//The specs for the game are:
//
//Game picks a random number between 1 and 100. done
//Prompts user to guess the number. done
//All user inputs are validated. done
//If user's guess is less than the number, it outputs "HIGHER". done
//If user's guess is more than the number, it outputs "LOWER". done
//If a user guesses the number, the game should declare "GOOD GUESS!" done
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.


    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//Setting the numbers to be from 1-10.
        int guess = 1;
        int number = random.nextInt(10);



//Doing a while loop until the user guesses the number
        while (guess!=number) {
            System.out.print("Guess a number 1-10: ");
            guess = scanner.nextInt();
//if statements to output whether or not the user is guessing correctly or if they did not.
            if (guess<number) {
                System.out.println("TOO LOW");
            } else if (guess>number) {
                System.out.println("TOO HIGH!");
            } else {
                System.out.println("GOOD GUESS! The answer was " + number);
            }
        }
    }
}
//to test i played a few rounds and at least got all number 2-9 .. not sure if I need to change the integers at the top...


