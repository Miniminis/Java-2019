package classtest;

public class Number {
	
	//인스턴스 변수 선언 영역 
	
	int num; //int num = 0; 인스턴스 변수는 자동 초기화 : 해당 데이터 타입의 기본값
	// 값을 전달받아 인스턴스 변수 num에 값을 더한다. 
	void addNum(int n){
		num = num+n;
	}
	int getNumber() {
		return num;
	}
}
