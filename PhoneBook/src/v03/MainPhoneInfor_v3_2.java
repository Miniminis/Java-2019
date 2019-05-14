package v03;

import util.Util;

public class MainPhoneInfor_v3_2 {
	
	public static void main(String[] args) {
		
		Manager2 manager2 = new Manager2(500);
	
		
		while(true) {
			int choice = manager2.startMenu();
			
			switch (choice) {
			case Util.INSERT: 
				//1) 신규정보등록
				manager2.inputInfo();
				break;
			case Util.SEARCH:
				//2) 기존정보검색
				manager2.searchInfo();
				break;
			case Util.DELETE:
				//3) 기존정보삭제 
				manager2.searchDelete();
				break;
			case Util.ALLINFO:
				//4) 전체정보보기
				manager2.AllInfo();
				break;
			case Util.END:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
	}
}
