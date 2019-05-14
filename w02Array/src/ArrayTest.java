
public class ArrayTest {

	public static void main(String[] args) {
		int[] score = new int[7]; //7개의 변수를 저장하는 배열의 선언+생성! 
//		int score1, score 2, score3, score4, score5, score6, socre7; 
		System.out.println(score[0]);
		
		//length 변수: 배열의 참조변수.lenth: 변수의 개수를 알려주는 변수임.
		for(int i=0; i<score.length; i++) {
			score[i] = 10;
		}
		System.out.println(score[0]);

	}

}
