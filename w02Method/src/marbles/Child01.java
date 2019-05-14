package marbles;

public class Child01 {
	int numOfBead = 15;
	
	public int numOfPlusBalance(int n) {
		int numget = n;
		numOfBead = numOfBead +numget;
		return numget;
	}
	public int numOfMinusBalance(int n) {
		int numlost = n;
		numOfBead = numOfBead - numlost;
		return numlost;
	}
	public void getChild01Balance() {
		System.out.println("어린이 1의 보유 구슬은"+numOfBead);
		
	}

}
