package bbb;

import aaa.AAA;

public class BBB extends AAA {
	int c;
	
	BBB() {
		//num1은 같은 패키지 내부에서만 호출 가능함 
		//num2는 상속 클래스 내부에서도 호출 가능하므로 오류가 발생하지 않는다. 
		c = num1+ num2;
		System.out.println(c);
	}
}
