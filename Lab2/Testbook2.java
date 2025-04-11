
public class Testbook2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Author[] authors = {
            new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'),
            new Author("Paul Tan", "paultan@nowhere.com", 'm')
        };
        for (Author author : authors) {
            System.out.println(author);
        }
        Book2 book2 = new Book2("Java for Beginners", authors, 29.95, 100);
        System.out.println(book2); // Kiểm tra toString()

        // Kiểm tra phương thức lấy tên tác giả
        System.out.println("Authors: " + book2.getAuthorNames());
}
}