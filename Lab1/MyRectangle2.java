
public class MyRectangle2 {
	    private MyPoint topLeft, bottomRight;
	    public MyRectangle2(MyPoint topLeft, MyPoint bottomRight) {
	        this.topLeft = topLeft;
	        this.bottomRight = bottomRight;
	    }
	    public double getWidth() {
	        return Math.abs(topLeft.getX() - bottomRight.getX());
	    }
	    public double getHeight() {
	        return Math.abs(topLeft.getY() - bottomRight.getY());
	    }
	    public double getArea() {
	        return getWidth() * getHeight();
	    }
	    public double getPerimeter() {
	        return 2 * (getWidth() + getHeight());
	    }
	    public boolean isSquare() {
	        return getWidth() == getHeight();
	    }

	    // Phương thức toString
	    @Override
	    public String toString() {
	        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	    }
	}

