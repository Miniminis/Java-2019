package hangMan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import util.Util;

public class GameManager implements Util {
	
	//0. 게임 시작 메뉴 입력 화면  
	int startMenu() {
		String username="minhee"; //임의의값 //로그인 페이지에서 유저네임 가져오기
		System.out.println(username+"님 환영합니다*^^*");
		System.out.println("게임의 난이도를 선택해주세요.");
		System.out.println("1) 초급 2) 중급 3) 고급");
					
		//유저의 메뉴입력 		
		int choice = Util.scanner.nextInt();
			
	return choice;
	}
	
	void gameStart(int n) {	

		String correctAnswer = randomWord(n); //랜덤 키워드로부터 길이가 n인 정답단어 축출 
		char[] correctAnswerArray = correctAnswer.toCharArray(); //단어의 각 알파벳 대조를 위해 char array 생성
		char[] blank = new char[correctAnswerArray.length]; //단어 자리수 표시를 위한 공백 array
		for(int i=0; i<correctAnswerArray.length; i++) { 
			blank[i] = '_';
		}
		
		int failCnt = 0; //유저의 오답 횟수 

		
		while((12-failCnt)>0) { //(행맨 신체부위 12개 - 실패횟수): 남아있는 기회
			System.out.println("빈 칸에 들어갈 알맞은 알파벳을 입력해주세요.");
			for(int i=0; i<correctAnswerArray.length; i++) {  //유저화면에 빈칸 array 표시 - 자릿수 표시 
				System.out.print(blank[i]+" ");
			}
			
			//사용자 정답 입력 = answer 
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			int ansLen = answer.length();
			
			//제한 범위 외의 입력값에 대한 처리 
			if(ansLen<1 || ansLen>n) {
				System.out.println("올바른 단어를 입력해주세요. ");
			}
	
			if(ansLen==1) { //유저가 알파벳을 입력한 경우  	
				
				boolean success = false; //유저의 정답 여부 	
				
				for(int i=0; i<correctAnswerArray.length; i++) {
					if(correctAnswerArray[i]==answer.charAt(0)) {
						System.out.println("입력하신 알파벳은 정답 단어에 포함되어 있습니다. ");
						blank[i] = answer.charAt(0);
						success = true; //추측성공시 true 반환 
					} 	
				}
				
				if(success != true) { //추측이 실패했을 때
					failCnt++;
					System.out.println("남은 횟수: "+(12-failCnt));
					System.out.println("억울한 사형수의 "+deleteHangMan(12-failCnt)+"이/가 사라집니다.");
				}
				
				
			} else { //유저가 단어(문자열)로 입력한 경우
		
				if(correctAnswer.equals(answer)) {
					System.out.println("당신은 천재이군요! 정답입니다.");
					break;
				} else {
					System.out.println("정답이 아닙니다.");
					failCnt++;
					System.out.println("남은 횟수: "+(12-failCnt));
					System.out.println("억울한 사형수의 "+deleteHangMan(12-failCnt)+"이/가 사라집니다.");
				}
				
			}
		}
		afterGame(failCnt);
	}
	
	//게임 완료 후 메뉴 선택지
	void afterGame(int failCnt) {
		System.out.println("게임이 끝났습니다. 메뉴를 선택해주세요. ");
		System.out.printf("%d) 게임 포인트 저장하기 \n%d) 게임 계속하기 \n%d) 랭킹 확인하기 \n%d) 메인으로 돌아가기 \n%d) 게임 종료하기", Util.SAVE, Util.KEEPGAME, Util.CHECKLANK, Util.GOTOMAIN, Util.ENDGAME);
		
		int choice = Util.scanner.nextInt();
		
		switch(choice) {
		case Util.SAVE: 
			savePoint(gamePoint(failCnt));
			//메인클래스와 연결
			break;
		case Util.KEEPGAME: //게임 계속하기 
			GameFlow gflow = new GameFlow();
			gflow.gameProcess();
			break;
		case Util.CHECKLANK: //랭킹 확인하기 
			//랭킹 클래스와 연결 
			break; 
		case Util.GOTOMAIN: //메인으로 돌아가기  
			//메인 클래스와 연결 
			break; 
		case Util.ENDGAME: //게임 종료하기
			System.out.println("이용해주셔서 갑사합니다. 게임이 종료됩니다. ");
			break; 
		}
	}
	
	//행맨 지우기
	String deleteHangMan(int n) {
		int restCnt = n;
		String hangManStatus;
		
		//행맨의 신체 부위 개수는 고정되어있으므로 수정이 많지 않음 --> 일반 배열을 사용 
		String[] hangMan = new String[] {
			"목",
			"눈썹",
			"머리카락",
			"몸통",
			"왼팔",
			"오른팔",
			"왼쪽 다리",
			"오른쪽 다리",
			"왼쪽 손",
			"오른쪽 손",
			"왼쪽 발",
			"오른쪽 발",
		};
		
		hangManStatus = hangMan[restCnt];
		return hangManStatus;
			
	}
	
	//게임단어 랜덤돌리기  - 매 게임마다 정답 단어가 바뀐다 
	String randomWord(int n) {
		int level = n;
		String rdWord = null;
		
		//빠른 참조+shuffle 매서드 사용을 위해  list 저장방법 이용
		ArrayList<String> gameWord1 = new ArrayList<String>(); 
		ArrayList<String> gameWord2 = new ArrayList<String>();
		ArrayList<String> gameWord3 = new ArrayList<String>();
		
		//세자리수 단어 
		gameWord1.add("ant");
		gameWord1.add("run");
		gameWord1.add("joy");
		gameWord1.add("fix");
		gameWord1.add("box");
		gameWord1.add("pig");
		gameWord1.add("wax");
		gameWord1.add("zoo");
		gameWord1.add("gym");
		gameWord1.add("six");
		
		//다섯자리수 단어 
		gameWord2.add("jelly");
		gameWord2.add("pizza");
		gameWord2.add("lucky");
		gameWord2.add("quick");
		gameWord2.add("crazy");
		gameWord2.add("field");
		gameWord2.add("mouse");
		gameWord2.add("japan");
		gameWord2.add("enjoy");
		gameWord2.add("paper");
		
		//열자리수 단어
		gameWord3.add("mozzarella");
		gameWord3.add("jeopardize");
		gameWord3.add("chimpanzee");
		gameWord3.add("backpacker");
		gameWord3.add("complexity");
		gameWord3.add("experience");
		gameWord3.add("battleship");
		gameWord3.add("bankruptcy");
		gameWord3.add("expectance");
		gameWord3.add("emphasizes");
		
		
		switch(level) {
		case 3: //3글자 
			Collections.shuffle(gameWord1);
			 rdWord = gameWord1.get(0);
			break;
		case 5: //5글자 
			Collections.shuffle(gameWord2);
			rdWord = gameWord2.get(0);
			break;
		case 10: //10글자 
			Collections.shuffle(gameWord3);
			rdWord = gameWord3.get(0);
			break;
		default: 
			break;
		}

		return rdWord;
	}
	
	//점수 매서드 
	int gamePoint(int n) {
		int gamePoint=0;
		int failCnt = n;
		if(failCnt<=1) {
			gamePoint=100;
		} else if(failCnt>1 && failCnt <=4) {
			gamePoint=90;
		} else if(failCnt>4 && failCnt <=7) {
			gamePoint=80;
		} else if(failCnt>7 && failCnt <=10) {
			gamePoint=70;
		}else {
			gamePoint=0;
		}
		return gamePoint;
	}
	
	//유저-게임포인트 저장 메서드 
	void savePoint(int gameP) {
		int gamePoint = gameP;
		//사용자 정보 클래스에 저장 
		System.out.println("저장된 게임 포인트는 "+gamePoint+"점 입니다.");	
	}
	
	//tryCnt가 3일 때 힌트 제안 
	void Hint() {
		
	}
}
