
public class TestTime {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Time time1 = new Time(1, 2, 3);
	        Time time2 = new Time(4, 5, 6);
	        Time time3 = new Time(23, 59, 58);

	        System.out.println(time1);
	        System.out.println(time2);
	        System.out.println("Hour: " + time2.getHour());
	        System.out.println("Minute: " + time2.getMinute());
	        System.out.println("Second: " + time2.getSecond());
	        
	        System.out.println(time3);
	        System.out.println(time3.nextSecond());
	        System.out.println(time3.nextSecond());
	        System.out.println(time3.previousSecond());
	        System.out.println(time3.previousSecond());
	    }

}
