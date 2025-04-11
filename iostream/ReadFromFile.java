package iostream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {
		 String filename="data.txt";
		 
		 try  (FileInputStream fis= new FileInputStream(filename)){
			 int data;
			 System.out.println("Nội dung tệp : ");
			 while((data=fis.read())!=-1)	{
				 System.out.println((char) data);
			 }
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				 }

}
