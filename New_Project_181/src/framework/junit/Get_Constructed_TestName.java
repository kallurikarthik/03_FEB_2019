package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Get_Constructed_TestName {

	public @Rule TestName test=new TestName();
	//This annoation access constructed test names..
	
	
	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Constructed test name => "+test.getMethodName());
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("Constructed test name => "+test.getMethodName()+"\n");
	}

	@Test
	public void User_login() 
	{
		System.out.println("login executed");
	}
	
	
	@Test
	public void User_Reg() 
	{
		System.out.println("reg executed");
	}


}
