package iostream;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ThreadHTML {

    public static void ThreadHTML(String urlString, String filename) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    public static String cleanHtml(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        
        // Đọc nội dung từ file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        Document doc = Jsoup.parse(content.toString());
        return doc.body().text();  
    }

    public static void mergeFiles(String[] inputFiles, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String inputFile : inputFiles) {
                String content = cleanHtml(inputFile);
                if (!content.isEmpty()) {
                    writer.write(content);
                    writer.newLine();
                    writer.newLine();  // Tạo khoảng cách giữa các file
                }
            }
        }
    }

    // Hàm chính sử dụng ExecutorService để tải và xử lý dữ liệu song song
    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
        String[] urls = {
            "https://example.com/article1",
            "https://example.com/article2",
            "https://example.com/article3",
            "https://example.com/article4",
            "https://example.com/article5"
        };

        String[] filenames = {"article1.html", "article2.html", "article3.html", "article4.html", "article5.html"};

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Void>> futures = new ArrayList<>();

        for (int i = 0; i < urls.length; i++) {
            final int index = i;
            futures.add(executor.submit(() -> {
                try {
                	ThreadHTML(urls[index], filenames[index]);
                    System.out.println("Downloaded: " + urls[index]);
                } catch (IOException e) {
                    System.err.println("Failed to download " + urls[index]);
                }
                return null;
            }));
        }

        for (Future<Void> future : futures) {
            future.get();
        }

        String[] inputFiles = {"article1.html", "article2.html", "article3.html", "article4.html", "article5.html"};
        mergeFiles(inputFiles, "merged_output.txt");

        executor.shutdown();

        System.out.println("Merged output saved to merged_output.txt");
    }
}
