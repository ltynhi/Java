
public class Player {
	    private String name;
	    private float x, y; 

	    public Player(String name, float x, float y) {
	        this.name = name;
	        this.x = x;
	        this.y = y;
	    }

	    public String getName() { return name; }
	    public float getX() { return x; }
	    public float getY() { return y; }

	    public void move(float newX, float newY) {
	        this.x = newX;
	        this.y = newY;
	    }

	    public void kick(Ball2 ball, float xSpeed, float ySpeed) {
	        System.out.println(name + " kicked the ball!");
	        ball.setVelocity(xSpeed, ySpeed);
	    }

	    @Override
	    public String toString() {
	        return "Player " + name + " at (" + x + ", " + y + ")";
	    }
	}

