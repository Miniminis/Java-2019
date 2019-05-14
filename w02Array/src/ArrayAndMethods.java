
public class ArrayAndMethods {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] ref;
		
		ref = addAllArray(arr, 7);
		if(arr==ref) {
			System.out.println("동일배열참조");
		} else {
			System.out.println("다른배열참조");
		}
		
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	//배열 받아서 + 각 배열 요소의 값을 입력 수만큼 증가 + 다시 해당 배열을 반환
	public static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i<ar.length; i++) {
			ar[i]+=addVal;
		}
		return ar;
	}
}
