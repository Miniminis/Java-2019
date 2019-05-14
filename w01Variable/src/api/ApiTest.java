package api;

public class ApiTest {
	public static void main(String[] args) {
		String m = "minhee";
		String i = "ukpyo";
		boolean t = m.contentEquals(i);
		System.out.println(t);
		System.out.println(m.isEmpty());
		System.out.println(i.length());
		System.out.println(i.replace('k', 'g'));
		
		String s = "s.tri.ng";
		System.out.println(s.split(s));
	}
}
