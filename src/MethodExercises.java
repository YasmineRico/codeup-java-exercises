import java.util.Scanner;
import java.util.Random;


public class MethodExercises {
    //Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.
    //
    //Food for thought: What happens if we try to divide by zero? What should happen?
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        //  return Math.multiplyExact(num1, num2);
        //   int result = 0;
        //   for (int i =0; i < num1; i ++){
        //       result += num2;
        //   }
        //   return result;

        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 < 0) {
            return -num1 + multiplication(num1, num2 + 1);
        } else {
            return num1 + multiplication(num1, num2 - 1);
        }
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(9, 5));
//        System.out.println(multiplication(5, 4));
//        System.out.println(division(8, 4));
//        System.out.println(modulus(15, 6));
//    }
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }
////Create a method that validates that user input is in a certain range
////
//public static int getInteger(int min, int max){
//        Scanner sc = new Scanner (System.in);
//    System.out.print("Enter a number between 1 and 10: ");
//    sc.nextLine();
//    if ( max <= 1){
//        return 1;
//    }else
//        return min;
//
//}

    //Skip #2
//public static void main(String[] args){
//        getInteger(1, 10);
//}
//The method signature should look like this:
//static int factorial(int n)
//{
//    int result = 1, i;
//    for (i=2; i<=n; i++)
//        result *= i;
//    return result;
//}
//public static void main (String [] args){
//        int num= 4;
//        System.out.println("factorial of " + num + " is " + factorial(4));
//    }




        public static void main(String args[]) {
            System.out.print("Enter the number of dice: ");

            // Initializing the Scanner object to read input
            Scanner input = new Scanner(System.in);
            int numberOfDice = input.nextInt();

            // Initializing the Random object for
            // generating random numbers
            Random ranNum = new Random();

            System.out.print("You rolled: ");
            int total = 0;
            int randomNumber = 0;

            for (int i = 0; i < numberOfDice; i++) {

                // Generating the random number and storing it
                // in the 'randomNumber' variable
                randomNumber = ranNum.nextInt(6) + 1;
                total = total + randomNumber;
                System.out.print(randomNumber);
                System.out.print(" ");
            }

            System.out.println("");
            System.out.println("Total: " + total);
            input.close();
        }

    }



