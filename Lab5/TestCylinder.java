public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Volume: " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(2.0, "blue", 5.0);
        System.out.println(cylinder2);
        System.out.println("Volume: " + cylinder2.getVolume());
        circle customCircle = new circle(3.0, "green");
        Cylinder cylinder3 = new Cylinder();
        cylinder3.setBase(customCircle);  
        cylinder3.setHeight(10.0);
        System.out.println(cylinder3);
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}
