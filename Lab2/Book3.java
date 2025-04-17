public class Book3<T extends Author3> {
    private String isbn;
    private String name;
    private T author;
    private double price;
    private int qty = 0;

    public Book3(String isbn, String name, T author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book3(String isbn, String name, T author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAuthor() {
        return author;
    }

    public void setAuthor(T author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName(); // Không còn lỗi vì đã ràng buộc kiểu T là Author3
    }

    @Override
    public String toString() {
        return "Book3 [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
    }
}
