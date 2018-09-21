import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1{

	
	@Test
	
	public void test4(){
		
		System.out.println("Test...4");
	}
	
	@Test
	public void test5(){
		
		System.out.println("Test...5");
	}
	
	@Test
	public void test6(){
	
	System.out.println("Test...6");

	}
	
	@BeforeMethod
	public void a1(){
		System.out.println("launching the browser");
	}
}

