
public class BabySitting {
//	starts no earlier than 5:00PM
//	leaves no later than 4:00AM
//	gets paid $12/hour from start-time to bedtime
//	gets paid $8/hour from bedtime to midnight
//	gets paid $16/hour from midnight to end of job
//	gets paid for full hours (no fractional hours)
	
	
	public boolean isValidStartTime(int time) {
		if (time >= 17 || time <= 4) {
			return true;
		}
		return false;

	}
}