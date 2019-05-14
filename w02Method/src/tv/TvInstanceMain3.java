package tv;

public class TvInstanceMain3 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = t1;
		
		t1.channel = 70;
		t2.channelDown();

				
		System.out.println(t1.channel);
		System.out.println(t2.channel);
	}

}
