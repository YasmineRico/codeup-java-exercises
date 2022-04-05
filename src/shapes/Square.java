package shapes;

public class Square extends Rectangle{
    public int side;
    public Square (int side){
        super(side, side);
        this.side =side;
    }
//    public int getArea(){
//        return side * side;
//    }
//
//    public int getPerimeter(){
//        return side *4;
//    }

    //Overrides the method of the parent.
    @Override
    public int getPerimeter(){
        return 4 * side;
    }

    //Overrides the method of the parent
    @Override
    public int getArea(){
        return side*side;
    }

}

// --------->   Source <------------
// Overriding in Java: https://www.geeksforgeeks.org/overriding-in-java/

//Help from group in breakout room :)
