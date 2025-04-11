public class Visit {
    private Customer customer;
    private double productTotal;   
    private double serviceTotal;   
    public Visit(Customer customer, double productTotal, double serviceTotal) {
        this.customer = customer;
        this.productTotal = productTotal;
        this.serviceTotal = serviceTotal;
    }
    public double calculateTotalBill() {
        double serviceDiscount = Discount.getServiceDiscount(customer.getMembership());
        double serviceDiscountedPrice = serviceTotal * (1 - serviceDiscount);
        double productDiscountedPrice = productTotal * (1 - Discount.getProductDiscount());
        return serviceDiscountedPrice + productDiscountedPrice;
    }
    public void printBill() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Membership Type: " + customer.getMembership());
        System.out.println("Products Total: $" + productTotal);
        System.out.println("Services Total: $" + serviceTotal);
        System.out.println("Discount on Services: " + (Discount.getServiceDiscount(customer.getMembership()) * 100) + "%");
        System.out.println("Discount on Products: 10%");
        System.out.println("Total Bill: $" + calculateTotalBill());
    }
}
