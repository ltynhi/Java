public class TestPoint {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 5.0f);
        System.out.println("Point2D: " + p2d);
        p2d.setXY(1.2f, 4.8f);
        System.out.println("Updated Point2D: " + p2d);
        Point3D p3d = new Point3D(2.0f, 3.0f, 4.0f);
        System.out.println("Point3D: " + p3d);
        p3d.setXYZ(1.5f, 2.5f, 3.5f);
        System.out.println("Updated Point3D: " + p3d);
        float[] xy = p2d.getXY();
        System.out.println("Point2D XY: (" + xy[0] + ", " + xy[1] + ")");
        float[] xyz = p3d.getXYZ();
        System.out.println("Point3D XYZ: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}
