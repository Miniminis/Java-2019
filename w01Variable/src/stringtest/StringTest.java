package stringtest;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "My Java"; //가장 흔하고 빈번하게 사용되는 경우.
		String str2 = "My Java";
		String str3 = "Your Java";
		String str4 = new String("My Java"); // 객체의 주소값이 달라진다. 
		
		boolean strCheck =str1.equals(str4);
		if(strCheck) {
			System.out.println("문자열이 맞다.");
		} else {
			System.out.println("문자열이 다르다.");
		}
		
		if(str1==str2) {
			System.out.println("참조하는 값이 같다.");
		}
		
		if(str1==str3) {
			System.out.println("참조하는 값이 같다. ");
		} else {
			System.out.println("참조하는 값이 다르다. ");
		}
		
		if(str1==str4 ) {
			System.out.println("참조하는 값이 같다. ");
		} else {
			System.out.println("참조하는 값이 다르다. ");
		}
	}
}
