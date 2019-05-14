package data;

public class Data {

	public static void main(String[] args) {
		intData d = new intData();
		d.x = 140;
		System.out.println(d.x); //초기 지정에 의한 결과 
		
		change(d.x); //change 기본형 매개변수에 의한 변화 
		System.out.println(d.x); // 초기 지정값은 변화 없음. 기본형 매개변수로 접속했기 때문에 
		
	}
	static void change(int x) {
		x = 500;
		System.out.println(x);
	}

}

class intData {
	int x = 13;
}