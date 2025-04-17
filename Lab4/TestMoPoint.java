
public class TestMoPoint {

	 public static void main(String[] args) {
	        Point p1 = new Point();
	        System.out.println("Point p1: " + p1);
	        Point p2 = new Point(3.5f, 4.5f);
	        System.out.println("Point p2: " + p2);
	        MovablePoint mp1 = new MovablePoint();
	        System.out.println("MovablePoint mp1: " + mp1);
	        MovablePoint mp2 = new MovablePoint(1.0f, 1.5f);
	        System.out.println("MovablePoint mp2: " + mp2);
	        MovablePoint mp3 = new MovablePoint(2.0f, 3.0f, 0.5f, 0.7f);
	        System.out.println("MovablePoint mp3 before move: " + mp3);
	        mp3.move();
	        System.out.println("MovablePoint mp3 after move: " + mp3);
	    }
	}
