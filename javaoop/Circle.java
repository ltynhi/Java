package javaoop;

public class Circle implements Shape 
{

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}
	private double radius;
	public Circle (double radius) {
		this.radius=radius;
	}
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
