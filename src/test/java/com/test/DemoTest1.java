
//chari bhbhbhb hhjhj
package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test
	public void sum() {
	System.out.println("SUM");
	int a=10;
	int b=20;
	Assert.assertEquals(30,a+b);
	
	}
	@Test
	public void sub() {
	System.out.println("SUB");
	int a=10;
	int b=20;
	Assert.assertEquals(10,b-a);
	
	}
	@Test
	public void mul() {
	System.out.println("MUL");
	int a=10;
	int b=20;
	Assert.assertEquals(200, a*b);
	
	}
	@Test
	public void div() {
	System.out.println("DIV");
	int a=10;
	int b=20;
	Assert.assertEquals(2,b/a);
	
	}

	}
