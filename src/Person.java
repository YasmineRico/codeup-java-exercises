

public class Person {
  private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name =name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello"+name);
    }
    //The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public Person (String name){
        this.name=name;
    }

//Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        //Compares the persons to see if they hold the same value
//        System.out.println(person1.getName().equals(person2.getName()));
      //is false as they are comparing the instances (basically person 1 is a different person than person 2. comparing data types/location in memory
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
