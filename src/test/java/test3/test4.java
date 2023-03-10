package test3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {
  @Test
  public void abc() 
  {
//	  int a=10;
//	  int b=20;
////	  if(a==b)
////		  System.out.println("passed");
////	  else
////		  System.out.println("failed");
////	  Assert.assertEquals(a, b);//fail
////	  Assert.assertFalse(false);//fail
//	  
//	  Assert.assertEquals(a>b, true,"a is not greater than b");
	  String s1="abc1";
	  String s2="abc1";
//	  Assert.assertEquals(s1, s2);
	  //Assert.assertNotEquals(s1, s2);//fail
	  if(false)
	  {
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  //Assert.asserTrue(false);
		  Assert.fail();
	  }
  }
}

