package javaTest;

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
	/*public ThisTest(int roll, String name) {
	
		roll=roll;  //output 0 null bcoz formal argument(local) and instance varibale are same
		name=name;
		
	}*/
	public ThisTest() {
		this(10,"dada");
		System.out.println("Default  conctructor");
		
	}
	
	public ThisTest(int roll, String name) {
		//this(); //current class constructor
		this.roll=roll;  //now working bcoz of this
		this.name=name;
		
		
	}
	
	public void display() {
		System.out.println(roll +" " +name);
	}
	
	public void m1() {
		System.out.println("m1...");
	}
	
	public static void main(String[] args) {
		
		ThisTest t=new ThisTest(1, "Datta");
		t.display();
	}
}
