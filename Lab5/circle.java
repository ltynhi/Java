
public class circle {
	 private double radius;
	    private String color;
	    public circle() {
	        radius = 1.0;
	        color = "red";
	    }
	    public circle(double radius, String color) {
	        this.radius = radius;
	        this.color = color;
	    }
	    public double getRadius() {
	        return radius;
	    }
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	    public String getColor() {
	        return color;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }
	    @Override
	    public String toString() {
	        return "Circle with radius = " + radius + " and color = " + color;
	    }
	
}
