package api;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "990929-1010123";
		
		//String Class 이용
		System.out.println(str.replace("-", ""));
		
		//StringBuilder Class 이용
		System.out.println(new StringBuilder(str).deleteCharAt(6));
		
		//StringBuffer Class 이용 
		System.out.println(new StringBuffer(str).deleteCharAt(6));
	}

}
