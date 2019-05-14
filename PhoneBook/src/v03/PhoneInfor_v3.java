package v03;

public class PhoneInfor_v3 {
	/*
	 * > Project : ver 0.10 
	 * "프로그램 사용자로부터 데이터 입력" 프로그램 사용자로부터 데이터를 입력 받아 
	 * 클래스의 인스턴스를 생성하는 것이 핵심.
	 * 단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다. 
	 * 프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.
	 * 
	 * 키보드로부터 데이터 입력 ↓ 입력 받은 데이터로 인스턴스 생성 ↓ 생성된 인스턴스의 메소드 호출
	 */
		
	private String name;
	private String phonenum;
	private String bday;
	
	PhoneInfor_v3(String name, String phonenum, String bday) {
		this.name = name;
		this.phonenum = phonenum;
		this.bday = bday;
	}
	
	PhoneInfor_v3(String name, String phonenum) {
		this(name, phonenum, "등록된 값이 없습니다.");
	}
	
	void getInfo() {
		System.out.println("*********************************");
		System.out.println("이름: "+name);
		
		if(phonenum.length()==11) {
			System.out.println("전화번호: "+ new StringBuffer(phonenum).insert(3, '-').insert(8, '-'));
		} else {
			System.out.println("전화번호: "+ phonenum);
		}
		
		if(bday.length()==8) {
			System.out.println("생일: "+ new StringBuffer(bday).insert(4, '년').insert(7, '월').append('일'));			
		} else {
			System.out.println("생일: "+bday);
		}
		System.out.println("*********************************");
	}
	
	String getName() {
		return name;
	}
	
}
