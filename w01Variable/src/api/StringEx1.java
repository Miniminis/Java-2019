package api;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		//String Class 이용 
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
				
		
//		StringBuilder Class 이용
		System.out.println(new StringBuilder(str).reverse());
		
		//StringBuffer Class 이용
		System.out.println(new StringBuffer(str).reverse());
		
//		//StringBuffer 변수사용
//		StringBuffer str = new StringBuffer("ABCDEFGHIJKLMN");
//		str.reverse();
//		System.out.println(str);
		
		
		
	}
}
