package police;

public class MainSpeaker {

	public static void main(String[] args) {
		//상위클래스 인스턴스 참조 
		base bs1 = new base();
		//하위 클래스 인스턴스 참조 
		base bs2 = new baseAndspeaker();
		
		bs1.showCurrentState();
		bs2.showCurrentState();
	}

}

class base {
	int base = 1;
	public void showCurrentState() {
		System.out.println(base);
	}
}

class baseAndspeaker extends base {
	int speaker = 10;
	public void showCurrentState() {
		super.showCurrentState();
		System.out.println(speaker);
	}
}
