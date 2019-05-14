package triangle;

public class InstanceMain {

	public static void main(String[] args) {
//		Triangle tr = new Triangle();
		// 수정코드 
		Triangle tr = new Triangle(5,10);
		
		System.out.println("이 삼각형의 밑변은 "+tr.length+ "m 입니다.");
		System.out.println("이 삼각형의 높이는 "+ tr.height+"m 입니다.");
		
		changeMethod(tr);
		System.out.println("이 삼각형의 바뀐 밑변은 "+tr.length+ "m 입니다.");
		System.out.println("이 삼각형의 바뀐 높이는 "+ tr.height+"m 입니다.");
		
		tr.findArea();
		System.out.println("이 삼각형의 넓이는 "+tr.findArea()+"m^2입니다.");
	}
	static void changeMethod(Triangle tr2) {
		tr2.changeInfo(4, 5);
	}

}
