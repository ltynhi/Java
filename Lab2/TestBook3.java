
public class TestBook3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author3 a1 = new Author3("Tan Ah Teck", "ahteck@nowhere.com");
	      System.out.println(a1);

	      a1.setEmail("ahteck@somewhere.com");
	      System.out.println(a1);
	      System.out.println("name is: " + a1.getName());
	      System.out.println("email is: " + a1.getEmail());

	      // Test Book class
	      Book3 b3 = new Book3("12345", "Java for dummies", a1, 8.8, 88);
	      System.out.println(b3);
	      b3.setPrice(9.9);
	      b3.setQty(99);
	      System.out.println(b3);
	      System.out.println("isbn is: " + b3.getIsbn());
	      System.out.println("name is: " + b3.getName());
	      System.out.println("price is: " + b3.getPrice());
	      System.out.println("qty is: " + b3.getQty());
	      System.out.println("author is: " + b3.getAuthor());  // Author's toString()
	      System.out.println("author's name: " + b3.getAuthorName());
	      System.out.println("author's email: " + a1.getEmail());

	   }
	}

