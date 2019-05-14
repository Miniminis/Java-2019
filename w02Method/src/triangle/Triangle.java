package triangle;

public class Triangle {
//	int length = 10;
//	int height = 15;
	//수정코드 
	int length;
	int height;
	
	//매개변수를 받는 생성자 추가
	Triangle(int length, int height) {
		this.length = length;
		this.height = height;
	}
	
	void changeInfo(int a, int b) {
		length = a;
		height = b;
	}
	
	float findArea() {
		float result; 
		result = ((float)length*height)/2;
		return result;
	}
}
