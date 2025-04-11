public class TestShape {
    public static void main(String[] args) {
      
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("red", false);
        System.out.println(s2);

        Circlee c1 = new Circlee();
        System.out.println(c1);
        Circlee c2 = new Circlee(2.5, "blue", true);
        System.out.println(c2);
        System.out.println("Circle Area: " + c2.getArea());
        System.out.println("Circle Perimeter: " + c2.getPerimeter());

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        Rectangle r2 = new Rectangle(3.0, 4.5, "yellow", false);
        System.out.println(r2);
        System.out.println("Rectangle Area: " + r2.getArea());
        System.out.println("Rectangle Perimeter: " + r2.getPerimeter());

        Squaree sq1 = new Squaree(5.0);
        System.out.println(sq1);
        Squaree sq2 = new Squaree(6.0, "purple", true);
        System.out.println(sq2);
        sq2.setSide(7.0);
        System.out.println("Updated " + sq2);
    }
}
