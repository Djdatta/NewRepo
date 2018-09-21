package dj.com.studentinfo;

public class Student {

	int roll_no;
	String name;
	String address;
	
	
	static int a=100;
	
	Student(int roll_no, String name,String address){
			
		this.roll_no=roll_no;		//help to refer class A instrance variable i.e 1
		this.name=name;			//help to refer class A instrance variable i.e datta
		this.address=address;	//help to refer class A instrance variable i.e pune
	
		
	}
	
	Student(int x){
		
		//this(1,"sada","ads");	//to call parameterized constructors
	}

	void show(){
		
		int a=10;
		System.out.println("show method of class A");
		System.out.println(a);
	}
	
	void display(){
		System.out.println("Roll No=" +roll_no +"name"+name +"Address="+address);
		//this.show();		// Help to invoke current class methods
		
		
		System.out.println(a);
		
		
		
	}
	

	
	
}
