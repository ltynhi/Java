public class Cylinder {
    private circle base;  
    private double height;
    public Cylinder() {
        base = new circle();  
        height = 1.0;
    }
    public Cylinder(double radius, String color, double height) {
        base = new circle(radius, color); 
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public circle getBase() {
        return base;
    }
    public void setBase(circle base) {
        this.base = base;
    }
    public double getVolume() {
        return base.getArea() * height;  
    }
    @Override
    public String toString() {
        return "Cylinder with base " + base + " and height = " + height;
    }
}
