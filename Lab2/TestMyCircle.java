
public class TestMyCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        MyCircle c1 = new MyCircle();
		        MyCircle c2 = new MyCircle(3, 4, 5);
		        MyPoint p = new MyPoint(6, 8);
		        MyCircle c3 = new MyCircle(p, 7);

		        System.out.println("Circle 1: " + c1);
		        System.out.println("Circle 2: " + c2);
		        System.out.println("Circle 3: " + c3);

		        System.out.println("c2 Radius: " + c2.getRadius());
		        System.out.println("c3 Center: " + c3.getCenter());

		        System.out.println("c2 Area: " + c2.getArea());
		        System.out.println("c3 Circumference: " + c3.getCircumference());

		        System.out.println("Distance between c2 and c3: " + c2.distance(c3));

		        c1.setCenterXY(2, 3);
		        c1.setRadius(10);
		        System.out.println("Updated c1: " + c1);
		    }
	
}
