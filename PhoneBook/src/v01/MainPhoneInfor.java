package v01;

public class MainPhoneInfor {

	public static void main(String[] args) {
		
		//친구의 데이터를 저장하고 출력하는 프로그램 (phoneInfor 클래스 이용) 
		
		PhoneInfor_v01 info1 = new PhoneInfor_v01("명탐정코난", "01030005000");
		PhoneInfor_v01 info2 = new PhoneInfor_v01("카드캡터체리", "010-2000-6000", "20001225");
		PhoneInfor_v01 info3 = new PhoneInfor_v01("뽀로로", "01012345678", "1999년 8월 17일");
		
		
		info1.getInfo();
		info2.getInfo();
		info3.getInfo();
	}

}
