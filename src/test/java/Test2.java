import org.testng.annotations.*;

public class Test2 {
	 @BeforeClass
	  public void login()
	  {
		  System.out.println("login");
	  }
	  @Test(priority=1)
	  public void search()
	  {
		  System.out.println("search");
		  
	  }
	  @Test(priority=2)
	  public void advancesearch()
	  {
		  System.out.println("advsearch");
	  }
	  @AfterClass
	  public void logout()
	  {
		  System.out.println("logout"); 
	  }
}
