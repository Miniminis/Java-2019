package v04;

import util.Util;

public class MainPhoneBook {

	public static void main(String[] args) {
		Manager_v4 frenManager = new Manager_v4(1000);
		
		while(true) {
			int choice = frenManager.startMenu();
			
			switch(choice) {
			case Util.INSERT: 
				frenManager.inputInfo();
				break;
			case Util.SEARCH: 
				frenManager.searchInfo();
				break;
			case Util.DELETE: 
				frenManager.searchDelete();
				break;
			case Util.ALLINFO: 
				frenManager.showAllInfo();
				break;
			case Util.BASICINFO: 
				frenManager.showBasicInfo();
				break;
			case Util.END: 
				System.out.println("이용해주셔서 감사합니다. 프로그램이 종료됩니다. ");
				return;
			}
			
		}
	}

}
