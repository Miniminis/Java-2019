package v02;

public class MainPhoneInforV2 {
//	static Scanner phinfo = new Scanner(System.in);
	
	/*
	 * Project : ver 0.20 
	 * 1. "프로그램 사용자로부터 데이터 입력" 프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이 핵심. 
	 * 2. 단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다. 
	 * 3. 프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.
	 * 키보드로부터 데이터 입력 ↓ 
	 * 입력 받은 데이터로 인스턴스 생성 ↓ 
	 * 생성된 인스턴스의 메소드 호출
	 */

	public static void main(String[] args) {
//		데이터 입력을 위한 Scanner 클래스
//		Scanner phinfo = new Scanner(System.in);
		
		Manager manager = Manager.getinstance();
		
		while(true) {
			System.out.println("======================");
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 입력, 2. 종료");
			System.out.println("======================");
			
			
			
			int choice = util.phinfo.nextInt();
			
			if(choice==1) {
				Manager.insertMethod();
				
			} else if(choice==2) {
				//메인 메서드 종료 - 프로그램 종료  
				System.out.println("프로그램 종료");
				return; //break도 가능 
			} else {
				//1과 2 이외의 값이 입력될 경우: 다시 메뉴 선택으로 이동처리 
				System.out.println("정상적인 메뉴번호를 입력해주세요.");
			}
		}
			
//		while(true) {
//			System.out.println("저장하고자 하는 이름과 전화번호 생년월일을 입력해주세요");
//			사용자로부터 이름, 전화번호, 생일에 관한 정보 입력받기
		
			
//			String psname = phinfo.nextLine();
//			String phNumber	= phinfo.nextLine();
//			String bthday = phinfo.nextLine();
		
//			이 곳에서 바로 프린트를 할 경우: 입력받은 정보의 출력에 지나지 않는다. 
//			입력받은 정보를 클래스의 인스턴스에 저장하고자 할 경우에는 
//			phoneinfor class의 인스턴스를 생성하고 그 변수들에 정보를 저장해야한다. 
//			
		
//			System.out.println("입력된 정보에 따르면 당신의 이름과 전화번호, 생년월일은 다음과 같습니다.");
//			System.out.printf("이름: %s \n전화번호: %s \n생년월일: %s ", psname, phNumber, bthday);
//			System.out.println();
//			System.out.println("------------------------------------------------------------");
//			System.out.println("전화번호부를 종료하시겠습니까? 네/아니오로 답해주세요");
//			String answer = phinfo.nextLine();
//			if (answer=="네") {
//				continue;
//			} else {
//				break;
//			}
//		}
	}
}

