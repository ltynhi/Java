package iostream;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
public class FileThread {
    private static final ExecutorService executor = Executors.newFixedThreadPool(5);
	public static void main(String[] args) {
		  String filename = "";
	        filename = "C:\\JAVA\\Java_3\\src\\iostream\\inputfile"; 
	        File directory = new File(filename);

	        if (!directory.exists() || !directory.isDirectory()) {
	            System.out.println("Thư mục không tồn tại hoặc không hợp lệ!");
	            return;
	        }

	        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
	        if (files == null || files.length == 0) {
	            System.out.println("Không có file văn bản nào trong thư mục!");
	            return;
	        }
	        filename = "C:\\JAVA\\Java_3\\src\\iostream\\outputfile2.txt"; 
	        String outputFile = filename;

	        List<Future<String>> results = new ArrayList<>();

	        for (File file : files) {
	            results.add(executor.submit(() -> readFileContent(file)));
	        }

	        executor.shutdown();

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
	            for (Future<String> result : results) {
	                writer.write(result.get()); 
	                writer.newLine();
	            }
	            System.out.println("Gộp file thành công! Xem kết quả tại: " + outputFile);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static String readFileContent(File file) {
	        StringBuilder content = new StringBuilder();
	        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return "=== " + file.getName() + " ===\n" + content.toString();
	    }
	}


