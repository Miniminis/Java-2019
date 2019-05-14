package tv;

public class Tv {
	String color;
	boolean power;
	int channel = 10;
	
	void power() {
		power = !power;
	}
	void channelUp () {
		channel = channel + 1; 
	}
	void channelDown() {
		channel = channel - 1;
	}

}
