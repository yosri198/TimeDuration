package test.timeduration;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import test.timeduration.TimeDuration;;

public class TestDuration extends TimeDurationTest {
	

	@Before
	public void initialiseDuartion() throws Exception {
		new TimeDuration(duration);
		
	}
	
	
	
	@Test
		public void whenTimeDurationExecute() throws Exception {
			assertEquals("2h 0m 42s", new TimeDuration(7242).toString());
			
		}
	
}

