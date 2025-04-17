
public class TestDate {
	 public static void main(String[] args) {
	        Date date1 = new Date(1, 2, 2014);
	        Date date2 = new Date(9, 12, 2099);
	        Date date3 = new Date(3, 4, 2016);

	        System.out.println(date1);
	        System.out.println(date2);
	        System.out.println("Month: " + date2.getMonth());
	        System.out.println("Day: " + date2.getDay());
	        System.out.println("Year: " + date2.getYear());
	        System.out.println(date3);
	    }
	}

