public class Square extends Rectangle {

    public Square(double side) {
        super(side, side, "undefined", false);  
    }
    public double getSide() {
        return getLength();  
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", " + super.toString() + "]";
    }
}
