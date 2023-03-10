package annotation_demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class22 {
	@Test
	  public void xyz() 
	  {
		  System.out.println("This is xyz from class22");
	  }
	  @AfterTest
	  void n()
	  {
		  System.out.println("This is After Test ");
	  }
}
