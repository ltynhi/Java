package Encryptable;
import java.util.Scanner;
public class main {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.println("Nhập văn bản cần mã hóa: ");
	            String originalText = scanner.nextLine();

	            System.out.println("Nhập khóa AES (ít nhất 8 ký tự, tốt nhất 16 ký tự): ");
	            String aesKey = scanner.nextLine();

	            // AES
	            Encryptable aes = new AESEncryption(aesKey);
	            String aesEncrypted = aes.encrypt(originalText);
	            String aesDecrypted = aes.decrypt(aesEncrypted);

	            System.out.println("\n=== AES ===");
	            System.out.println("Original:  " + originalText);
	            System.out.println("Encrypted: " + aesEncrypted);
	            System.out.println("Decrypted: " + aesDecrypted);

	            // RSA (tạo key tự động)
	            Encryptable rsa = new RSAEncryption();
	            String rsaEncrypted = rsa.encrypt(originalText);
	            String rsaDecrypted = rsa.decrypt(rsaEncrypted);

	            System.out.println("\n=== RSA ===");
	            System.out.println("Original:  " + originalText);
	            System.out.println("Encrypted: " + rsaEncrypted);
	            System.out.println("Decrypted: " + rsaDecrypted);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}