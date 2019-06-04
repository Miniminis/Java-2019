package v08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Util;

//Util interface를 구현
public class Manager_v8 {
	private static ArrayList<PhoneInfor_v8> pblist;
	
	//인스턴스 직접참조 및 다수의 인스턴스 생성을 막기 위한 singleton pattern 적용 
	//s1) 생성자 접근제한  
	private Manager_v8 () {
		pblist = new ArrayList<PhoneInfor_v8>();
	}
	
	//s2) class 내부변수를 통한 Manager instance 생성 
	//---> getInstance를 통해서 호출될 수 있도록 static 선언
	private static Manager_v8 manager = new Manager_v8();
	
	//s3) 외부접근을 가능하게 해주는 getInstance 생성 
	public static Manager_v8 getInstance() {
		if(manager==null) {
			manager = new Manager_v8();
		}
		return manager;
	}

	// 0) 프로그램 메인: 시작페이지
	public static int startMenu() {
		System.out.println("**********************************");
		System.out.println("프로그램을 시작합니다. ");
		System.out.println("메뉴를 선택해주세요 ");
		System.out.printf("%d) 신규정보등록 \n%d) 기존정보검색 \n%d) 기존정보삭제 \n%d) 기존정보수정  \n%d) 전체정보보기 \n%d) 기본정보보기 \n%d) 전화번호부 파일로 저장하기 \n%d) 나가기\n", Util.INSERT,
				Util.SEARCH, Util.DELETE, Util.EDITINFO, Util.ALLINFO, Util.BASICINFO, Util.SAVEINFO, Util.END);
		System.out.println("**********************************");

		int choice = Util.keyboard.nextInt();
		Util.keyboard.nextLine(); // 개행
		return choice;
	}
	
	//1-1) 소속 선택을 위한 메서드 
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

			pblist.add(new PhoneFamilyInfor(name, phoneNumber, bday));
			return;
		case Util.UNIVERSITY: // 대학교
			System.out.println("등록하고자하는 사람의 전공을 입력해주세요. ");
			String major = Util.keyboard.nextLine();

			System.out.println("등록하고자하는 사람의 학년을 입력해주세요. ");
			String year = Util.keyboard.nextLine();
			
			pblist.add(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));
			return;
		case Util.COMPANY: // 회사
			System.out.println("등록하고자하는 사람의 회사를 입력해주세요. ");
			String company = Util.keyboard.nextLine();

			pblist.add(new PhoneCompanyInfor(name, phoneNumber, email, company));
			return;
		default: // 그 이외의 상황
			System.out.println("올바른 소속 번호를 입력해주세요. ");
			return;
		}
	}
	
	// 2-0) 정보 검색용 메서드
	int enterInfo() {
		String name = Util.keyboard.nextLine();

		int index = -1;

		for (int i = 0; i<pblist.size(); i++) {
			if (pblist.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	// 2) 기존정보검색
	void searchInfo() {
		int index = enterInfo();

		if (index < 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pblist.get(index).getInfo();
		}
	}

	// 3) 기존정보삭제
	void searchDelete() {
		int index = enterInfo();

		if (index < 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pblist.remove(index);
		}
	}

	// 4) 전체정보보기
	void showAllInfo() {
		getSavedInfo();
		
		for (int i = 0; i < pblist.size(); i++) {
			System.out.println("===============================");
			pblist.get(i).getInfo();
			System.out.println("===============================");
		}
	}

	// 5) 기본정보보기
	void showBasicInfo() {
		getSavedInfo();
		
		for (int i = 0; i < pblist.size(); i++) {
			System.out.println("===============================");
			pblist.get(i).getBasicInfo();
			System.out.println("===============================");
		}
	}
	
	//6) 데이터 수정 기능 
	void editInfo() {
		//index 값을 기준으로 삭제상황 나누기 
		int index = enterInfo();
		if (index < 0) {
			System.out.println("일치하는 이름이 없습니다.");
		} else {
			pblist.remove(index);
			deptInput();
		}
	}
	
	//7) 전화번호부 .txt file로 저장하기
	void saveInfo() {
		//PhoneInfor_v8 instance 저장을 위한 ObjectOutputStream instance 생성  
		try(ObjectOutputStream infoOut = new ObjectOutputStream(new FileOutputStream("PhoneInfo.txt"))) {
			infoOut.writeObject(pblist);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("정보가 안전하게 저장되었습니다. ");
		
	}
	
	//8. 저장된 전화번호부 인스턴스 불러오기 
	void getSavedInfo() {
		//PhoneInfor_v8 instance 복원을 위한 ObjectInputStream instance 생성
		try (ObjectInputStream infoIn = new ObjectInputStream(new FileInputStream("PhoneInfo.txt"))) {
			ArrayList<PhoneInfor_v8> infoList = (ArrayList<PhoneInfor_v8>) infoIn.readObject();
			System.out.println(infoList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
