package test_group;
import org.testng.annotations.Test;
public class tgroup1
{
  @Test(priority=1,groups= {"sanity","regression"})
  public void loginbyemail()
  {
	  System.out.println("this is login by mail");
  }
  @Test(priority=2,groups= {"sanity"})
  public void loginbyfacebook()
  {
	  System.out.println("this is login by facebook");
  }
  @Test(priority=3,groups= {"regression"})
  public void loginbyinstagram()
  {
	  System.out.println("this is login by instagram");
  }  
  
}
