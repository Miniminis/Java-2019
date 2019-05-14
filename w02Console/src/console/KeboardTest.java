package console;

import java.util.Scanner;

public class KeboardTest {

	public static void main(String[] args) {
		//원래는 java.util.Scanner sc 로 길게 호출을 했어야 했다. 
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = sc.nextInt(); //커서 대기 - 사용자 입력 숫자1 //
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = sc.nextInt(); //사용자 입력 숫자2
		System.out.println("마지막 숫자를 입력해주세요");
		int num3 = sc.nextInt(); //사용자 입력 숫자3
		
		int sum = num1+num2+num3; //사용자가 입력한 3개의 숫자를 더하는 과정
		
		System.out.printf("입력된 정수 %d, %d, %d, 의 합은 %d 입니다.",num1, num2, num3, sum);

	}

}

