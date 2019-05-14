package marbles;

public class InstanceMain {

	public static void main(String[] args) {
//		Child01 child1 = new Child01();
//		Child02 child2 = new Child02();
		//수정코드 
		// 어린이 1, 2의 초기 구슬 개수를 입력할 수 있는 생성자 이용
		// 2차 수정: 플레이어의 이름을 받을 수 있게 생성자 수정
		Child child1 = new Child("민수", 15);
		Child child2 = new Child("민희", 9);
		
//		//1차게임 결과
//		child2.numOfLostBead(child1, 2);
//		//2차게임 결과
//		child2.numOfAddedBead(child1, 7);
		
		//수정코드 
		// 1차게임 결과
		child1.WinPlay(2, child2);
		child2.WinPlay(7, child1);

		System.out.println("두 어린이의 현재 보유구슬 상황: ");
//		child1.getChild01Balance();
//		child2.getChild02Balance();
		
		//수정코드 
//		System.out.println(child1.numOfMarble);
//		System.out.println(child2.numOfMarble);
		
		//2차 수정
		child1.getNumOfMarble();
		child2.getNumOfMarble();
	}

}
