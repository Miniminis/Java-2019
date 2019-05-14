package fruitClass;

public class FruitBuyer {
	// 기존코드: 초기화 값을 정해줌.
//	int numOfApple = 0;
//	int myMoney = 10000;
	
	// 개선된 코드: 초기화 값을 입력받음 
	private int numOfApple;
	private int myMoney;
	//생성자(사용자 보유금액)
	FruitBuyer(int money) {
		myMoney = money;
		numOfApple = 0; //최초의 사과 개수는 0으로 한다. 
	}
	// 기본형 defalut
	FruitBuyer() {
//		numOfApple = 50;
//		myMoney = 14000;
		this(5000); // this 이용해서 생성자 간에 
	}
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple = seller.soldApple(money);
		myMoney = myMoney - money;
	}
	public void showBuyResult () {
		System.out.println("구입 사과의 개수는: "+numOfApple);
		System.out.println("남은 돈의 액수는: "+myMoney);
	}

}
