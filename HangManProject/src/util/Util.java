package util;

import java.util.Scanner;

public interface Util { //모든 클래스에서 사용할 수 있도록 인터페이스 형으로 처리 
	
	Scanner scanner = new Scanner(System.in);
	
	//게임 난이도 선택지 
	int EASY = 1, INTERMEDIATE=2, ADVANCED=3;
	
	//게임 이후 메뉴 선택지 
	int SAVE=1, KEEPGAME=2, CHECKLANK=3, GOTOMAIN=4, ENDGAME=5;

}
