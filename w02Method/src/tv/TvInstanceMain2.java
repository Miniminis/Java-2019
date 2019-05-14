package tv;

public class TvInstanceMain2 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t1.channelUp();
		t2.channelDown();
		
		t1.channel = 5;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}

}
