package com.home.mocktest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class ToRunTest {
	@Test
	public void testGetNo() {
		ToRun mock = Mockito.mock(ToRun.class);
		Mockito.when(mock.getParameter1()).thenReturn(6);
		Mockito.when(mock.getNo()).thenCallRealMethod();
		int result = mock.getNo();
		assertEquals("not equal", 11, result);
	}

	
}
