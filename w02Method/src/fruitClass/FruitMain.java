package fruitClass;

public class FruitMain {

	public static void main(String[] args) {
		//사과장수 1, 2 등록 = 인스턴스생성
		FruitSeller seller1 = new FruitSeller(0, 20, 2000);
		FruitSeller seller2 = new FruitSeller(0, 50, 1000);
		//사과 구매자 등록방법 1 = 초기값 입력받는 인스턴스 생성
		FruitBuyer buyer1 = new FruitBuyer(10000);
		
		//사과 구매자 등록방법 2 = default 값 정해진 인스턴스 생성
		FruitBuyer buyer2 = new FruitBuyer();
		buyer1.buyApple(seller2, 3000);		
		buyer2.buyApple(seller1, 10000);
		
		System.out.println("과일판매자1의 현재상황");
		seller1.showSaleResult();
		System.out.println("과일판매자2의 현재상황");
		seller2.showSaleResult();
		System.out.println("과일구입자1의 현재상황");
		buyer1.showBuyResult();
		System.out.println("과일구입자2의 현재상황");
		buyer2.showBuyResult();
	}

}
// 기존코드
//package fruitClass;
//
//public class FruitMain {
//
//	public static void main(String[] args) {
//		FruitSeller seller = new FruitSeller();
//		FruitBuyer buyer = new FruitBuyer();
//		buyer.buyApple(seller, 3000);
//		
//		System.out.println("과일판매자의 현재상황");
//		seller.showSaleResult();
//		System.out.println("과일구입자의 현재상황");
//		buyer.showBuyResult();
//	}
//
//}