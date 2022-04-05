package shapes;

public class Rectangle {
    public int length;
    public int width;


    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;

    }

    public int getArea(){
        return this.width * this.length;
    }
    public int getPerimeter(){
        return (2*this.length) + (2*this.width);
    }




}
