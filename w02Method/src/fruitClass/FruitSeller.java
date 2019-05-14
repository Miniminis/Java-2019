package fruitClass;

public class FruitSeller {
	// 기존 초기화 값이 정해진 코드
//	final int APPLE_PRICE = 1000;
//	int numOfApple = 30;
//	int myMoney = 0;
	
	// 개선된 사과장수 코드: 초기화 값 입력 받을 수 있음.
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	// 생성자생성
	FruitSeller (int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	
	public int soldApple(int buyerMoney) {
		int numOfSoldApple = buyerMoney/APPLE_PRICE;
		numOfApple = numOfApple - numOfSoldApple;
		myMoney = buyerMoney;
		return numOfSoldApple;
	}
	public void showSaleResult() {
		System.out.println("오늘의 판매 수익은: "+numOfApple);
		System.out.println("남은 사과의 개수는: "+myMoney);
	}
	

}
