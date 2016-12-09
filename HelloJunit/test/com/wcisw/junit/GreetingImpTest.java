package com.wcisw.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImpTest {

	@Test
	public void greetShouldReturnAValidOutput() {
		Greeting greeting =  new GreetingImp();
		String result = greeting.greet("junit");
		assertNotNull(result);
		assertEquals("hello junit", result);
	}

}
