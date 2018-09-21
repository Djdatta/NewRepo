
public class StringDemo{

	int roll_no;
	String name;
	String address;
	
	public StringDemo(int roll_no, String name , String address){
		this.roll_no=roll_no;
		this.name=name;
		this.address=address;
		
		
		System.out.println("roll= "+roll_no+" Name ="+name+" Address= "+address);
	}
	
	
	public void method1(){
		
		int a=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
	
		StringDemo demo=new StringDemo(1, "Datta", "Pune");
		
		
		
	}

}
