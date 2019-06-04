package v08;

import util.Util;

public class MainPhoneBook_v8 {

	public static void main(String[] args) {
		Manager_v8 frenManager = Manager_v8.getInstance();
		
		while(true) {
			int choice = frenManager.startMenu();
			
			switch(choice) {
			case Util.INSERT: 
				System.out.println("신규 정보를 등록합니다. ");
				frenManager.deptInput();
				System.out.println("정보가 성공적으로 저장되었습니다. ");
				break;
			case Util.SEARCH: 
				System.out.println("기존정보를 검색합니다. ");
				System.out.println("검색하고 싶은 사람의 이름을 입력해주세요. ");
				frenManager.searchInfo();
				break;
			case Util.DELETE:
				System.out.println("기존정보를 삭제합니다. ");
				System.out.println("삭제하고 싶은 사람의 이름을 입력해주세요. ");
				frenManager.searchDelete();
				System.out.println("정보가 성공적으로 삭제되었습니다.");
				break;
			case Util.EDITINFO:
				System.out.println("기존정보를 수정합니다. ");
				System.out.println("수정하고자 하는 사람의 이름을 입력해주세요. ");
				frenManager.editInfo();
				System.out.println("정보가 성공적으로 수정되었습니다. ");
				break;
			case Util.ALLINFO: 
				frenManager.showAllInfo();
				break;
			case Util.BASICINFO: 
				frenManager.showBasicInfo();
				break;
			case Util.SAVEINFO:
				frenManager.saveInfo();
				break;
			case Util.END: 
				System.out.println("이용해주셔서 감사합니다. 프로그램이 종료됩니다. ");
				return;
			}
			
		}
	}

}
/*
 * 기본구조분석 
 * 1. 메인클래스 - Manager 인스턴스 생성 -> 호출하여 그 안의 기능들을 사용할 수 있도록!
 * 
 * 2. interface : 기본 구조 설정 - 필수 메서드 정의
 * 
 * 3. PhoneInfor (추상클래스) - 기본데이터: 이름, 전화번호 변수설정 
 * 
 * 4. PhoneUnivInfor - phoneInfor 상속: 이름, 전화번호 + 주소, 이메일, 전공, 학년 추가로 받기
 * 
 * 5. PhoneCompanyInfor - phoneInfor 상속: 이름, 전화번호 + 이메일, 회사
 * 
 * 6. PhonefamilyInfor - phoneinfor 상속: 이름, 전화번호 + 생일 
 * 
 * 7. Manager class 기능 구현 
 * - 0) 초기 메뉴 입력 기능 
 * - 1) 정보 저장 기능: 소속에 따라서 다른 클래스에 저장하기 
 * - 2) 정보 검색 기능 
 * - 3) 정보 검색+출력 기능 
 * 3-1) 정보 수정 기능
 * - 4) 정보 검색+삭제 기능  
 * - 5) 전체 정보 조회 기능
 * - 6) 기본 정보 조회 기능
 */