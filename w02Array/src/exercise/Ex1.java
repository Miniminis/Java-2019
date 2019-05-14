package exercise;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner number = new Scanner(System.in);
		System.out.println("임의의 자연수 5개를 차례로 입력해주세요");
		for (int i=0; i<arr.length; i++) {
			arr[i] = number.nextInt();
		}
		
		System.out.println("입력해주신 숫자 중 최대값은: "+Ex1.maxValue(arr)+" 입니다.");
		System.out.println("입력해주신 숫자 중 최소값은: "+Ex1.miniValue(arr)+" 입니다.");

	}
	
	public static int miniValue(int[] arr) {
		int minNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<minNum) {
				minNum = arr[i];
			}
		}
		return minNum;
		
	}

	public static int maxValue(int[] arr) {
		int maxNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
}
