
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		System.out.println("The circle has radius of "+ c1.getRadius()+" and area of "+c1.getArea());
		 Circle c2 = new Circle(2.0);
	      System.out.println("The circle has radius of "  + c2.getRadius() + " and area of " + c2.getArea());
	      c1 = new Circle(1.1);
	      System.out.println(c1);  
	      c2 = new Circle();
	      System.out.println(c2);
	      c1.setRadius(2.2);
	      System.out.println(c1);     
	      System.out.println("radius is: " + c1.getRadius());
	      System.out.printf("area is: %.2f%n", c1.getArea());
	      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
		
		
	}

}
