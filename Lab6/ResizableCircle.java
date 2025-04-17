public class ResizableCircle extends Circlee implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);  }
    @Override
    public double resize(int percent) {
        radius = radius + (radius * percent / 100.0); 
        return radius;
    }
}
