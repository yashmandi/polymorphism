public class Rectangle2 extends Shape2 {
    private double length;
    private double width;

    public Rectangle2 (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override 
    public double getArea() {
        return length * width;
    }

    @Override 
    public double getPerimeter() {
        return (length * length) + (width * width);
    }
}
