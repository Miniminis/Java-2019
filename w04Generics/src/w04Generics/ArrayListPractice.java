package w04Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		//일반적인 배열 
		//사이즈가 정해져있어서 추가가 불가하다. 
		int[] arr = new int[2];
		int num = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = ++num; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		//ArrayList를 이용한 배열 
		//처음부터 사이즈가 정해져있지 않기 때문에 추가가 가능하다. 
		ArrayList al = new ArrayList(); 
		al.add(3);
		al.add(5);
		al.add(100);
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();

		//만약 ArrayList 의 for문을 아래와 같이 바꾼다면 컴파일 에러가 발생한다. 
		//al.get(i)는 현재 Object type의 인스턴스이기 때문이다. 
		//따라서 String 형으로 형변환을 해준 뒤에 출력을 해주어야 에러가 발생하지 않는다. 
		for(int i=0; i<al.size(); i++) {
			int val = (int)al.get(i); 
			System.out.print(val+ " ");
		}
		
		System.out.println();

		//제너릭 방식을 사용하면 아래와 같다. 
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(100);
		alist.add(300);
		alist.add(0, 200);
		//alist.clear();
		
		for(int i=0; i<alist.size(); i++) {
			Integer val = alist.get(i);
			System.out.print(val+ " ");
		}
		System.out.println();

		boolean s = alist.contains(100);
		System.out.println(s);
		
		Integer index = alist.get(0);
		System.out.println(index);
		
		boolean q = alist.isEmpty();
		System.out.println(q);
		
		//iternator 
		Iterator<Integer> iterator = alist.iterator();
		for(int i=0; i<alist.size(); i++) {
			System.out.print(alist.get(i)+" ");
		}
	}

}
