package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetData {

	public static void main(String[] args) {
		//HashSet
		hashTest();
		System.out.println("====================");
		hashTest2();
		System.out.println("====================");
		hashTest3();
		System.out.println("====================");
		
		//TreeSet
		//compareTo 기준: string 글자길이
		//--> 글자길이를 오름차순으로 정렬한 결과를 보여줌 
		TreeSet<MyString> mtree = new TreeSet<MyString>();
		mtree.add(new MyString("java"));
		mtree.add(new MyString("python"));
		mtree.add(new MyString("c+++++"));
		mtree.add(new MyString("javascript"));
		
		Iterator<MyString> itr = mtree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

//HashSet<E>
	// Hashset 타입의 데이터는 중복을 허용하지 않는다.
	public static void hashTest() {

		HashSet<String> hashset = new HashSet<String>();

		hashset.add("minhee");
		hashset.add("is");
		hashset.add("babo");
		hashset.add("minhee");

		Iterator<String> itr = hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	// 동일 인스턴스의 판단 기준
	public static void hashTest2() {
		HashSet<Integer> intHash = new HashSet<Integer>();

		intHash.add(10);
		intHash.add(20);
		intHash.add(20); // 중복 데이터이므로 저장되지 않는다.

		System.out.println("저장된 데이터의 수: " + intHash.size());

		Iterator<Integer> itr = intHash.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
	public static void hashTest3() {

		HashSet<SimpleNumber> hset = new HashSet<SimpleNumber>();
		
		hset.add(new SimpleNumber(10));
		hset.add(new SimpleNumber(20));
		hset.add(new SimpleNumber(20));
		
		System.out.println(hset.size());
		
		Iterator <SimpleNumber> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

//HashSet에서 hashCode() 및 equals() 오버라이딩 
class SimpleNumber {
	int num;

	public SimpleNumber(int n) {
		this.num = n;
	}

	
	@Override public int hashCode() { return num%3; } 	 

	@Override
	public boolean equals(Object obj) {
		SimpleNumber snum = (SimpleNumber) obj;
		if (num == snum.num) {
			return true;
		} else {
			return false;
		}
	}
	
	//해쉬 알고리즘을 정의하지 않고 저장된 메서드를 불러오는 방법 
	/*
	 * public int hashCode() { return Objects.hash(num); }
	 */
}


//TreeSet<E>
class MyString implements Comparable<MyString> {
	String str;
	public MyString(String str) {
		this.str=str;
	}
	public int getLength() {
		return str.length();
	}
	
	public int compareTo(MyString mstr) {
		int result = 0;
		
		if(getLength()>mstr.getLength()) {
			result = 1;
		}else {
			result = -1; 
		}
		return result;
	}
	
	public String toString() {
		return str;
	}
}

















