package iostream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class ReadInteger {
	public static void main(String[] args) {
        String fileName = "C:\\JAVA\\Java_3\\src\\iostream\\number.txt";
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Đọc dữ liệu từ tệp:");
            while (dis.available() > 0) {
                int number = dis.readInt();  
                System.out.println(number); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


