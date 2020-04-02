package com.app.AutoTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	@Parameters({"string"})	
	public void f(String string) {
		System.out.println(string);
	}
}
