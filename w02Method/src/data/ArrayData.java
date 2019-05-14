package data;

public class ArrayData {
	public static void main(String[] args) {
		int[] x = {10};
		x[0] = 1000;
		System.out.println(x[0]); //초기 값 지정에 의한 결과 
		
		change(x); //change 매서드에서 참조형 변수를 이용해 값을 변경한 결과 
		System.out.println(x[0]); //참조형 매개변수로 인해서 변수의 데이터가 변경되었다.
		
	}
	
	static void change(int[] t) {
		t[0] = 254;
		System.out.println(t[0]);
	}
}
