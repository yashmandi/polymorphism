public class Shape2Call {
    public static void main(String[] args) {
        
        // Circle    
        double r = 5.0;
        Circle2 circle2 = new Circle2(r);
        System.out.println("Radius of the circle: " + r);
        System.out.println("Area of circle: " + circle2.getArea());
        System.out.println("Perimeter of circle: " + circle2.getPerimeter());

        // Rectangle
        double rs1 = 10.0;                                        // rs (Rectangle Side)
        double rs2 = 22.5;
        Rectangle2 rectangle2 = new Rectangle2(rs1, rs2);
        System.out.println("\nSides of rectangle: " + rs1 + " and " + rs2);
        System.out.println("Area of rectangle: " + rectangle2.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle2.getPerimeter());

        // Triangle
        double ts1 = 5.0, ts2 = 9.3, ts3 = 10.1;                   // ts (Triangle Side)
        Triangle2 triangle2 = new Triangle2(ts1, ts2, ts3);
        System.out.println("\nSides of triangle: " + ts1 + ", " + ts2 + " and " + ts3);
        System.out.println("Area of triangle: " + triangle2.getArea());
        System.out.println("Perimeter of triangle: " + triangle2.getPerimeter());

    }
}
