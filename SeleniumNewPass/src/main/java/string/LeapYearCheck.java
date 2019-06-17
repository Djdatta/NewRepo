package string;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		long y=2001;
		
		// Suppose we only use if(y%4==0) then problem start that years strart from 1800 so tha's why we use this compund if condition
		if(((y%4==0) && (y%100!=0)) || (y%400==0)) {
			System.out.println("Leap");
		}
		else {
			System.out.println("Not leap");
		}
		
	}
}
