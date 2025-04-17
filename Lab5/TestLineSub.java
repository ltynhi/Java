public class TestLineSub {
    public static void main(String[] args) {
        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);
        System.out.println("Length: " + ls1.getLength());
        System.out.println("Gradient: " + Math.toDegrees(ls1.getGradient()));
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);
        LineSub ls2 = new LineSub(p1, p2);
        System.out.println(ls2);
    }
}
