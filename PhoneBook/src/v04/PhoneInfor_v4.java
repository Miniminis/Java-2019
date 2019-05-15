package v04;

//최상위 클래스
public class PhoneInfor_v4 {
		
	private String name;
	private String phoneNumber;
	private String address;
	private String email;
	
	PhoneInfor_v4(String name, String phoneNumber, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	void getInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNumber);
		System.out.println("주소: "+address);
		System.out.println("이메일: "+email);
	}
	
	void getBasicInfo() {}
	
	//클래스 내부에 보호된 이름을 통한 검색을 가능하게 하기 위한 매서드 
	String getName() {
		return name;
	}
	
}

//대학교 친구들 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음 
class PhoneUnivInfor extends PhoneInfor_v4 {
	String major=null;
	String year=null;
	
	PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email); 
		this.major=major;
		this.year=year;
	}

	@Override
	void getInfo() {
		super.getInfo();
		System.out.println("전공: "+major);
		System.out.println("학년: "+year);
	}

	@Override
	void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getName());
	}
	
	
	
}
//회사 친구들 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음
class PhoneCompanyInfor extends PhoneInfor_v4 {
	String company=null;
	
	PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company=company;
	}
	@Override
	void getInfo() {
		super.getInfo();
		System.out.println("회사: "+company);
	}
	
	@Override
	void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getName());
		System.out.println("회사: "+company);
	}
	
}

//가족 정보 저장을 위한 클래스 생성 
//기본정보를 PhoneInfor_v4 로부터 상속받음
class PhoneFamilyInfor extends PhoneInfor_v4{
	String bday=null;
	
	PhoneFamilyInfor(String name, String phoneNumber, String address, String email, String bday) {
		super(name, phoneNumber, address, email);
		this.bday=bday;
	}
	
	@Override
	void getInfo() {
		super.getInfo();
		System.out.println("생일: "+bday);
	}
	
	@Override
	void getBasicInfo() {
		System.out.println("이름: "+super.getName());
		System.out.println("전화번호: "+super.getName());
		System.out.println("생일: "+bday);
	}
}
