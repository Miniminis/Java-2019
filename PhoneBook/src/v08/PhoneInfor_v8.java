package v08;

import java.io.Serializable;

//메소드 명칭 규칙을 위한 인터페이스 생성 
interface PhoneInforStorage {
	void getInfo(); //(public abstract) 가 생략됨 
	void getBasicInfo(); //(public abstract) 가 생략됨
}

//PhoneInforStorage 인터페이스를 구현하고 있는 추상클래스 PhoneInfor_v8
//등록된 전화번호부를 파일로 저장하기 위한 Serializable interface 구현 
public abstract class PhoneInfor_v8 implements PhoneInforStorage, Serializable {
		
	//외부로부터 변수에 대한 직접접근을 막기 위한 private 제어자
	private String name;
	private String phoneNumber;	
	
	PhoneInfor_v8(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void getInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNumber);
	}
	
	abstract public void getBasicInfo();
	
	//클래스 내부에 보호된 이름을 통한 검색을 가능하게 하기 위한 매서드 
	String getName() {
		return name;
	}
	
	//클래스 내부에 보호된 전화번호에 접근을 하게 해주는 매서드 
	String getPhoneNum() {
		return phoneNumber;
	}
	
}

//대학교 친구들 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음 
class PhoneUnivInfor extends PhoneInfor_v8 {
	String address=null;
	String email=null;
	String major=null;
	String year=null;
	
	PhoneUnivInfor(
			String name, 
			String phoneNumber, 
			String address, 
			String email, 
			String major, 
			String year) {
		super(name, phoneNumber);
		this.address=address;
		this.email=email;
		this.major=major;
		this.year=year;
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("주소: "+address);
		System.out.println("이메일 "+email);
		System.out.println("전공: "+major);
		System.out.println("학년: "+year);
	}

	@Override
	public void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getPhoneNum());
	}
	
	
	
}
//회사 친구들 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음
class PhoneCompanyInfor extends PhoneInfor_v8 {
	String email=null;
	String company=null;
	
	PhoneCompanyInfor(
			String name, 
			String phoneNumber, 
			String email, 
			String company) {
		super(name, phoneNumber);
		this.email=email;
		this.company=company;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("이메일: "+email);
		System.out.println("회사: "+company);
	}
	
	@Override
	public void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getPhoneNum());
		System.out.println("회사: "+company);
	}
	
}

//가족 정보 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음
class PhoneFamilyInfor extends PhoneInfor_v8{
	String bday=null;
	
	PhoneFamilyInfor(
			String name, 
			String phoneNumber, 
			String bday) {
		super(name, phoneNumber);
		this.bday=bday;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("생일: "+bday);
	}
	
	@Override
	public void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getPhoneNum());
		System.out.println("생일: "+bday);
	}
}
