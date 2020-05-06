package framework.junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	

	@Test //Invoke method to run without object creation..
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test //Invoke method to run without object creation..
	public void test2() 
	{
		System.out.println("test2 executed");
	}

	
	@Test //Invoke method to run without object creation..
	public void test3() 
	{
		System.out.println("test3 executed");
		
	}
	
	
	
	
	@BeforeClass  //This annotation invoke before execution of first @Test annotation..
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class preconditon");
	}

	@AfterClass  //This annotation invoke after execution of last @Test annotation.
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class post condition");
	}

}
