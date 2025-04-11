	import java.util.Arrays;
public class MyDate {
	    private int year;
	    private int month;
	    private int day;
	    private static final String[] MONTHS = 
	        {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
	         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	    private static final String[] DAYS = 
	        {"Sunday", "Monday", "Tuesday", "Wednesday", 
	         "Thursday", "Friday", "Saturday"};
	    private static final int[] DAYS_IN_MONTHS = 
	        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    public MyDate(int year, int month, int day) {
	        setDate(year, month, day);
	    }
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	    public static boolean isValidDate(int year, int month, int day) {
	        if (year < 1 || year > 9999 || month < 1 || month > 12) return false;
	        int dayMax = DAYS_IN_MONTHS[month - 1];
	        if (month == 2 && isLeapYear(year)) {
	            dayMax = 29;
	        }
	        return day >= 1 && day <= dayMax;
	    }
	    public static int getDayOfWeek(int year, int month, int day) {
	        if (month < 3) {
	            month += 12;
	            year--;
	        }
	        int k = year % 100;
	        int j = year / 100;
	        int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
	        return (h + 5) % 7; // Điều chỉnh về 0=Sunday, ..., 6=Saturday
	    }
	    public void setDate(int year, int month, int day) {
	        if (isValidDate(year, month, day)) {
	            this.year = year;
	            this.month = month;
	            this.day = day;
	        } else {
	            throw new IllegalArgumentException("Invalid year, month, or day!");
	        }
	    }
	    public void setYear(int year) {
	        if (year >= 1 && year <= 9999) {
	            this.year = year;
	        } else {
	            throw new IllegalArgumentException("Invalid year!");
	        }
	    }

	    public void setMonth(int month) {
	        if (month >= 1 && month <= 12) {
	            this.month = month;
	        } else {
	            throw new IllegalArgumentException("Invalid month!");
	        }
	    }
	    public void setDay(int day) {
	        if (isValidDate(year, month, day)) {
	            this.day = day;
	        } else {
	            throw new IllegalArgumentException("Invalid day!");
	        }
	    }
	    public int getYear() { return year; }
	    public int getMonth() { return month; }
	    public int getDay() { return day; }

	    @Override
	    public String toString() {
	        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
	    }
	    public MyDate nextDay() {
	        if (isValidDate(year, month, day + 1)) {
	            day++;
	        } else if (month < 12) {
	            day = 1;
	            month++;
	        } else {
	            day = 1;
	            month = 1;
	            if (year < 9999) {
	                year++;
	            } else {
	                throw new IllegalStateException("Year out of range!");
	            }
	        }
	        return this;
	    }

	    public MyDate nextMonth() {
	        int maxDay = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? 31 :
	                     (month == 4 || month == 6 || month == 9 || month == 11) ? 30 :
	                     (isLeapYear(year) ? 29 : 28);
	        if (month == 12) {
	            month = 1;
	            if (year < 9999) year++;
	            else throw new IllegalStateException("Year out of range!");
	        } else {
	            month++;
	        }
	        day = Math.min(day, maxDay);
	        return this;
	    }

	    public MyDate nextYear() {
	        if (year < 9999) {
	            year++;
	            if (month == 2 && day == 29 && !isLeapYear(year)) {
	                day = 28;
	            }
	        } else {
	            throw new IllegalStateException("Year out of range!");
	        }
	        return this;
	    }

	    public MyDate previousDay() {
	        if (day > 1) {
	            day--;
	        } else if (month > 1) {
	            month--;
	            day = DAYS_IN_MONTHS[month - 1];
	            if (month == 2 && isLeapYear(year)) day = 29;
	        } else {
	            month = 12;
	            day = 31;
	            if (year > 1) {
	                year--;
	            } else {
	                throw new IllegalStateException("Year out of range!");
	            }
	        }
	        return this;
	    }

	    public MyDate previousMonth() {
	        if (month > 1) {
	            month--;
	        } else {
	            month = 12;
	            if (year > 1) year--;
	            else throw new IllegalStateException("Year out of range!");
	        }
	        day = Math.min(day, DAYS_IN_MONTHS[month - 1]);
	        if (month == 2 && isLeapYear(year)) day = 29;
	        return this;
	    }

	    public MyDate previousYear() {
	        if (year > 1) {
	            year--;
	            if (month == 2 && day == 29 && !isLeapYear(year)) {
	                day = 28;
	            }
	        } else {
	            throw new IllegalStateException("Year out of range!");
	        }
	        return this;
	    }
	}


