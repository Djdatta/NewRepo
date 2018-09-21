import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	
	
	
	@Test
	
	public void test1(){
		
		System.out.println("Test...1");
	}
	
	@Test
	public void test2(){
		
		System.out.println("Test...2");
	}
	
	@Test
	public void test3(){
	
	System.out.println("Test...3");

	}
	
	@BeforeMethod
	public void a1(){
		System.out.println("launching the browser");
	}
}

