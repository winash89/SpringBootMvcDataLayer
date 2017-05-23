 package tutorial;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;

public class CalculatorTest {
	
	@Mock
	private Calculator calc;
	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	 
	@Test
	public void testAbs()
	{	
		when(calc.abs(20)).thenReturn(4);
		assertEquals(4,calc.abs(20));
		
	}
}
