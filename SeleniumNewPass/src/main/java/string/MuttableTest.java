package string;

public class MuttableTest {

	
	
	public static void main(String[] args) {
					
			MuttableTest muttableTest=new MuttableTest();
			muttableTest.m1(12.0, 12);
			
			
		
	}
	
	int m1(int a, int b) {
		
		int c=a+b;
		System.out.println("m1");
		return c;
		
	}
	
	double m1(double a, int b) {
		
		int c=(int) (a+b);
		System.out.println("m1 b");
		return c;
		
	}
	
	
}
