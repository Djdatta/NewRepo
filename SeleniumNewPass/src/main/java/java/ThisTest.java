package java;

public class ThisTest {

	
/*this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.
	 * 
 */
	
	int roll;
	String name;
	public ThisTest(int roll, String name) {
	
		roll=roll;
		name=name;
		
	}
	
	public static void main(String[] args) {
		
		ThisTest t=new ThisTest(1, "Datta");
		
	}
}
