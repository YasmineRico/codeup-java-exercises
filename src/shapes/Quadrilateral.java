package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral(){} // no argument


    public Quadrilateral(double length, double width){
        this.width =width;
        this.length =length;
    }

    @Override
    public double getPerimeter() {
        return (2* this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
