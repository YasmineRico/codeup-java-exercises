public class JavaWarmups {
    //================================= WARM UP
//
//Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
//
//Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.
//
//Examples...
//
//returnFirstCapitalLetter("hellO") // returns 'O'
//returnFirstCapitalLetter("hello") // returns ' '
//returnFirstCapitalLetter("hEllo") // returns 'E'
//returnFirstCapitalLetter("hELlO") // returns 'E'
//returnFirstCapitalLetter("H") // returns 'H'
    // Java program to find the first
// uppercase letter using linear search

    // Function to find string which has
    // first character of each word.
    static char first(String str) {
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        return 0;
    }

    // Driver program
    public static void main(String args[]) {
        String str = "codeuP";
        char res = first(str);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println(res);
    }
}



