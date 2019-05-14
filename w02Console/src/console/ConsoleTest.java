package console;

public class ConsoleTest {

	public static void main(String[] args) {
		//ppt example
//		Friend f1 = new Friend("minhee");
//		System.out.println(f1);
		
		//toString method check
		String friend = "Hi, this is your friend!";
		//1) 참조변수로 주솟값 받아서 처리하기
		String friend2 = friend.toString();
		System.out.println(friend2);
		//2) 직접 처리하기
		System.out.println(friend.toString());
		
		//toCharArray check
		char[] s = "Hi, this is your friend!".toCharArray();
		System.out.println(s[1]);
		
	}

}

//class Friend {
//	String myName;
//	public Friend(String name) {
//		myName = name;
//	}
//	public String toString() {
//		return "my name is "+myName+"!";
//	}
//}
