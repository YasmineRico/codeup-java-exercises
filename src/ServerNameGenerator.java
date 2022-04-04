public class ServerNameGenerator {

    public static String getRandomString(String[] listOfStrings) {
        //goes through the array length to get a random object
        int index = (int) (Math.random() * (listOfStrings.length));
        return listOfStrings[index];
    }
//Have to set the arrays to a static method... and then put in the getRandomString method to return with the array. Then add that to your main method.
    public static String Adjectives() {
            String[] Adjective={"Charming", "Fantastic", "Gentle", "Perfect", "Brave", "Kind", "Happy", "Fierce", "Calm", "Lively"};
        return getRandomString(Adjective);
    }

    //return getrandom string for noun then add to main method. Array needed to be in its own static method.
          public static  String Nouns() {
           String[] Noun={"Thomas", "Stella", "Ama", "Sara", "Aaron", "Raqel", "Angel", "Victor", "Freddy", "Apa"} ;
              return getRandomString(Noun);
          }



//To String is not needed here on line 24..
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(Nouns()+ "-"+ Adjectives());
    }

}
