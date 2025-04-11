
public class TestAuBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
	        System.out.println(author); 
	        author.setEmail("paulTan@nowhere.com");
	        System.out.println("Updated email: " + author.getEmail());
	        Book book = new Book("Java for Beginners", author, 29.95, 100);
	        System.out.println(book); 
	        book.setPrice(25.99);
	        book.setQty(120);
	        System.out.println("Updated price: " + book.getPrice());
	        System.out.println("Updated quantity: " + book.getQty());
	}

}
