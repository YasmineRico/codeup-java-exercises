import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args){
//      double pi = 3.14159;
//    System.out.format("The value of pi is approximately: " + String.format("%.2f", pi));

//    //or
//        System.out.printf("The value of pi is approximately: %.2f", pi);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        scanner.nextLine();

        System.out.print("Enter 1 word: ");
        String userWord = scanner.nextLine();
        System.out.print("Enter second word: ");
        String userWord1 = scanner.nextLine();
        System.out.print("Enter 3rd word: ");
        String userWord2 = scanner.nextLine();
        System.out.println("You entered:\n" +userWord +"\n" +userWord1+ "\n" +userWord2);
        scanner.nextLine();

        System.out.print("Please enter a sentence: ");
        String userSentence= scanner.nextLine();
        System.out.println("You entered: " + userSentence);
        scanner.nextLine();

        System.out.print("Please enter the length of the room: ");
        int roomLength = scanner.nextInt();
        System.out.print("Please enter the width of the room: ");
        int roomWidth= scanner.nextInt();
        int perimeter = 2 * (roomLength + roomWidth);
        System.out.println("The perimeter of the room is: " + perimeter);

    }
}