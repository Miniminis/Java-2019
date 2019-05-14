package appleReview;

public class AppleBuyer {
	int applenum;
	int myMoney;
	
	AppleBuyer() {
		applenum = 100;
		myMoney = 56000;
	}
	
	AppleBuyer(int money) {
		applenum = 0;
		myMoney = money;
	}
	
	public void buyApple(AppleSeller seller, int money) {
		applenum = applenum + seller.sellApple(money);
		myMoney = myMoney - money;
	}
	
	public void getBuyerAppleNum() {
		System.out.println(applenum);
	}

}
