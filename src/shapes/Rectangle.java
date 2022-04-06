package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;

    }

    @Override
    public double getPerimeter() {
        return (2* width) + (2*length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length){ //method parameter so you need this.length or change the parameter name to something like lengths but thats not good practice.
        this.length = length; //object property
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


///-----> Commenting out this was for the inheritance and polymorphism Exercises.

//    protected int length;
//    protected int width;
//
//
//    public Rectangle (int length, int width){
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public int getArea(){
//        return this.width * this.length;
//    }
//    public int getPerimeter(){
//        return (2*this.length) + (2*this.width);
//    }


}
