import java.util.Scanner;

public class TestMyPolynomial {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the coefficients for Polynomial 1 (separated by spaces): ");
	        String[] coeffs1 = scanner.nextLine().split(" ");
	        double[] coeffsArray1 = new double[coeffs1.length];
	        for (int i = 0; i < coeffs1.length; i++) {
	            coeffsArray1[i] = Double.parseDouble(coeffs1[i]);
	        }
	        MyPolynomial poly1 = new MyPolynomial(coeffsArray1);
	        System.out.print("Enter the coefficients for Polynomial 2 (separated by spaces): ");
	        String[] coeffs2 = scanner.nextLine().split(" ");
	        double[] coeffsArray2 = new double[coeffs2.length];
	        for (int i = 0; i < coeffs2.length; i++) {
	            coeffsArray2[i] = Double.parseDouble(coeffs2[i]);
	        }
	        MyPolynomial poly2 = new MyPolynomial(coeffsArray2);
	        System.out.println("\nPolynomial 1: " + poly1);
	        System.out.println("Degree of Polynomial 1: " + poly1.getDegree());
	        System.out.println("Evaluation of Polynomial 1 at x = 2: " + poly1.evaluate(2));
	        System.out.println("\nPolynomial 2: " + poly2);
	        System.out.println("Degree of Polynomial 2: " + poly2.getDegree());
	        System.out.println("Evaluation of Polynomial 2 at x = 2: " + poly2.evaluate(2));
	        MyPolynomial sum = poly1.add(poly2);
	        System.out.println("\nSum of Polynomial 1 and Polynomial 2: " + sum);
	        MyPolynomial product = poly1.multiply(poly2);
	        System.out.println("\nProduct of Polynomial 1 and Polynomial 2: " + product);
	    }
	
}
