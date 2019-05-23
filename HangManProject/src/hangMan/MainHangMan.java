package hangMan;

import java.util.Scanner;

public class MainHangMan {
	
	/* 행맨게임
	 * 0. 게임 시작 메뉴 입력 화면 
	 * 1. 사용자 추측값 입력 및 정답 확인 
	 * 2. 핵맨 지우기 매서드 
	 * 3. 게임단어 랜덤돌리기 매서드  */
	
	public static void main(String[] args) {

		int choice = startMenu();
		
		switch(choice) {
		case 1: //초급
			easyLevel();
			break;
		case 2: //중급
			intermediateLevel();
			break;
		case 3: //고급 
			advancedLevel();
			break;
		}

	}
	
	//0. 게임 시작 메뉴 입력화면 
	static int startMenu() {
		String username="minhee"; //로그인 페이지에서 입력값 가져오기  
		System.out.println(username+"님 환영합니다*^^* ");
		System.out.println("게임의 난이도를 선택해주세요. ");
		System.out.println("1) 초급 2) 중급 3) 고급");
				
		//사용자의 메뉴입력 
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		return choice;
	}
	
	//1. 초급게임 
	static void easyLevel() {
		System.out.println("초급게임을 실시합니다. ");
		
		String correctAnswer = "ant";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			System.out.println("세 자리 영어단어를 맞춰주세요. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()==3 && answer.equals(correctAnswer)) {
				System.out.println("당신은 천재군요! 정답입니다!!!");
				break;
			}else if (answer.length()==3 && !(answer.equals(correctAnswer))){
				System.out.println("핵맨 신체의 일부분이 사라집니다. ");
				tryCnt++;
				System.out.println("남은 횟수: "+(6-tryCnt));
			}else { //입력된 단어가 세 자리수가 아닌 경우 
				System.out.println("올바른 단어를 입력해주세요. ");
			}
		}
		System.out.println("게임이 종료됩니다.");
	}
	
	//2. 중급게임 
	static void intermediateLevel() {
		System.out.println("중급 게임을 시작합니다. ");

		String correctAnswer = "mouse";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			
			System.out.println("다섯 자리 이상의 영어단어를 맞춰주세요. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()>5 && answer.equals(correctAnswer)) {
				System.out.println("당신은 천재군요! 정답입니다! ");
				break;
			} else if (answer.length()>5 && !(answer.equals(correctAnswer))){
				System.out.println("핵맨 신체의 일부분이 사라집니다. ");
				tryCnt++;
				System.out.println("남은 횟수: "+(6-tryCnt));
			}else { //입력된 단어가 다섯자리 단어 이하인 경우 
				System.out.println("올바른 단어를 입력해주세요. ");
			}
		}
		System.out.println("게임이 종료됩니다.");
	}
	
	//3. 상급게임 
	static void advancedLevel() {
		System.out.println("상급 게임을 시작합니다. ");
		
		String correctAnswer = "intermediate";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			
			System.out.println("열 자리  영어단어를 맞춰주세요. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()>10 && answer.equals(correctAnswer)) {
				System.out.println("당신은 천재군요! 정답입니다! ");
				break;
			} else if (answer.length()>10 && !(answer.equals(correctAnswer))){
				System.out.println("핵맨 신체의 일부분이 사라집니다. ");
				tryCnt++;
				System.out.println("남은 횟수: "+(6-tryCnt));
			}else { //입력된 단어가 열자리 이하인 경우
				System.out.println("올바른 단어를 입력해주세요. ");
			}
		}
		System.out.println("게임이 종료됩니다.");
		
	}
	
	//행맨 지우기 
	void deleteHangMan() {
		
		
	}
	
	//게임단어 랜덤돌리기 
	void randomWord() {
		
	}

}
