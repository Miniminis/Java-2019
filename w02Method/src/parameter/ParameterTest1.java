package parameter;

public class ParameterTest1 {
//	//Test1
		public static void main(String[] args) {
			Data d = new Data();
			System.out.println(d.x); //초기화된 값 
			d.x = 10;
			System.out.println(d.x); // 호출 후 값 변경시 
			
			change(d.x);
			System.out.println(d.x); //매개변수 통해서 값 변경시
			
			
		}
		static void change(int x) {
			x = 1000;
			System.out.println(x); 
		}
		
		//Test2 
//	public static void main(String[] args) {
//		Data d = new Data();
//		System.out.println(d.x); //초기화된 값 
//		d.x = 10;
//		System.out.println(d.x); // 호출 후 값 변경시 
//		
//		change(d); //매개변수 통해서 값 변경시
//		System.out.println(d.x); // 현재 값
//		
//		
//	}
//	static void change(Data d) { //참조형 매개변수
//		d.x = 1000;
//		System.out.println(d.x); 
//	}
		
		//Test3
//		public static void main(String[] args) {
//			int[] x = {10};
//			System.out.println(x[0]);
//			
//			change(x);
//			System.out.println(x[0]);
//		
//		
//		}
//		static void change(int[] x) { //참조형 매개변수
//			x[0] = 1000;
//			System.out.println(x[0]); 
//		}

}

class Data {
	int x;
}