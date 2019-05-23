package hangMan;

import java.util.Scanner;

public class MainHangMan {
	
	/* ��ǰ���
	 * 0. ���� ���� �޴� �Է� ȭ�� 
	 * 1. ����� ������ �Է� �� ���� Ȯ�� 
	 * 2. �ٸ� ����� �ż��� 
	 * 3. ���Ӵܾ� ���������� �ż���  */
	
	public static void main(String[] args) {

		int choice = startMenu();
		
		switch(choice) {
		case 1: //�ʱ�
			easyLevel();
			break;
		case 2: //�߱�
			intermediateLevel();
			break;
		case 3: //��� 
			advancedLevel();
			break;
		}

	}
	
	//0. ���� ���� �޴� �Է�ȭ�� 
	static int startMenu() {
		String username="minhee"; //�α��� ���������� �Է°� ��������  
		System.out.println(username+"�� ȯ���մϴ�*^^* ");
		System.out.println("������ ���̵��� �������ּ���. ");
		System.out.println("1) �ʱ� 2) �߱� 3) ���");
				
		//������� �޴��Է� 
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		return choice;
	}
	
	//1. �ʱް��� 
	static void easyLevel() {
		System.out.println("�ʱް����� �ǽ��մϴ�. ");
		
		String correctAnswer = "ant";
		int tryCnt = 0;
		
		while(tryCnt<6) {
			System.out.println("�� �ڸ� ����ܾ �����ּ���. ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			
			if(answer.length()==3 && answer.equals(correctAnswer)) {
				System.out.println("����� õ�籺��! �����Դϴ�!!!");
				break;
			}else if (answer.length()==3 && !(answer.equals(correctAnswer))){
				System.out.println("�ٸ� ��ü�� �Ϻκ��� ������ϴ�. ");
				tryCnt++;
				System.out.println("���� Ƚ��: "+(6-tryCnt));
			}else { //�Էµ� �ܾ �� �ڸ����� �ƴ� ��� 
				System.out.println("�ùٸ� �ܾ �Է����ּ���. ");
			}
		}
		System.out.println("������ ����˴ϴ�.");
	}
	
	//2. �߱ް��� 
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
	
	//3. ��ް��� 
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
	
	//��� ����� 
	void deleteHangMan() {
		
		
	}
	
	//���Ӵܾ� ���������� 
	void randomWord() {
		
	}

}
