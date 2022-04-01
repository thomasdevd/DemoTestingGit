
public class CustomTime {
	//Encapsulation
	final int MAX_HOURS = 23;
	final int MAX_MIN_SECS = 59;

	private int hour;    // current hour in time
	private int minute;  // current minute in time
	private int second;  // current second in time

	// set the time to the time specified by the parameters
	void setTime (int newHour, int newMinute, int newSecond) {
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}

	// return the time to the calling method in a three-membered array
	int[] getTime() {
		return new int[] {hour, minute, second};
	}

	// increment the current time by one second
	void incrementTime () {
        second = ++second % (MAX_MIN_SECS + 1);
        if(second == 0) {
            minute = ++minute % (MAX_MIN_SECS + 1);
        }
        if(minute == 0) {
            hour = ++hour % (MAX_HOURS + 1);
        }
}

	
	
	
	public static void main(String[] args) {
		CustomTime currTime = new CustomTime();  // object that stores the current time
		int hr;         // current hour obtained from currTime
		int min;        // current minute obtained from currTime
		int sec;        // current second obtained from currTime
		
		int[] temp;		// for using getTime()

     // setTime (int newHour, int newMinute, int newSecond) 
		currTime.setTime(23, 59, 59);
    
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"The current time is set to: "
						+ hr + ":" + min + ":" + sec
				);

		
		currTime.incrementTime();
		temp = currTime.getTime();
		hr = temp[0];
		min = temp[1];
		sec = temp[2];
		
		System.out.println(
				"After incrementing the time, the current time is: "
						+ hr + ":" + min + ":" + sec
				);
		
	}
		
	

}
