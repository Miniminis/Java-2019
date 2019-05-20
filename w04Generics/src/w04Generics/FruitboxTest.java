package w04Generics;

public class FruitboxTest{

	public static void main(String[] args) {
		//FruitBox<Apple> fb1 = new FruitBox<Apple>();
		FruitBox<Apple> fb1 = new FruitBox<Apple>(new Apple(100));
		Apple apple = fb1.pullOut();
		apple.showAppleWeight();
		
		//FruitBox<Orange> fb2 = new FruitBox<Orange>();
		FruitBox<Orange> fb2 = new FruitBox<Orange>(new Orange(500)); 
		Orange orange = fb2.pullOut();
		orange.showSugarContents();
		
		//String 형을 넣을 시 오류가 발생한다. 
		//fb2.store("orange");
		
	}
	public static class Orange {
		int sugarContent;
		public Orange(int sugar) {
			sugarContent = sugar;
		}
		
		public void showSugarContents () {
			System.out.println("당도: "+ sugarContent);
		}
	}
	
	public static  class Apple {
		int weight; 
		public Apple(int weight) {
			this.weight = weight; 
		}
		
		public void showAppleWeight() {
			System.out.println("사과: "+weight); 
		}
	}
	
	public static class FruitBox<T> {
		T item; 

		//생성자 추가
		public FruitBox(T item) {
			this.item = item;
		}
		//저장용 메서드 
		public void store(T item) {
			this.item=item;
		}
		//상자에서 꺼내기 메서드 
		public T pullOut() {
			return item;
		}
		
	}
}

