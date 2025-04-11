
public class TestBigInteger {
	public static void main(String[] args) {
        // Khởi tạo hai số BigInteger từ chuỗi
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Thực hiện phép cộng
        BigInteger sum = i1.add(i2);
        System.out.println("Sum: " + sum);

        // Thực hiện phép nhân
        BigInteger product = i1.multiply(i2);
        System.out.println("Product: " + product);
    }

}
