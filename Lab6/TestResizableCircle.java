public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);      
        System.out.println("Initial Circle Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Initial Circle Area: " + resizableCircle.getArea());
        resizableCircle.resize(20); 
        System.out.println("Resized Circle Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Resized Circle Area: " + resizableCircle.getArea());
    }
}
