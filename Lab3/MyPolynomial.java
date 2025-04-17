
public class MyPolynomial {
	 private double[] coeffs;
	    public MyPolynomial(double... coeffs) {
	        this.coeffs = coeffs;
	    }
	    public int getDegree() {
	        return coeffs.length - 1;  
	    }
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();

	        for (int i = coeffs.length - 1; i >= 0; i--) {
	            if (i < coeffs.length - 1 && coeffs[i] >= 0) {
	                sb.append("+");
	            }

	            sb.append(coeffs[i]);
	            if (i > 0) {
	                sb.append("x^" + i);
	            }
	        }

	        return sb.toString();
	    }
	    public double evaluate(double x) {
	        double result = 0;
	        for (int i = 0; i < coeffs.length; i++) {
	            result += coeffs[i] * Math.pow(x, coeffs.length - 1 - i);
	        }
	        return result;
	    }
	    public MyPolynomial add(MyPolynomial another) {
	        int maxLength = Math.max(this.coeffs.length, another.coeffs.length);
	        double[] resultCoeffs = new double[maxLength];
	        for (int i = 0; i < maxLength; i++) {
	            if (i < this.coeffs.length) {
	                resultCoeffs[i] += this.coeffs[i];
	            }
	            if (i < another.coeffs.length) {
	                resultCoeffs[i] += another.coeffs[i];
	            }
	        }

	        return new MyPolynomial(resultCoeffs);
	    }
	    public MyPolynomial multiply(MyPolynomial another) {
	        int resultDegree = this.getDegree() + another.getDegree();
	        double[] resultCoeffs = new double[resultDegree + 1];
	        for (int i = 0; i < this.coeffs.length; i++) {
	            for (int j = 0; j < another.coeffs.length; j++) {
	                resultCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
	            }
	        }
	        return new MyPolynomial(resultCoeffs);
	    }

}
