
public class TestEmployee {
	 public static void main(String[] args) {
	      
		 Employee e1 = new Employee(8, "Peter", "Tan", 2500);
	        System.out.println(e1);
	        
	        e1.setSalary(999);
	        System.out.println(e1);
	        
	        System.out.println("id is: " + e1.getId());
	        System.out.println("firstname is: " + e1.getFirstname());
	        System.out.println("lastname is: " + e1.getLastname());
	        System.out.println("salary is: " + e1.getSalary());
	        System.out.println("name is: " + e1.getName());
	        System.out.println("annual salary is: " + e1.getAnnualSalary());
	        
	        int newSalary = e1.raiseSalary(10);
	        System.out.println(newSalary);
	        System.out.println(e1);
	    }

	   
}
