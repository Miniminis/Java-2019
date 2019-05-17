package util;

import java.util.Scanner;

public interface Util {
	  
	Scanner keyboard = new Scanner(System.in);
	
	////public static final 생략 
	//Choice interface에서 소속에 대한 상수설정 
	int INSERT = 1, SEARCH = 2, DELETE = 3, ALLINFO = 4, BASICINFO = 5, END = 6;
	
	//Choice interface에서 소속에 대한 상수설정 
	int FMILY=1, UNIVERSITY=2, COMPANY=3;
}

//인터페이스로 설정하여 클래스 내부에서 구현 가능 
//- 상수를 표현할 때, 설정 단계를 줄여주기 위해서