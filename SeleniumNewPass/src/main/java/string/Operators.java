package string;

public class Operators {
public static void main(String[] args) throws ArithmeticException {
	
	int a=10;
	int b=10;
	Operators operators=new Operators();
	operators.m1();
	
	System.out.println(a++);	//10
	System.out.println(b++);	//10
	
	System.out.println(a);	//now it become 11
	System.out.println(b);
	
	System.out.println(++a);	//12
	System.out.println(++b);
	
	System.out.println(a++ + ++b); //12+13=25
	
	System.out.println(a++ + b++); //26
	
	System.out.println("ans");
	System.out.println(5<<2);
}
	
public void m1() throws NullPointerException{
	
	String a=null;
	try {
		if(a.equals("SA"));
	} catch (Exception e) {
		// TODO: handle exception
	}
		
	System.out.println("M1");
}

public void m2() {
	
	
}


}
