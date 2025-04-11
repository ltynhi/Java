package iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		String filename = "data.txt";
		String content ="Nội dung được ghi vào file";
		try (FileOutputStream fos= new FileOutputStream(filename)){
			fos.write(content.getBytes());
			System.out.println("Ghi dữ liệu vào tệp thành công");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
