
public class TestMyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(3, 4);
        MyTriangle triangle1 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle1); 
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        triangle1.printType();  
        MyTriangle triangle2 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println(triangle2);  
        System.out.println("Perimeter: " + triangle2.getPerimeter());  
        triangle2.printType();  
    }
}