package test3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test5 {
  @BeforeMethod
  public void a() 
  {
	  System.out.println(" BeforeMethod");
  }
  @Test(priority=1)
  void g()
  {
	  System.out.println(" Test1");
  }
  @Test(priority=2)
  void h()
  {
	  System.out.println(" Test2");
  }
  @AfterMethod
  public void b()
  {
	  System.out.println("AfterMethod");
  }
  @BeforeClass
  public void c() 
  {
	  System.out.println("Beforeclass");
  }
  @AfterClass
  public void d()
  {
	  System.out.println("afterclass");
  }
  @BeforeSuite
  public void e()
  {
	  System.out.println("beforesuite");
  }
  @AfterSuite
  public void f()
  {
	  System.out.println("aftersuite");
  }
}
