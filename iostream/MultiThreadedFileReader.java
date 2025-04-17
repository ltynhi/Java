package iostream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedFileReader {
	private static final int CHUNK_SIZE = 1024 * 1024; 
    private static final ExecutorService executor = Executors.newFixedThreadPool(5);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filename = "C:\\JAVA\\Java_3\\src\\iostream\\large_file.txt"; 
	        String outputFilename = "C:\\JAVA\\Java_3\\src\\iostream\\output_large.txt"; 

	        File file = new File(filename);
	        if (!file.exists()) {
	            System.out.println("File không tồn tại!");
	            return;
	        }

	        long fileSize = file.length();
	        int numChunks = (int) Math.ceil((double) fileSize / CHUNK_SIZE);
	        String[] fileParts = new String[numChunks];

	        ExecutorService executor = Executors.newFixedThreadPool(5);
	        CountDownLatch latch = new CountDownLatch(numChunks);

	        System.out.println("Chia file thành " + numChunks + " phần...");

	        for (int i = 0; i < numChunks; i++) {
	            final int chunkIndex = i;
	            executor.submit(() -> {
	                fileParts[chunkIndex] = readChunk(filename, chunkIndex);
	                latch.countDown();
	            });
	        }

	        try {
	            latch.await(); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        executor.shutdown(); 

	        writeToFile(outputFilename, fileParts);
	        System.out.println("File đã được ghép lại thành công: " + outputFilename);
	    }
	    private static String readChunk(String filename, int chunkIndex) {
	        try (RandomAccessFile raf = new RandomAccessFile(filename, "r")) {
	            raf.seek((long) chunkIndex * CHUNK_SIZE);
	            byte[] buffer = new byte[CHUNK_SIZE];
	            int bytesRead = raf.read(buffer);

	            return new String(buffer, 0, bytesRead);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return "";
	        }
	    }
	    private static void writeToFile(String outputFilename, String[] fileParts) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
	            for (String part : fileParts) {
	                if (part != null) {
	                    writer.write(part);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}