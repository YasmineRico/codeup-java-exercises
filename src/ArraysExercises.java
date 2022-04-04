import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
//Above gives you the hidden id of the array


        //Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. .

        String[] Persons = {"Thomas", "Sara", "Raqel"};

        //Iterate through the array and print out the name of each person in the array
        for (String Person : Persons) {
            System.out.println(Person);
        }
        String[] people = Arrays.copyOf(Persons, 4);
        people[3] = "Ama";
        System.out.println(Arrays.toString(people));

        }
    String  person;
    public  void addPerson (String name) {
        person = name;
    }

    }


