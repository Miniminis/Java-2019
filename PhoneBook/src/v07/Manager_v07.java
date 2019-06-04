package v07;

import java.util.HashSet;
import java.util.Iterator;

import util.Util;

//Util interface를 구현
public class Manager_v07 {
	private static HashSet<PhoneInfor_v07> pbSet;

	// 인스턴스 직접참조 및 다수의 인스턴스 생성을 막기 위한 singleton pattern 적용
	// s1) 생성자 접근제한
	private Manager_v07() {
		pbSet = new HashSet<PhoneInfor_v07>();
	}

	// s2) class 내부변수를 통한 Manager instance 생성
	// ---> getInstance를 통해서 호출될 수 있도록 static 선언
	private static Manager_v07 manager = new Manager_v07();

	// s3) 외부접근을 가능하게 해주는 getInstance 생성
	public static Manager_v07 getInstance() {
		if (manager == null) {
			manager = new Manager_v07();
		}
		return manager;
	}

	// 0) 프로그램 메인: 시작페이지
	public static int startMenu() {
		System.out.println("**********************************");
		System.out.println("프로그램을 시작합니다. ");
		System.out.println("메뉴를 선택해주세요 ");
		System.out.printf("%d) 신규정보등록 \n%d) 기존정보검색 \n%d) 기존정보삭제 \n%d) 기존정보수정  \n%d) 전체정보보기 \n%d) 기본정보보기 \n%d) 나가기\n",
				Util.INSERT, Util.SEARCH, Util.DELETE, Util.EDITINFO, Util.ALLINFO, Util.BASICINFO, Util.END);
		System.out.println("**********************************");

		int choice = Util.keyboard.nextInt();
		Util.keyboard.nextLine(); // 개행
		return choice;
	}

	// 1-1) 소속 선택을 위한 메서드
	void deptInput() {

		System.out.println("등록/수정하고자하는 사람의 소속을 입력해주세요. ");
		System.out.printf("%d) 가족 \n%d) 대학교 \n%d) 회사", Util.FMILY, Util.UNIVERSITY, Util.COMPANY);
		int deptChoice = Util.keyboard.nextInt();
		Util.keyboard.nextLine(); // 개행

		inputInfo(deptChoice);
	}

	// 1) 신규정보등록
	void inputInfo(int deptChoice) {

		System.out.println("등록하고자하는 사람의 이름을 입력해주세요.");
		String name = Util.keyboard.nextLine();

		System.out.println("등록하고자하는 사람의 전화번호를 입력해주세요.");
		String phoneNumber = Util.keyboard.nextLine();

		System.out.println("등록하고자하는 사람의 주소를 입력해주세요.");
		String address = Util.keyboard.nextLine();

		System.out.println("등록하고자하는 사람의 이메일을 입력해주세요.");
		String email = Util.keyboard.nextLine();

		switch (deptChoice) {
		case Util.FMILY: // 가족
			System.out.println("등록하고자하는 사람의 생일을 입력해주세요. ");
			String bday = Util.keyboard.nextLine();

			pbSet.add(new PhoneFamilyInfor(name, phoneNumber, bday));
			return;
		case Util.UNIVERSITY: // 대학교
			System.out.println("등록하고자하는 사람의 전공을 입력해주세요. ");
			String major = Util.keyboard.nextLine();

			System.out.println("등록하고자하는 사람의 학년을 입력해주세요. ");
			String year = Util.keyboard.nextLine();

			pbSet.add(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));
			return;
		case Util.COMPANY: // 회사
			System.out.println("등록하고자하는 사람의 회사를 입력해주세요. ");
			String company = Util.keyboard.nextLine();

			pbSet.add(new PhoneCompanyInfor(name, phoneNumber, email, company));
			return;
		default: // 그 이외의 상황
			System.out.println("올바른 소속 번호를 입력해주세요. ");
			return;
		}
	}

	// 2-0) 정보 검색용 메서드
	PhoneInfor_v07 enterInfo() {
		String name = Util.keyboard.nextLine();
		

		Iterator<PhoneInfor_v07> itr = pbSet.iterator();
		while(itr.hasNext()) {
						
		}
		
		/*
		 * while (itr.hasNext()) { String foundName = itr.next().getName();
		 * 
		 * if(foundName.compareTo(name)==0) { foundPhNum = itr.next().getPhoneNum(); } }
		 */
		return foundPhNum;
	}

	// 2) 기존정보검색
	void searchInfo() {
		String foundPhNum = enterInfo();

		Iterator<PhoneInfor_v07> itr = pbSet.iterator();
		while (itr.hasNext()) {
			String nextNum = itr.next().getPhoneNum();
			if(nextNum.equals(foundPhNum)) {
				itr.next().getInfo();
			}
		}

		/*
		 * if (index < 0) { System.out.println("일치하는 이름이 없습니다."); } else { pbSet.
		 * pblist.get(index).getInfo(); }
		 */
	}

	// 3) 기존정보삭제
	void searchDelete() {
		int index = enterInfo();

		if (index < 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pbSet.remove(o)
			pblist.remove(index);
		}
	}

	// 4) 전체정보보기
	void showAllInfo() {
		Iterator<PhoneInfor_v07> itr = pbSet.iterator();
		while (itr.hasNext()) {
			itr.next().getInfo();
		}
	}

	// 5) 기본정보보기
	void showBasicInfo() {
		Iterator<PhoneInfor_v07> itr = pbSet.iterator();
		while (itr.hasNext()) {
			itr.next().getBasicInfo();
		}
	}

	// 6) 데이터 수정 기능
	void editInfo() {
		// index 값을 기준으로 삭제상황 나누기
		int index = enterInfo();
		if (index < 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pblist.remove(index);
			deptInput();
		}
	}
}
