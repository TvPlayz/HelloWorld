package day37_abstractionAndInterface;

import java.time.LocalTime;

public class Clock implements Alarm{

	public void showCurrentTime() {
		System.out.println(LocalTime.now());
	}
	
	public void setAlarm() {
		System.out.println("Set alarm to 3:50 pm");
	}
	
}
