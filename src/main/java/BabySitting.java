
public class BabySitting {
	// starts no earlier than 5:00PM
	// leaves no later than 4:00AM
	// gets paid $12/hour from start-time to bedtime
	// gets paid $8/hour from bedtime to midnight
	// gets paid $16/hour from midnight to end of job
	// gets paid for full hours (no fractional hours)
	// using military time for simplicity 

	private int startTime = 17;
	private int bedTime = 22;

	public int getBedTime() {
		return bedTime;
	}

	public boolean isValidStartTime(int currentTime) {
		if (currentTime >= 17 && currentTime <= 24 || currentTime >= 0 && currentTime <= 4) {
			return true;
		}
		return false;

	}

	public int getPayment(int startTime, int endTime) {
		int totalPayment = 0;
		int hourlyPayment = 0;

		for (int currentTime = startTime; currentTime < endTime ||
                (endTime > 0 && endTime <= 4 && (currentTime - 24) < endTime); currentTime++) {

			if (currentTime < bedTime) {
				hourlyPayment = 12;
			
			} else if (currentTime >= bedTime && currentTime < 24) {
				hourlyPayment = 8;
			
			} else {
				hourlyPayment = 16;
			}
		}
		totalPayment += hourlyPayment;
		return totalPayment;
	}

}
