
public class Ball2 {
	    private float x, y; // Vị trí của bóng trên sân
	    private float xDelta, yDelta; // Hướng và tốc độ bóng

	    public Ball2(float x, float y) {
	        this.x = x;
	        this.y = y;
	        this.xDelta = 0;
	        this.yDelta = 0;
	    }

	    public float getX() { return x; }
	    public float getY() { return y; }
	    public void setPosition(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void move() {
	        x += xDelta;
	        y += yDelta;
	    }

	    public void setVelocity(float xDelta, float yDelta) {
	        this.xDelta = xDelta;
	        this.yDelta = yDelta;
	    }

	    public void stop() {
	        this.xDelta = 0;
	        this.yDelta = 0;
	    }

	    @Override
	    public String toString() {
	        return "Ball at (" + x + ", " + y + ") moving (" + xDelta + ", " + yDelta + ")";
	    }
	}

