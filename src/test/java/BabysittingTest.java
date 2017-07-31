import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BabysittingTest {

	BabySitting babysitting;

	@Before
	public void setUp() {
		babysitting = new BabySitting();
	}

	@Test
	public void whenStartTimeIsBeforeFivePm() {
		int startTime = 16;
		assertEquals(false, babysitting.isValidStartTime(startTime));
	}

	@Test
	public void whenStartTimeIsAfterFivePm() {
		int startTime = 18;
		assertEquals(true, babysitting.isValidStartTime(startTime));
	}

	@Test
	public void myBedTimeIsTenPm() {
		assertEquals(22, babysitting.getBedTime());

	}

	@Test
	public void startTimeToBedTimeTheyArePaidTwelveAnHour() {
		assertEquals(12, babysitting.getPayment(17, 22));

	}

	
	@Test
	public void fromBedtimeToMidnightTheyArePaidEightAnHour() {
		assertEquals(8, babysitting.getPayment(22, 24));
	}
	
	@Test
	public void fromMidnightToEndTimeTheyArePaidSixteenAnHour() {
		assertEquals(16, babysitting.getPayment(0, 4));
	}
}