import java.util.ArrayList;

public class CollectionsMiniExercise {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Person thomas = new Person ("Thomas");
        Person takito = new Person("Takito");
        Person evie = new Person ("Evie");
        persons.add(thomas);
        persons.add(takito);
        persons.add(evie);
        for(Person person: persons){
            System.out.println(person.getName());
        }

    }


}
//lists
//maps key valued pairs every key refers to a value
//sets collections of unique items.
