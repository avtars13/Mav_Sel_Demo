import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
  
  @BeforeMethod
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
  @AfterMethod
  public void logout()
  {
	  System.out.println("logout"); 
  }
}
