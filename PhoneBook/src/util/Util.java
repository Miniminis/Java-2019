package util;

import java.util.Scanner;

public interface Util {
	  
	Scanner keyboard = new Scanner(System.in);
	
	////public static final 생략 
	//Util interface에서 소속에 대한 상수설정 
	int INSERT = 1, SEARCH = 2, DELETE = 3, EDITINFO = 4, ALLINFO=5, BASICINFO = 6, SAVEINFO=7, END = 8;
	
	//Util interface에서 소속에 대한 상수설정 
	int FMILY=1, UNIVERSITY=2, COMPANY=3;
	
	//Util interface에서 수정에 대한 메뉴입력을 위한 상수설정 
	int KEEPEDIT=1, GOMENU=2, ENDPROGRAM=3;
}

//인터페이스로 설정하여 클래스 내부에서 구현 가능 
//- 상수를 표현할 때, 설정 단계를 줄여주기 위해서