package Testng;

import org.testng.annotations.Test;

public class InvoCount 
{
  @Test(invocationCount=10)
  public void f() 
  {
	  System.out.println("testing...");
  }
}
