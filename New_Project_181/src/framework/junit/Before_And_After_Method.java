package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After_Method {


	@Test
	public void method1()
	{
		System.out.println("method1 executed");
	}
	
	
	@Test
	public void method2()
	{
		System.out.println("method2 executed");
	}
	
	
	@Test
	public void method3()
	{
		System.out.println("method3 executed");
	}
	
	@Test
	public void method4()
	{
		System.out.println("method4 executed");
	}
	
	
	
	
	@Before   //This annotation invoke every @Test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("Method-preCondition");
	}

	@After   //This annoation invoke after every @Test annotation
	public void tearDown() throws Exception 
	{
		System.out.println("Method-PostCondition"+"\n");
		
	}

}
