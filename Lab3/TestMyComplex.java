import java.util.Scanner;
public class TestMyComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter complex number 1 (real and imaginary part): ");
		        double real1 = scanner.nextDouble();
		        double imag1 = scanner.nextDouble();
		        MyComplex number1 = new MyComplex(real1, imag1);
		        System.out.print("Enter complex number 2 (real and imaginary part): ");
		        double real2 = scanner.nextDouble();
		        double imag2 = scanner.nextDouble();
		        MyComplex number2 = new MyComplex(real2, imag2);
		        System.out.println("\nNumber 1 is: " + number1);
		        System.out.println(number1 + " is " + (number1.isReal() ? "a pure real number" : "NOT a pure real number"));
		        System.out.println(number1 + " is " + (number1.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));
		        System.out.println("\nNumber 2 is: " + number2);
		        System.out.println(number2 + " is " + (number2.isReal() ? "a pure real number" : "NOT a pure real number"));
		        System.out.println(number2 + " is " + (number2.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));
		        System.out.println("\n" + number1 + " is " + (number1.equals(number2) ? "" : "NOT ") + "equal to " + number2);
		        MyComplex sum = number1.addNew(number2);
		        System.out.println("\n" + number1 + " + " + number2 + " = " + sum);
		        number1.addInto(number2);
		        System.out.println("\nAfter adding into, number1 = " + number1);
		    }
		}

