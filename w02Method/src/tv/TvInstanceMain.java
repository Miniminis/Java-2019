package tv;

public class TvInstanceMain {

	public static void main(String[] args) {
		Tv t = null;
		t = new Tv();
		
		t.power();
		t.channel = 10;
		t.channelUp();
		
		System.out.println("현재 채널은 "+t.channel);
		System.out.println("현재 tv의 전원은 "+t.power);
		

	}

}
