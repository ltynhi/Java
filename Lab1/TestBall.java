
public class TestBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball = new Ball(80.0, 35.0, 4.0, 6.0);

        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXSpeed());
        System.out.println("yDelta is: " + ball.getYSpeed());

        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
        }

	}

}
