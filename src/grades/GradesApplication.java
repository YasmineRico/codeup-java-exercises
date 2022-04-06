package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {

    //create a method to allow for a loop to continue.
    public static void outputStudentInfo(String userInput){

    }
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student elenasofia = new Student("Elena-Sofia");
        elenasofia.addGrade(99);
        elenasofia.addGrade(75);
        elenasofia.addGrade(86);
        students.put("fashionista11", elenasofia);

        Student lucia= new Student("Lucia");
        lucia.addGrade(88);
        lucia.addGrade(90);
        lucia.addGrade(100);
        students.put("partyGurl", lucia);

        Student monica = new Student("Monica");
        monica.addGrade(30);
        monica.addGrade(90);
        monica.addGrade(100);
        students.put("magmatizm", monica);

        Student marina = new Student("Marina");
        marina.addGrade(100);
        marina.addGrade(28);
        marina.addGrade(88);
        students.put("sadGirlz", marina);
//print out the userNames
        System.out.println("Hola! These are the github usernames: ");
        Set<String> gitHubUserNames = students.keySet();
      for(String gitHubUserName: gitHubUserNames){
          System.out.printf(" |%s|\n", gitHubUserName );
      }

        System.out.println("");
        System.out.println("What student would you like to see more info on?");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(gitHubUserNames.contains(userInput)){
            System.out.printf("Name: %s \n GitHub Username: %s%n", students.get(userInput).getName(), userInput);
            System.out.printf("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
        }else {
            System.out.println("Sorry no user found with that username " + userInput);
        }

        while(true){
            System.out.println("Would you like to see another students info?");
            System.out.println("");
            String userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            if(userChoice.equals("no")|| userChoice.equals("n")){
                System.out.println("Goodbye!");
                break;
            }else{
                System.out.println("What student would you like to see more info on?");
                System.out.println(gitHubUserNames);
                userInput = scanner.nextLine();
                System.out.println();

            }

        }

      //Could also use this:
//      Collection<Student> studentObjects =students.values();
//      for (Student student: studentObjects){
//          System.out.println(student.getName());
//      }


    }
}
