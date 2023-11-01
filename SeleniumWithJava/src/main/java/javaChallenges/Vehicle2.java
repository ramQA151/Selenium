package javaChallenges;

public class Vehicle2 {

	int maxspeed=200;
	
	public static void drive() {
		System.out.println("Driving vehicle");
		
	}
	public void Race() {
		System.out.println("Driving at speed" + maxspeed);
	}
}

class car2 extends Vehicle2{
	int maxspeed=180;
	
	public static void drive() {
		System.out.println("Driving car");
	}
	
	public void race() {
		System.out.println("Driving at speed" + maxspeed);

		
	}
}
