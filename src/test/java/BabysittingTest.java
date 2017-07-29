import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabysittingTest {
	
	BabySitting babysitting;
	
	@Before
	public void setUp(){
		babysitting = new BabySitting();
	}
	

	@Test
	public void whenStartTimeIsBeforeFivePm(){
	int startTime = 16;
	assertEquals(babysitting.isValidStartTime(startTime), false);
}
	
	@Test
	public void whenStartTimeIsAfterFivePm(){
	int startTime = 18;
	assertEquals(babysitting.isValidStartTime(startTime), true);
	}
	
	@Test
	public void myBedTimeIsTenPm(){
	assertEquals(babysitting.getBedTime(), 22);
		
	}
	
	@Test
	public void startTimeToBedTimeTheyArePaidTwelveAnHour(){
	/*int payment = 12;*/
	assertEquals(babysitting.getPayment(17, 22), 12);
		
	}
	
}



