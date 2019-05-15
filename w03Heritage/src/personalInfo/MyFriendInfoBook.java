package personalInfo;

import java.util.Scanner;

public class MyFriendInfoBook {

	public static void main(String[] args) {
		
		FriendInforHandler friendManager= new FriendInforHandler(100);
		
		while(true) {
			System.out.println("전화번호부를 시작합니다. ");
			System.out.println("원하시는 메뉴의 번호를 입력해주세요.");
			System.out.println("1) 고등학교친구 저장 \n2) 대학교 친구 저장 \n3) 전체정보보기 \n4) 기본정보보기 \n5) 나가기");
			
			Scanner keyboard = new Scanner(System.in);
			int choice = keyboard.nextInt();
			
			switch(choice) {
			case 1: case 2: //1, 2) 고등학교 및 대학교 친구 저장 
				friendManager.addFriend(choice);
				break;
			case 3: //3) 전체정보보기 
				friendManager.showAllInfor();
				break;
			case 4: //4) 기본정보보기 
				friendManager.showBasicInfor();
				break;
			case 5: //5) 나가기 
				System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다. ");
				return;
			}
		}
	}

}

class Friend {
	String name;
	String pnum;
	String address;
	
	Friend(String name, String pnum, String address) {
		this.name = name;
		this.pnum = pnum;
		this.address = address;
	}
	
	//고등학교, 대학교 친구들의 공통되는 정보 3가지 항목을 friend class에 정의
	//하위 클래스에서 상속될 예정임.
	public void showAllInfor() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호: "+pnum);
		System.out.println("주소: "+address);
	}
	
	//하위 클래스의 오버라이딩을 위해 구체적으로 정의하지않음.
	public void showBasicInfor() {}
	
}
class HighFriend extends Friend {
	String job;
	
	HighFriend(String name, String pnum, String address, String job) {
		super(name, pnum, address);
		this.job = job;
	}
	
	public void showAllInfor() {
		super.showAllInfor();
		System.out.println("직장: "+job);
	}
	
	public void showBasicInfor() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+pnum);
	}
	
}
class UnivFriend extends Friend {
	String major;
	
	UnivFriend(String name, String pnum, String address, String major) {
		super(name, pnum, address);
		this.major = major;
	}
	
	public void showAllInfor() {
		super.showAllInfor();
		System.out.println("전공: "+major);
	}
	
	public void showBasicInfor() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+pnum);
		System.out.println("전공: "+major);
	}
}

class FriendInforHandler {
	//1) 사용자가 원하는만큼 저장하는 전화번호부 생성 
	Friend[] myfriend;
	int numOfFriend;
	
	public FriendInforHandler(int num) {
		myfriend = new Friend[num];
		numOfFriend = 0;
	}
	
	//2) 저장공간에 저장된 정보 넣기 
	public void addFriendInfor(Friend f) {
		myfriend[numOfFriend++] = f;
	}
	
	//3) 사용자로부터 정보 입력받기 + 입력받은 정보 올바른 클래스에 저장하기(고등학교, 대학교) 
	public void addFriend(int choice) {
		System.out.println("친구정보의 저장을 시작합니다. 올바른 정보를 입력해주세요. ");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("이름: "); String name = keyboard.nextLine();
		System.out.println("전화번호: "); String pnum = keyboard.nextLine();
		System.out.println("주소: "); String address = keyboard.nextLine();
		if(choice==1) {
			System.out.println("직장: "); String job = keyboard.nextLine();
			addFriendInfor(new HighFriend(name, pnum, address, job));			
		} else {
			System.out.println(("전공: ")); String major = keyboard.nextLine();
			addFriendInfor(new UnivFriend(name, pnum, address, major));
		}
		System.out.println("정보가 성공적으로 저장되었습니다. ");
	}
	//4) 모든 정보 보여주기 
	public void showAllInfor() {
		for(int i=0; i<numOfFriend; i++) {
			myfriend[i].showAllInfor();
		}
	}
	//5) 기본정보 보여주기 
	public void showBasicInfor() {
		for(int i=0; i<numOfFriend; i++) {
			myfriend[i].showBasicInfor();
		}
	}
	
}