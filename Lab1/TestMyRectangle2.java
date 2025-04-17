
public class TestMyRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        MyPoint2 p1 = new MyPoint2(1, 5);  // Top-left corner
		        MyPoint2 p2 = new MyPoint2(4, 2);  // Bottom-right corner
		        MyRectangle2 rectangle = new MyRectangle2(p1, p2);
		        System.out.println(rectangle); 
		        System.out.println("Width: " + rectangle.getWidth());  
		        System.out.println("Height: " + rectangle.getHeight());  
		        System.out.println("Area: " + rectangle.getArea()); 
		        System.out.println("Perimeter: " + rectangle.getPerimeter());  
		        System.out.println("Is square? " + rectangle.isSquare()); 
		        MyPoint2 p3 = new MyPoint2(0, 4);
		        MyPoint2 p4 = new MyPoint2(4, 0);
		        MyRectangle2 square = new MyRectangle2(p3, p4);

		        System.out.println(square);  
		        System.out.println("Is square? " + square.isSquare());  
		    }
		}
