
public class Ball {
	private double x, y; 
    private double xSpeed, ySpeed; 
    private int radius = 5;

    public Ball(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void move() {
        this.x += xSpeed;
        this.y += ySpeed;
    }

    @Override
    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", x, y, xSpeed, ySpeed);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

}
