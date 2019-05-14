package exercise;

public class Ex3Class {
	
	public static int[][] changeArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if (i+1 == arr.length) {
					arr[i][j] = arr[0][j];
				} else {
					arr[i][j] = arr[i+1][j];
				}
			}
		}
		return arr;
	}

}
