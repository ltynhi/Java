package javaoop;

public class Rectangle implements Shape {

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (width+length)*2;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
	}
	private double width;
	private double length;
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	public String toString() {
		return " Rectangle [ [width=" + width + ",length=" + length + "]";
	}

}
