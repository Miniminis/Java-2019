package test01;

public class instanceMain {

	public static void main(String[] args) {
		Number ninst = new Number ();
		// Number ninst = null;
		// ninst = new Number();
		
		System.out.println("매소드 호출 전의 num의 값 -->"+ ninst.getNumber());
		simpleMethod(ninst);
		System.out.println("매소드 호출 후의 num의 값 -->"+ ninst.getNumber());
		
			

	}
	public static void simpleMethod(Number number) {
		number.addNumber(50);
	}

}
