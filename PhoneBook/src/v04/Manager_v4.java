package v04;

import util.Util;

public class Manager_v4 {
	public static PhoneInfor_v4 [] pb;
	
	Manager_v4 () {
		pb = new PhoneInfor_v4[100];
	}
	Manager_v4 (int size){
		pb= new PhoneInfor_v4[size];
	}
	
	public static int numOfFriends = 0;
	
	//0) 프로그램 메인: 시작페이지 
	public static int startMenu() {
		System.out.println("**********************************");
		System.out.println("프로그램을 시작합니다. ");
		System.out.println("메뉴를 선택해주세요 ");
		System.out.printf("%d 신규정보등록 \n%d 기존정보검색 \n%d 기존정보삭제 \n%d 전체정보보기 \n%d 기본정보보기 \n%d 나가기\n", Util.INSERT, Util.SEARCH, Util.DELETE, Util.ALLINFO, Util.BASICINFO, Util.END);
		System.out.println("**********************************");
		
		int choice = Util.keyboard.nextInt();
		Util.keyboard.nextLine(); //개행
		return choice;
	}
	
	//1-0)배열에 정보저장용 매서드 
	void storeInfo(PhoneInfor_v4 ph) {
		pb[numOfFriends++] = ph;
		System.out.println("정보가 성공적으로 저장되었습니다. ");
	}
	
	//1) 신규정보등록
	void inputInfo() {
		System.out.println("신규정보를 등록합니다.");
				
		System.out.println("등록하고자하는 사람의 이름을 입력해주세요.");
		String name = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 전화번호를 입력해주세요.");
		String phoneNumber = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 주소를 입력해주세요.");
		String address = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 이메일을 입력해주세요.");
		String email = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 소속을 입력해주세요. ");
		System.out.println("1) 가족 \n2) 대학교 \n3) 회사");
		int deptChoice = Util.keyboard.nextInt();
		Util.keyboard.nextLine(); //개행
		
		switch(deptChoice) {
		case 1: //가족 
			System.out.println("등록하고자하는 사람의 생일을 입력해주세요. ");
			String bday = Util.keyboard.nextLine();
			
			storeInfo(new PhoneFamilyInfor(name, phoneNumber, address, email, bday));
			return;
		case 2: //대학교 
			System.out.println("등록하고자하는 사람의 전공을 입력해주세요. ");
			String major = Util.keyboard.nextLine();
			
			System.out.println("등록하고자하는 사람의 학년을 입력해주세요. ");
			String year = Util.keyboard.nextLine();
			
			storeInfo(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));
			return;
		case 3: //회사 
			System.out.println("등록하고자하는 사람의 회사를 입력해주세요. ");
			String company = Util.keyboard.nextLine();
			
			storeInfo(new PhoneCompanyInfor(name, phoneNumber, address, email, company));
			return;
		default: //예외 
			System.out.println("올바른 소속 번호를 입력해주세요. ");
			return;
		}
	}
	//2-0) 정보 검색용 메서드
	int enterInfo() {
		System.out.println("검색하고 싶은 사람의 이름을 입력해주세요. ");
		String name = Util.keyboard.nextLine();
		
		int index = -1;
		
		for(int i=0; i<numOfFriends; i++) {
			if(pb[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	//2) 기존정보검색 
	void searchInfo() { 
		System.out.println("기존정보를 검색합니다. ");
		
		int index = enterInfo(); 
				
		if(index<0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pb[index].getInfo();
		}
	}
	
	//3) 기존정보삭제 
	void searchDelete() {
		System.out.println("기존정보를 삭제합니다. ");
		
		int index = enterInfo(); 
		
		if(index<0) {
			System.out.println("일치하는 이름이 없습니다.");
		}else {
			for(int i = index; i<numOfFriends-1; i++) {
				pb[i]=pb[i+1];
			}
			System.out.println("정보가 성공적으로 삭제되었습니다.");
			numOfFriends--;
		}
	}
	
	//4) 전체정보보기
	void showAllInfo() {
		for (int i=0; i<numOfFriends; i++) {
			System.out.println("===============================");
			pb[i].getInfo();
			System.out.println("===============================");
		}
	}
	
	//5) 기본정보보기 
	void showBasicInfo() {
		for(int i=0; i<numOfFriends; i++) {
			System.out.println("===============================");
			pb[i].getBasicInfo();
			System.out.println("===============================");
		}
	}
}
