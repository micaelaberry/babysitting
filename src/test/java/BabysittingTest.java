import static org.junit.Assert.*;

import org.junit.Test;

public class BabysittingTest {

	@Test
	public void whenStartTimeIsAfterFivePm(){
	BabySitting babysitting = new BabySitting();
	int startTime = 16;
	assertEquals(babysitting.isValidStartTime(startTime), false);
}
	
	
	
}



