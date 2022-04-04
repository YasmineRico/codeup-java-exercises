package util;
import java.util.Scanner;

//Create a class named Input

public class Input {
   // Input class will have a private field named scanner
    private Scanner scanner = new Scanner(System.in);
//When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.

    // The class should have the following methods, all of which return command line input from the user: --> meaning set to public
    //
    public String getString(){
        return scanner.nextLine();
    }

   //The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
   public boolean yesNo() {
       System.out.println("Please tell me yes: ");
       String input = scanner.next();
       return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
   }

    //The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.


    public int getInt(int min, int max) {
        System.out.println("please enter a number " + min + " and " + max + ".");
        int num = scanner.nextInt();

        if (num >= min && num <= max) {
            System.out.println("Thanks for choosing a number 1-10");
            return num;
        } else {
            System.out.println("hmm can you choose another number? .. hint a number 1-10");
            return num;
        }
    }

    public int getInt(){
        System.out.println();
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            double num = scanner.nextInt();

            if (num >= min && num <= max) {
                return num;
            } else {
                System.out.println("Choose another number, please.");
                return getDouble(min, max);
            }
    }






}

//--------> Sources & Notes <------------

//1.  Explains equalsIgnoreCase.
// https://www.geeksforgeeks.org/java-string-equalsignorecase-method-with-examples/ --> Compares the strings and ignores whether one has characters that are uppercased/lowercased. Will return a boolean value of true even if yasmine and YAsmIne were compared. But will return false if Yasmine and Yasmene were compared.