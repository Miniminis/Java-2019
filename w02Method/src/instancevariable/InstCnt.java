package instancevariable;

public class InstCnt {
	static int instNum = 100;
	public InstCnt() {
		instNum = instNum+1;
		System.out.println(instNum);
	}
}
