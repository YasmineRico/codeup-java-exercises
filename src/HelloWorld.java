public class HelloWorld { // java code has to be inside of a class and then inside of a main method.

    //this is called a method. all java code has to have a main method.
    public static void main(String[] args) {
        System.out.println("Hello World");
        int myFavoriteNumber = 14;
        System.out.println("myFavoriteNumber = " + myFavoriteNumber);
        
        String myString = "I love puppies";
        System.out.println("myString = " + myString);
        
        myString = "happy days!";
        System.out.println("myString = " + myString);
        
        myString = "3.14159";
        System.out.println("myString = " + myString);
        
//        long myNumber =
//        System.out.println("myNumber = " + myNumber);
        
//        long myNumber = 3.14;
//        System.out.println("myNumber = " + myNumber);
        
//       long myNumber = 123L;
//        System.out.println("myNumber = " + myNumber);

//        myNumber= 123;
//        System.out.println("myNumber = " + myNumber);

        float myNumber = 3.14F;
        System.out.println("myNumber = " + myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class = // you cannot call a variable a class.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
////        int three = (int) o;
////        System.out.println("three = " + three);
//
//        int three = (int) "three";
//        System.out.println("three = " + three);

//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *=  x;
//        System.out.println("y = " + y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y;
        System.out.println("x = " + x);
        y -= x;
        System.out.println("y = " + y);

    }// end of main method
}
