package exercise;

public class Ex2addOneDArr {
	
	public static void addOneDArr(int[][] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			Ex2addOneDArr.addOneDarr(arr[i], add);
			
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j]+=add;
//			}
		}
	}
	
	public static void addOneDarr(int[] arr, int add) {
		for (int i=0; i<arr.length; i++) {
			arr[i]+= add;
		}
	}
}
