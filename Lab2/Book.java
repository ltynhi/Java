
public class Book {
private String name;
private double price;
private int qty=0;
private Author ạuthor;
public Book(String name, Author author,double price) {
	this.name = name;
    this.ạuthor=author;
    this.price=price;
}
public Book(String name,Author author, double price,int qty) {
	this.name = name;
    this.ạuthor=author;
    this.price = price;
    this.qty = qty;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double prince) {
	this.price = prince;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Author getẠuthor() {
	return ạuthor;
}
public void setẠuthor(Author ạuthor) {
	this.ạuthor = ạuthor;
}
@Override
public String toString() {
	return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", ạuthor=" + ạuthor + "]";
}

}
