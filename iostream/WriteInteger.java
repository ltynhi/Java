package iostream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteInteger {
	 public static void main(String[] args) {
	        String fileName = "C:\\JAVA\\Java_3\\src\\iostream\\number.txt";  
	        int[] numbers = {1, 2, 3, 4, 5, 10, 20, 30};
	        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
	            for (int num : numbers) {
	                dos.writeInt(num); 
	            }
	            System.out.println("Dữ liệu đã được ghi vào tệp: " + fileName);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
