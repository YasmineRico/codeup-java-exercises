package shapes;
import util.Input;

public class CircleApp {



        public static void main(String[] args) {

            circle();
        }


        public static void circle() {
            Input input = new Input();
            double userRadius = input.getDouble(1, 10);
            Circle circle = new Circle(userRadius);
            System.out.println("The area is " + circle.getArea());
            System.out.println("The area circumference " + circle.getCircumference());
        }
}
