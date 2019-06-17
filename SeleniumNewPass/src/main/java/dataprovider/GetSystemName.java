package dataprovider;

public class GetSystemName {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.name"));
		
		System.out.println(System.getenv("USERNAME"));
		
		System.out.println(new com.sun.security.auth.module.NTSystem().getName());
	}

}
