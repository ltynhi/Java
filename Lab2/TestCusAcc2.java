
public class TestCusAcc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(1, "John Doe", 10);
        Account2 account = new Account2(1, customer1, 0.0);
        
        System.out.println(account.toString());
        account.deposit(150.75);
        System.out.println("After deposit: " + account.toString());
        account.withdraw(50.50);
        System.out.println("After withdrawal: " + account.toString());
        account.withdraw(200.00);
    }
	}


