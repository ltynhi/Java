import java.util.Arrays;

public class Book2 {

private String name;
private double price;
private int qty=0;
private Author[] ạuthors;
public Book2(String name, Author[] authors,double price) {
	this.name = name;
    this.ạuthors=authors;
    this.price = price;
}
public Book2(String name,Author[] authors, double price,int qty) {
	this.name = name;
    this.ạuthors=authors;
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
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Author[] getẠuthors() {
	return ạuthors;
}
public void setẠuthors(Author[] ạuthors) {
	this.ạuthors = ạuthors;
}
public String getAuthorNames() {
    StringBuilder names = new StringBuilder();
    for (int i = 0; i < ạuthors.length; i++) {
        names.append(ạuthors[i].getName());
        if (i < ạuthors.length - 1) {
            names.append(", ");
        }
    }
    return names.toString();
}

@Override
public String toString() {
    StringBuilder authorDetails = new StringBuilder("{");
    for (int i = 0; i < ạuthors.length; i++) {
        authorDetails.append(ạuthors[i].toString());
        if (i < ạuthors.length - 1) {
            authorDetails.append(", ");
        }
    }
    authorDetails.append("}");
    return "Book[name=" + name + ",authors=" + authorDetails + ",price=" + price + ",qty=" + qty + "]";
}

}
