package iostream;

import java.io.*;
import java.util.concurrent.*;

public class MultiThreadedKeywordSearch {
    private static final ExecutorService executor = Executors.newFixedThreadPool(5);
    private static final String keyword = "Java";

    public static void main(String[] args) {
        String filename = "C:\\JAVA\\Java_3\\src\\iostream\\input_files"; 
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

        ConcurrentHashMap<String, Integer> resultMap = new ConcurrentHashMap<>();

        for (File file : files) {
            executor.submit(() -> {
                int count = countKeywordInFile(file, keyword);
                resultMap.put(file.getName(), count);
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Kết quả tìm kiếm từ khóa \"" + keyword + "\":");
        resultMap.forEach((fileName, count) -> System.out.println(fileName + ": " + count + " lần"));
    }

    private static int countKeywordInFile(File file, String keyword) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, keyword);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static int countOccurrences(String line, String keyword) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }
        return count;
    }
}
