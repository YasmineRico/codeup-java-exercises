package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


        //Question 8: Bc rectangle extends quad and implements Measurable. Measurable has the getPerimeter. You must override the interfaces method.

        //Question 9: no method exists in Measurable for get length / getWidth. We set myShapes reference type to Measurable.



//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        //This will now be the overriden method.
//        Rectangle box2= new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }


}
