package v02;

//친구의 정보를 저장하는 클래스
//v02.PhoneInfor
class PhoneInfor_v02 {
	
	/*
	 * Version 0.1 전화번호 관리 프로그램. 
	 * PhoneInfor 라는 이름의 클래스를 정의해 보자. 클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 
	 * 저장된 데이터의 적절한 출력이 가능하도록 메소드 정의 
	 * • 이름 name String 
	 * • 전화번호 phoneNumber String 
	 * • 생년월일 birthday String 
	 * 단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
	 */
	
	String name;          //친구의 이름 저장
	String phoneNumber;   //친구의 전화번호 저장 
	String birthday;      //친구의 생일 정장 
	
	// 속성 = 변수 = 필드 
	
	//생성자: 기본정보 초기화 ( 이름, 전화번호, 생일)
	public PhoneInfor_v02(String name, String phoneNumber, String birthday) {
//		super(); //상속 
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	//생성자: 이름과 전봐번호 저장 (생일 제외)
	public PhoneInfor_v02(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}


	//생성자 생성 및 오버로딩 (생일 입력시와 미입력시 바르게 설정) 
//	PhoneInfor(String name, String phoneNumber) {
//		this(name, phoneNumber, "입력된 정보가 없습니다.");
//	}
//	
//	PhoneInfor(String name, String phoneNumber, String birthday) {
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.birthday = birthday;
//	}
	
	//친구 정보 출력의 메서드 
	void getInfo() {
		System.out.println("이름: "+name);
		
		if(phoneNumber.length()==11) {
			System.out.println("전화번호: "+ new StringBuffer(phoneNumber).insert(3, '-').insert(8, '-'));
		} else {
			System.out.println("전화번호: "+ phoneNumber);
		}
		
		if(birthday !=null) {
			System.out.println("생일     : "+birthday);
		} else {
			System.out.println("입력된 생일이 없습니다. ");
		}
//		if(birthday.length()==8) {
//			System.out.println("생일: "+ new StringBuffer(birthday).insert(4, '년').insert(7, '월').append('일'));			
//		} else {
//			System.out.println("생일: "+birthday);
//		}
	}	
	
	
}


