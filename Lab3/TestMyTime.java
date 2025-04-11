
public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime(23, 59, 58);
        System.out.println("Initial time: " + time);
        time.nextSecond();
        System.out.println("After nextSecond(): " + time);
        time.nextSecond();
        System.out.println("After nextSecond(): " + time);
        time.previousSecond();
        System.out.println("After previousSecond(): " + time);
        time.setTime(23, 58, 59);
        System.out.println("Set to 23:58:59: " + time);
        time.nextMinute();
        System.out.println("After nextMinute(): " + time);
        time.previousMinute();
        System.out.println("After previousMinute(): " + time);
        time.setTime(22, 59, 59);
        System.out.println("Set to 22:59:59: " + time);
        time.nextHour();
        System.out.println("After nextHour(): " + time);
        time.previousHour();
        System.out.println("After previousHour(): " + time);
        try {
            time.setTime(25, 0, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
	}

