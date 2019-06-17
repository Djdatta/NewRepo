package javaTest;

public class COnstrutctorTest {

	//static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value
	//we can change the value of static variables but not final
	//final must be initialize
	int id;	//non static only accessible in non static methods
	String name;
	static int roll;	// static can be use inside static or non static methods
	public COnstrutctorTest() {


		System.out.println("Defult Constructor..");
		
	}
	
	public COnstrutctorTest(int a, String b) {
		id=a;
		name=b;
	}
	
	public COnstrutctorTest(int a, String b, int c) {
		id=a;
		name=b;
		roll=c;
		roll++;
		System.out.println(roll);
	}
	
	public void display() {
		System.out.println(id +" " +name +" "+ roll);
	}
	
	
	public static void m1() {
		System.out.println("Static m1");
	}
	
	public static void main(String[] args) {
		
		COnstrutctorTest c=new COnstrutctorTest(1, "datta");
		COnstrutctorTest c1=new COnstrutctorTest(1, "datta",20);
		c.display();
		c1.display();
		roll=roll+1; // can change bthe value of static
		System.out.println(roll);
	//	System.out.println(id); //Cannot make a static reference to the non-static field id
		m1();
		
	}
	
}
