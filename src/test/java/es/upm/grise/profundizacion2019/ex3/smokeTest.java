package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;


public class smokeTest {
	MyClass my;
	Time myT;
	
	
	@Before
	public void setUp() {
		my = new MyClass();
		myT = new Time(LocalDateTime.of(2020, 01, 01, 00, 00));
		//my.time = mock(Time.class);
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
	
	@Test
	public void smokeTestMockito() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
		//verify(my.time, atMost(1)).getFutureTime(SECONDS);
	}
	
	@Test
	public void smokeTestTime() {
		long SECONDS = 120;
		assertEquals("2020/01/01 00:02:00", myT.getFutureTime(SECONDS));
	}
}
