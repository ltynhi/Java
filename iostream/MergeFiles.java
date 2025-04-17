package iostream;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

public class MergeFiles {

    public static String cleanHtml(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        if (content.toString().isEmpty()) {
            throw new IOException("File " + filename + " is empty or contains invalid data.");
        }

        try {
            Document doc = Jsoup.parse(content.toString());
            return doc.body().text();  
        } catch (Exception e) {
         
            System.err.println("Error parsing HTML from file " + filename + ": " + e.getMessage());
            return "";  
        }
    }

    public static void mergeFiles(String[] inputFiles, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String inputFile : inputFiles) {
                String content = cleanHtml(inputFile);
                if (!content.isEmpty()) {
                    writer.write(content);
                    writer.newLine();
                    writer.newLine();  
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] filenames = {"article1.html", "article2.html", "article3.html", "article4.html", "article5.html"};
        try {
            mergeFiles(filenames, "merged_output.txt");
            System.out.println("Merged output saved to merged_output.txt");
        } catch (IOException e) {
            System.err.println("Error during merging files: " + e.getMessage());
        }
    }
}
