public class Circlee extends Shape {
    private double radius;
    public Circlee() {
        super(); 
        this.radius = 1.0;
    }
    public Circlee(double radius) {
        super();  
        this.radius = radius;
    }
    public Circlee(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
