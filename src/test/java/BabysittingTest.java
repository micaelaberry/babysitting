import static org.junit.Assert.*;

import org.junit.Test;

public class BabysittingTest {

	@Test
	public void whenStartTimeIsBeforeFivePm(){
	BabySitting babysitting = new BabySitting();
	int startTime = 16;
	assertEquals(babysitting.isValidStartTime(startTime), false);
}
	
	@Test
	public void whenStartTimeIsAfterFivePm(){
	BabySitting babysitting = new BabySitting();
	int startTime = 18;
	assertEquals(babysitting.isValidStartTime(startTime), true);
	}
	
	@Test
	public void myBedTimeIsTenPm(){
	BabySitting babysitting = new BabySitting();
	int bedTime = 22;
	assertEquals(babysitting.getBedTime(), 22);
		
	}
}



