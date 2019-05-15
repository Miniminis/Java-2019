package product;

public class MainProduct {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		buyer.Buy(computer);
		buyer.Buy(audio);
		buyer.Buy(tv);
		
		buyer.Summary();
	}
}
