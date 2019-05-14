package data;

public class ClassMethod {

	public static void main(String[] args) {
		Number.num1(1123); // class를 통한 호출 
		Number number = new Number();
		number.num2(456); //인스턴스 이름을 통한 호출 
	}

}

class Number {
	public static void num1(int x) {
		System.out.println(x/1123);
	}
	public static void num2(int x) {
		System.out.println(x*100);
	}
}