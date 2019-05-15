package product;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;  //단위: 만원
		bonusPoint = (int)(price/10.0f);
	}

}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	@Override
	//annotation: 컴파일 과정에서 읽히며, 해당 매소드를 구성하는데 있어서 추가적인 의미를 부여함. 
	//overriding 규칙에 따라 구성이 되었는지 문법체크해줌. 
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	@Override
	public String toString() {
		return "Audio";
	}	
}

class Buyer {
	int money=1000;
	int bonusPoint = 0;
	
	//제품을 담을 배열을 생성 
	Product[] cart = new Product[10];
	int cartCount=0;
	
	void Buy(Product p) { //tv, computer, audio all possible 
		
		if(!(money<p.price)) {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p+"을/를 구매하셨습니다."); //문자열+모든타입 = 문자열 타입 p.toString() 생략.
			
			//구입한 상품을 카트에 담는다. 
			cart[cartCount++] = p;
			
			//cartCount++;
			
		} else {
			System.out.println("금액이 부족합니다. ");
		}
	
		/*
		 * if(money<p.price) { System.out.println("금액이 부족합니다. "); return; }
		 * 
		 * money -= p.price; bonusPoint += p.bonusPoint;
		 * System.out.println(p+"을/를 구매하셨습니다."); //문자열+모든타입 = 문자열 타입 p.toString() 생략.
		 */
	}
	
	void Summary() {
		
		int sum = 0; //총액 
		String itemList = "";
		for(int i=0; i<cartCount;i++) {
			sum += cart[i].price;
			itemList += cart[i]+", " ;
		}
		System.out.println("구입하신 제품들의 총 금액은 "+sum+" 만원 입니다. ");
		System.out.println("구입하신 제품들의 목록은 "+itemList+" 입니다.");
	}
}
