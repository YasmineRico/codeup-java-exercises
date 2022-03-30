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
public static int addition (int num1, int num2){
    return num1 +num2;
}
public static int subtraction(int num1, int num2){
    return num1 - num2;
}
public static int multiplication(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
        return 0;
    } else if (num2 < 0) {
        return -num1 + multiplication(num1, num2 + 1);
    }
    else{
        return num1+ multiplication(num1, num2 -1);
    }
}

public static int division(int num1, int num2){
    return num1 / num2;
}
public static int modulus(int num1, int num2){
    return num1 % num2;
}

public static void main(String[] args){
    System.out.println(addition(1, 2));
    System.out.println(subtraction(9, 5));
    System.out.println(multiplication(5, 4));
    System.out.println(division(8, 4));
    System.out.println(modulus(15,6));

}

}
