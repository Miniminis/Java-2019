package appleReview;

public class AppleSeller {
	int applenum;
	int myMoney;
	final int APPLE_PRICE;
	
	AppleSeller(int applenum, int money, int price) {
		this.applenum = applenum;
		myMoney = money;
		APPLE_PRICE = price;
	}
	
	public int sellApple(int money) {
		int num = money/APPLE_PRICE;
		applenum = applenum - num;
		myMoney = myMoney + money;
		return num;
	}
	
	public void getSellerAppleNum() {
		System.out.println(applenum); 
	}
}
