
public class ArrayAndMethods2 {
	public static int[] addAllArray(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+= num;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 8, 9, 10};
		int[] ref;
		ref = addAllArray(arr, 10);
		if(arr==ref) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		for(int i=0; i<ref.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(ref[i]+" ");
		}
		
	}
}
