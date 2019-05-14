package console;

import java.util.Scanner;

public class ScanningMethods {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("당신의 이름을 적어주세요.");
		String name = keyboard.nextLine();
		System.out.println("당신은 스파게티를 좋아한다는데, 진실입니까?");
		boolean isTrue = keyboard.nextBoolean();
		if (isTrue == true) {
			System.out.println("오, 저도 좋아하는데!");
		} else {
			System.out.println("이런 아니었군요 ㅠㅠㅠ");
		}
		System.out.println("당신과 동생의 키는 몇입니까?");
		double n1 = keyboard.nextDouble();
		double n2 = keyboard.nextDouble();
		double diff = n1-n2;
		if(diff>0) {
			//printf를 써서 문자열 중간에 double 형 값을 삽입해주었다. 
			System.out.printf("오 당신이 동생보다 키가 %f 만큼 크군요! ",diff);
		} else {
			System.out.printf("당신이 동생보다 키가 %f 만큼 작군요!",-diff);
		}
	}

}
