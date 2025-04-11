
public class Invoice {
private int id;
private Customer customer;
private double amuont;
public Invoice(int id, Customer customer, double amuont) {
	super();
	this.id = id;
	this.customer = customer;
	this.amuont = amuont;
}
public int getId() {
	return id;
}
public Customer getCustomer() {
	return customer;
}
public double getAmuont() {
	return amuont;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public void setAmuont(double amuont) {
	this.amuont = amuont;
}
public int getCustomerId() {
    return customer.getId();
}
public String getCustomerName() {
    return customer.getName();
}


public int getCustomerDiscount() {
    return customer.getDiscount();
}

public double getAmountAfterDiscount() {
    return amuont - (amuont * customer.getDiscount() / 100.0);
}

@Override
public String toString() {
    return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amuont + "]";
}
}
