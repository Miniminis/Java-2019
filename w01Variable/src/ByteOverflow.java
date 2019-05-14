
public class ByteOverflow {

	public static void main(String[] args) {
		byte b = 0;    //byte형 변수를 b로 선언하고 0으로 초기화 
		int i = 0;
		
//		변수 초기화, 반복의 조건, 증가식(탈출의 조건)
		for(int x = 0; x <=270; x++) {
//			++증가 연산자의 경우는 따로 형변환 하지x
//			b = (byte)(b + 1);
			System.out.print(b++); 
			System.out.print('\t'); 
			System.out.println(i++); 

		}
	}

}
