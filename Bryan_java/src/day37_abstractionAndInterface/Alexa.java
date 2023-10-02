package day37_abstractionAndInterface;

import java.time.LocalTime;

public class Alexa {

	public void alexaWhaTimeIsit() {
		System.out.println("Its "+ LocalTime.now());
	}
	
	public void alexaCloseMyGarageDoor() {
		System.out.println("Garage door is closing");
	}
	
}
