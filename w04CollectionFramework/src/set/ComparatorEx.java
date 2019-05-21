package collectionFramework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>(new PersonComparator());
		tset.add(new Person("minhee", 25));
		tset.add(new Person("yoojin", 30));
		tset.add(new Person("pokemon", 47));
		
		Iterator<Person> itr = tset.iterator();
		while(itr.hasNext()) {
			itr.next().showData();
		}

	}

}

class Person implements Comparable<Person> {
	int age;
	String name;
	public Person(String name, int age) {
		this.name = name; 
		this.age = age; 
	}
	public void showData() {
		System.out.println(name +","+ age);
	}
	
	public int compareTo(Person p) {
		if(p.age<age) {
			return 1;
		}else if(p.age>age) {
			return -1;
		}else {
			return 0;
		}
	}
}

//Comparator<T> �� Comparable<T>�� compareTo�� ������. 
//Person class�� �̹� TreeSet�� ���� ���� ������ ���õǾ�������, 
//Comparator ���� �ν��Ͻ��� �����Ͽ� ���ο� ������ �����Ͽ���. 
class PersonComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}
}
