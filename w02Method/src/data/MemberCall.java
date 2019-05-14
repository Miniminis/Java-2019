package data;

public class MemberCall {
	int iv = 10;
	static int cv = 140;
	
	static void staticMethod() {
//		iv = 700;
		cv = 780;
		
		MemberCall c = new MemberCall();
		c.iv = 1700;
	}
	void instanceMethod() {
		iv = 780;
		cv = 300;
	}
	static void staticMethod2() {
//		instanceMethod(); 
		staticMethod();
		
		MemberCall c = new MemberCall();
		c.instanceMethod();
	}
}
