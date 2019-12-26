package com.example.demo;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;

public class TestData extends DemoTestingApplicationTests {
	
	@Autowired
	IDemo demoData;
	
	@Mock
	IDemo demoSer;
	
	@Test
	public void testData() {
		
		Mockito.when(demoSer.addDemo()).thenReturn("Hello World");
		
		assertEquals(demoSer.addDemo() ,demoData.addDemo() );
		
	}

}
