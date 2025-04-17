package iostream;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Down5url {

    public static void Down5url(String urlString, String filename) throws IOException {
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

    public static void main(String[] args) {
        String[] urls = {
            "https://example.com/article1",
            "https://example.com/article2",
            "https://example.com/article3",
            "https://example.com/article4",
            "https://example.com/article5"
        };

        String[] filenames = {"article1.html", "article2.html", "article3.html", "article4.html", "article5.html"};

        for (int i = 0; i < urls.length; i++) {
            try {
            	Down5url(urls[i], filenames[i]);
                System.out.println("Downloaded: " + urls[i]);
            } catch (IOException e) {
                System.err.println("Failed to download " + urls[i]);
            }
        }
    }
}
