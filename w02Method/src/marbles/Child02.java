package marbles;

public class Child02 {
	int numOfBead = 9;
	
	public void numOfLostBead(Child01 ch1, int n) {
		numOfBead = numOfBead - ch1.numOfPlusBalance(n);
	}
	public void numOfAddedBead(Child01 ch1, int n) {
		numOfBead = numOfBead + ch1.numOfMinusBalance(n);
	}
	public void getChild02Balance() {
		System.out.println("어린이 2의 보유 구슬은"+numOfBead);	
	}
}
