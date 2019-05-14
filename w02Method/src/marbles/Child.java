package marbles;

public class Child {
	int numOfMarble; //초기 구슬의 개수 
	String name; //플레이어이름 
	
	// 초기 보유 구슬 개수를 입력할 수 있는 생성자
	Child(String name, int numOfMarble) {
		this.name = name;
		this.numOfMarble = numOfMarble;
	}
	
	//게임의 승리 
	//게임 상대자 
	public void WinPlay(int marble, Child child) {
//		this.numOfMarble = this.numOfMarble + marble;
		win(marble);
		child.lose(marble);
		
	}
	
	//구슬의 증가
	void win(int num) {
		numOfMarble = numOfMarble + num;
	}
	
	//구슬의 감소
	void lose(int num) {
		numOfMarble = numOfMarble - num;
	}
	
	//각 어린이의 구슬 보유개수 출력
	//문자열 데이터도 같이 저장되는 효과가 있다! 
	void getNumOfMarble() {
		System.out.println(name+" 어린이의 보유 구슬 개수는 "+numOfMarble+"입니다.");
	}
	
}
