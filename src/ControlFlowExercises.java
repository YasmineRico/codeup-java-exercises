import java.util.Scanner;
public class ControlFlowExercises {
    public static void main (String [] args) {
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        long i = 2;
////        double square = Math.pow(i, 2);
//        do{
//            System.out.println(i);
//            i *= i;
//        }while (i <= 1000000);
//        for (long i =2; i < 1000000; i *=i){
//            System.out.println(i);
//        }
//      int a = 3;
//        int b = 5;
//        for (int i =1; i <= 100; i ++){
//            String s = "";
//            if (i ==a){
//                a =a +3;
//                s = s + "Fizz";
//            }
//            if (i == b){
//                b= b+5;
//                s = s +"Buzz";
//            }
//            if (s == "")
//                System.out.println(i);
//            else System.out.println(s);
//        }
        Scanner sc = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userInt = sc.nextInt();
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i++) {
//            System.out.println(i + "      | " + (i * i) + "       |" + "  " + (i * i * i));
//        }
        System.out.print("Please enter your grade: ");
        double score = sc.nextDouble();

        //convert user numeric grade into letter grade
        char userGrade = 'F';
        if (score >= 90)
            userGrade = 'A';
        else if (score >= 80)
            userGrade = 'B';
        else if (score >= 70)
            userGrade = 'C';
        else if (score >= 60)
            userGrade = 'D';

        // display conversion result
        String message = "Your letter grade is: " + userGrade;
        System.out.println(message);

    }
}

//------> Sources

// Grade converter: https://www.bizskinny.com/How-To/Data-Analysis/grade-converter-java-program.php

//Display table: https://stackoverflow.com/questions/22441530/java-powers-display-table --> last solution

