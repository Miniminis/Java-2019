package stringtest;

public class MainCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); //초기화 값만 같음 
		
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		System.out.println("------------------------------------------");
		c1.door = 40; // 그 이후에 변경해준 값은 c2에 적용되지 않는다. 
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);	
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		}

}
