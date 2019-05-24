package hangMan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainHangMan {
	
	/* 행맨게임
	 * 0. 게임 시작 메뉴 입력 화면 
	 * 1. 사용자의 단어 추측값 입력 - 정답단어와 대조하여 확인
	 * while 반복문: tryCnt가 행맨의 신체부위 횟수보다 작을때까지 반복 
	 * 1) 입력char 가 있으면 --> "--a--" : 초기에 -로 표시되었던 단어의 빈칸이 해당 글자로 
	 * 바뀌어 표현됨
	 * - tryCnt --;
	 * 2) 입력 char가 없으면 --> "-----" : 입력하신 단어가 없습니다. 
	 * - 행맨의+bodyPart+가 사라집니다. 남은 횟수: --번 //(시간 있으면: 행맨 그림 표현)  
	 * - tryCnt--;
	 * 2. 행맨 지우기 매서드
	 * - 오답일 때: 텍스트로 행맨의 없어진 신체부위 표시  (이후 수정: 행맨 그림 순차적으로 띄우기)
	 * -- 오답인 경우와 행맨 매서드 연결   
	 * 3. 게임단어 랜덤돌리기 매서드 
	 * - 게임 단어리스트 - 배열로 일단 저장(외부에서 불러올 방법 있으면 추가)
	 * - 배열로 저장된 단어 랜덤으로 뽑아오기  */
	
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
	
	//0. 게임 시작 메뉴 입력 화면  
	static int startMenu() {
		String username="minhee"; //로그인 페이지에서 입력값 가져오기
		System.out.println(username+"님 환영합니다*^^*  ");
		System.out.println("게임의 난이도를 선택해주세요. ");
		System.out.println("1) 초급 2) 중급 3) 고급");
				
		//사용자의 메뉴입력 
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		return choice;
	}
	
	//1. 초급
	static void easyLevel() {
		System.out.println("초급게임을 실시합니다.");
	
		String correctAnswer = randomWord();
		int tryCnt = 0;
		
		while(tryCnt<6) {
			System.out.println("세 자리 영어단어를 맞춰주세요. ");
			
			//사용자 입력 정답: 문자열일 경우 
			Scanner sc = new Scanner(System.in);
			String Stranswer = sc.nextLine();
			
			//사용자 입력 정답: 문자일 경우
			Scanner ch = new Scanner(System.in);
			int charAnswer = ch.nextInt();
			
			
			
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
	
	//2. 중급
	static void intermediateLevel() {
		System.out.println("�߱� ������ �����մϴ�. ");

		String correctAnswer = "mouse";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			
			System.out.println("�ټ� �ڸ� �̻��� ����ܾ �����ּ���. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()>5 && answer.equals(correctAnswer)) {
				System.out.println("����� õ�籺��! �����Դϴ�! ");
				break;
			} else if (answer.length()>5 && !(answer.equals(correctAnswer))){
				System.out.println("�ٸ� ��ü�� �Ϻκ��� ������ϴ�. ");
				tryCnt++;
				System.out.println("���� Ƚ��: "+(6-tryCnt));
			}else { //�Էµ� �ܾ �ټ��ڸ� �ܾ� ������ ��� 
				System.out.println("�ùٸ� �ܾ �Է����ּ���. ");
			}
		}
		System.out.println("������ ����˴ϴ�.");
	}
	
	//3. 고급 
	static void advancedLevel() {
		System.out.println("��� ������ �����մϴ�. ");
		
		String correctAnswer = "intermediate";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			
			System.out.println("�� �ڸ�  ����ܾ �����ּ���. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()>10 && answer.equals(correctAnswer)) {
				System.out.println("����� õ�籺��! �����Դϴ�! ");
				break;
			} else if (answer.length()>10 && !(answer.equals(correctAnswer))){
				System.out.println("�ٸ� ��ü�� �Ϻκ��� ������ϴ�. ");
				tryCnt++;
				System.out.println("���� Ƚ��: "+(6-tryCnt));
			}else { //�Էµ� �ܾ ���ڸ� ������ ���
				System.out.println("�ùٸ� �ܾ �Է����ּ���. ");
			}
		}
		System.out.println("������ ����˴ϴ�.");
		
	}
	
	//행맨 지우기 
	void deleteHangMan() {
		ArrayList<String> hangMan = new ArrayList<String>();
		hangMan.add("왼쪽다리");
		
	}
	
	//게임단어 랜덤돌리기  
	static String randomWord() {
		ArrayList<String> gameWord = new ArrayList<String>();
		//세자리수 단어 
		gameWord.add("ant");
		gameWord.add("run");
		gameWord.add("poo");
		gameWord.add("app");
		
		Collections.shuffle(gameWord);
	
		String rdWord = gameWord.get(0);
		return rdWord;
	}
	
	//유저-게임포인트 저장 메서드 
	void savePoint() {
		
	}

}
