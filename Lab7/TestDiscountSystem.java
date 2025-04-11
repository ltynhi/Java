public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", Customer.MembershipType.PREMIUM);
        Customer customer2 = new Customer("Bob", Customer.MembershipType.GOLD);
        Customer customer3 = new Customer("Charlie", Customer.MembershipType.SILVER);
        Customer customer4 = new Customer("Dave", Customer.MembershipType.NONE);
        Visit visit1 = new Visit(customer1, 100.0, 200.0); 
        Visit visit2 = new Visit(customer2, 50.0, 100.0);  
        Visit visit3 = new Visit(customer3, 200.0, 300.0);
        Visit visit4 = new Visit(customer4, 150.0, 250.0); 
        visit1.printBill();
        System.out.println("----------------------------");
        visit2.printBill();
        System.out.println("----------------------------");
        visit3.printBill();
        System.out.println("----------------------------");
        visit4.printBill();
    }
}
