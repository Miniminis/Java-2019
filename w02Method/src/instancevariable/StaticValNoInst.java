package instancevariable;

public class StaticValNoInst {
	public static void main(String[] args) {
		System.out.println(InstCnt.instNum);
		InstCnt.instNum = InstCnt.instNum - 35;
		System.out.println(InstCnt.instNum);
	}
}
