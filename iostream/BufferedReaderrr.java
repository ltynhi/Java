package iostream;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderrr { 
    public static void main(String[] args) {
        String fileName = "output.txt";  

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Nhập nội dung (gõ 'exit' để dừng):");

            String line;
            while (true) {
                line = br.readLine(); 
                if ("exit".equalsIgnoreCase(line)) {
                    break; 
                }
                bw.write(line); 
                bw.newLine();
            }

            System.out.println("Dữ liệu đã được lưu vào tệp: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
