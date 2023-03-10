package annotation_demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class11 {
  @Test
  public void abc() 
  {
	  System.out.println("This is abc from class11");
  }
  @BeforeTest
  void m()
  {
	  System.out.println("This is Before test");
  }
  @BeforeSuite
  void A()
  {
	  System.out.println("This is Before Suite");
	  
  }
  @AfterSuite
  void B()
  {
	  System.out.println("This is After Suite");
  }
}
