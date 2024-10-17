package com.pack2;

import com.pack1.App;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("usha","usha2024"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("lbrce","lbrce"));
	}

}

