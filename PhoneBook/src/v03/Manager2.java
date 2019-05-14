package v03;

import util.Util;

public class Manager2 {
	public static PhoneInfor_v3 [] pb;
	
	Manager2 () {
		pb = new PhoneInfor_v3[100];
	}
	Manager2 (int size){
		pb= new PhoneInfor_v3[size];
	}
	
	public static int count = 0;
	
	//0) 프로그램 메인: 시작페이지 
	public static int startMenu() {
		System.out.println("**********************************");
		System.out.println("프로그램을 시작합니다. ");
		System.out.println("메뉴를 선택해주세요 ");
		System.out.printf("%d 신규정보등록 \n%d 기존정보검색 \n%d 기존정보삭제 \n%d 전체정보보기 \n%d 나가기\n", Util.INSERT, Util.SEARCH, Util.DELETE, Util.ALLINFO, Util.END);
		System.out.println("**********************************");
		
		int choice = Util.keyboard.nextInt();
		Util.keyboard.nextLine();
		return choice;
	}
	//1) 신규정보등록
	void inputInfo() {
		System.out.println("신규정보를 등록합니다.");
		System.out.println("등록하고자하는 사람의 이름을 입력해주세요.");
		String name = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 전화번호를 입력해주세요.");
		String pNum = Util.keyboard.nextLine();
		
		System.out.println("등록하고자하는 사람의 생일을 입력해주세요.");
		String bday = Util.keyboard.nextLine();
		
		if(bday==null || bday.trim().length()<1) {
			pb[count++] = new PhoneInfor_v3(name, pNum);
		} else {
			pb[count++] = new PhoneInfor_v3(name, pNum, bday);
		}	
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
			for(int i = index; i<count-1; i++) {
				pb[i]=pb[i+1];
				System.out.println("정보가 성공적으로 삭제되었습니다.");
				count--;
			}
		}
	}
	
	//4) 전체정보보기
	void AllInfo() {
		System.out.println("==========================");
		for (int i=0; i<count; i++) {
			pb[i].getInfo();
		}
		System.out.println("==========================");
	}
	
	//정보 검색용 메서드
	int enterInfo() {
		System.out.println("검색하고 싶은 사람의 이름을 입력해주세요. ");
		String name = Util.keyboard.nextLine();
		
		int index = -1;
		
		for(int i=0; i<count; i++) {
			if(pb[i].getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
}
