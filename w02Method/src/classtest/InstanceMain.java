package classtest;

public class InstanceMain {

	public static void main(String[] args) {
		// 참조변수 선언, 초기화 null
		Number ninst = null;
		//인스턴스 선언, 참조변수에 참조값 대입 
		ninst = new Number(); // 변수 생성, 매서드의 코드가 메모리에 로드 된다. 
		
		System.out.println("인스턴스의 매서드 호출전 : num의 값-->"+ninst.num);
		System.out.println("인스턴스의 매서드 호출전 : num의 값-->"+ninst.getNumber());
		
		simpleMethod(ninst);
		System.out.println("인스턴스의 addNum매서드 호출후 : num의 값-->"+ninst.getNumber());
		}
	//참조변수를 전달받아 인스턴스의 매서드를 호출해서 값을 증가시킨다. 
	static void simpleMethod(Number number) {
		number.addNum(7);
	}
}
