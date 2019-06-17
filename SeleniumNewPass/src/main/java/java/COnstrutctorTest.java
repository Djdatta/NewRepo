package java;

public class COnstrutctorTest {

	//package name java is not allowed,,, its giving JNI error
	int id;
	String name;
	int roll;
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
	}
	
	
	
	public static void main(String[] args) {
		
		COnstrutctorTest cOnstrutctorTest=new COnstrutctorTest();
		
		
	}
	
}
