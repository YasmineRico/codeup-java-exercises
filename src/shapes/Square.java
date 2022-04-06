package shapes;

public class Square extends Quadrilateral{
    public Square(double side){
        super(side, side);
    }
    @Override
    public void setLength(double length) {
        this.length = length;
        this.width= length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

public double getPerimeter(){
        return 4* length;
}

public double getArea(){
        return length * width;
}

    //-----> Commenting out this was for the inheritance and polymorphism Exercises.
//    public int side;
//    public Square (int side){
//        super(side, side);
//        this.side =side;
//    }
////    public int getArea(){
////        return side * side;
////    }
////
////    public int getPerimeter(){
////        return side *4;
////    }
//
//    //Overrides the method of the parent.
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
//
//    //Overrides the method of the parent
//
//    public int getArea(){
//        return side*side;
//    }

}

// --------->   Source <------------
// Overriding in Java: https://www.geeksforgeeks.org/overriding-in-java/

//Might be wrong...
//Help from group in breakout room :)
