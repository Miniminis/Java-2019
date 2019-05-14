package appleReview;

public class InstanceMain {
	public static void main(String[] agrs) {
		AppleSeller seller1 = new AppleSeller(500, 0, 5000);
		AppleSeller seller2 = new AppleSeller(300, 0, 8000);
		AppleBuyer buyer1 = new AppleBuyer();
		AppleBuyer buyer2 = new AppleBuyer(3000000);
		
		buyer1.buyApple(seller1, 10000);
		buyer2.buyApple(seller2, 800000);
		
		buyer1.getBuyerAppleNum();
		buyer2.getBuyerAppleNum();
		seller1.getSellerAppleNum();
		seller2.getSellerAppleNum();
	}

}
