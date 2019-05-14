package cardtest;

public class CardTest {

	public static void main(String[] args) {
		System.out.println(Card.height);
		System.out.println(Card.width);
		
		Card c1 = new Card();
		Card c2 = new Card();
		c1.kind = "heart";
		c1.number = 10;
		
		c2.kind = "clover";
		c2.number = 8;
		
		System.out.println(c1.kind);
		System.out.println(c1.number);
		System.out.println(c2.kind);
		System.out.println(c2.number);
		
		//change of card size
		Card.width = 100;
		Card.height = 200;
		c1.width = 50;
		c2.height = 40;
		System.out.println(Card.width);
		System.out.println(Card.height);
		System.out.println(c1.width);
		System.out.println(c1.height);
	}

}
