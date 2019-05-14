package Car;

public class CarMain {

	public static void main(String[] args) {
		
		HybridWaterCar car = new HybridWaterCar(10, 100, 1000);
		
	}

}

class Car {
	int gasolin;
	
	Car (int g) {
		this.gasolin = g;
	}
}
class HybridCar extends Car {
	//int gasolin;
	int electronic;
	
	HybridCar(int g, int e) {
		super(g);
		this.electronic=e;
	}
}
class HybridWaterCar extends HybridCar {
	int water;
	//int gasolin;
	//int electronic;
	
	HybridWaterCar(int g, int e, int w) {
		super(g, e); 
		this.water=w;
	}
	
	void showCurrentData() {
		System.out.println("잔여 가솔린: "+gasolin);
		System.out.println("잔여 전기: "+electronic);
		System.out.println("잔여 물: "+water);
	}
}
