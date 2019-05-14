package triangle;

public class TriangleReferenceInstanceMain {

	public static void main(String[] args) {
		TriangleReference triangle; //참조변수 선언
		triangle = new TriangleReference(); //객체 생성
		
		//데이터 설정//
		triangle.setData(7, 5);
		System.out.println(triangle.width);
		System.out.println(triangle.height);

		System.out.println(triangle.calArea());
		
	}

}
