package test3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void openapp() 
  {
	  Assert.assertTrue(true);
  }
  @Test(priority =2,dependsOnMethods= {"openapp"})
  void login() 
  {
	  Assert.assertTrue(true);
  }
  @Test(priority =3,dependsOnMethods= {"login"})
  void search() 
  {
	  Assert.assertFalse(false);
  }
  @Test(priority =4,dependsOnMethods= {"login","search"})
  void advsearch() 
  {
	  Assert.assertTrue(true);
  }
  @Test(priority =4,dependsOnMethods= {"login"})
  void logout() 
  {
	  Assert.assertTrue(true);
  }
}
