package data;

public class Data2 {
	public static void main(String[] args) {
		intData d = new intData();
		
		d.x = 10;
		System.out.println(d.x); //초기 변수값 변경에 의한 결과 
		
		change(d); //change 매서드의 참조형 매개변수에 의한 값 변경 결과 
		System.out.println(d.x); //참조형 매개변수로 인해 본래의 값 역시 변경되었다. 
		
	}
	
	static void change(intData y) {
		y.x = 60000;
		System.out.println(y.x);
	}

}

